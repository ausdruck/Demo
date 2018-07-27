package me.objectyan.screensharing.core.audio;

import android.media.AudioTrack;
import android.util.Log;

import me.objectyan.screensharing.core.LogUtil;
import me.objectyan.screensharing.core.MsgHandlerCenter;


public class CustomAudioDecoder {

    private static final String Tag = (AudioUtil.AUDIO + CustomAudioDecoder.class.getSimpleName());

    private int mSampleRate;

    private int mChannelConfig;

    private int mReSampleRate;

    private AudioTrack mAudioTrack;

    private int mWeiChatVol = 0;

    private AudioDecoderInterface mMediaCodecDecoder = new MediaCodecDecoder();

    private Pair mPairOne = new Pair();

    private Pair mPairTwo = new Pair();

    private byte[] decoderOut = null;

    private Object mObject = new Object();


    public boolean init(String filePath) {
        synchronized (this.mObject) {
            Log.d(Tag, "init() is called");
            if (this.mMediaCodecDecoder.initialization(filePath, null) == -1) {
                Log.i(Tag, "MediaCodec initialization is failed!");
            } else {
                Log.i(Tag, "wechat initialization is successed!");
            }
        }
        if (8000 != this.mMediaCodecDecoder.getSampleRate()) {
            return false;
        }
        return true;
    }


    public byte[] getDecoderOut() {
        int nCount = 0;
        this.decoderOut = null;
        while (nCount < 5) {
            this.mWeiChatVol = this.mMediaCodecDecoder.changeOutput(this.mPairOne, 0);
            Log.d(Tag, "Get WeChat Vol:" + this.mWeiChatVol);
            if (this.mWeiChatVol > 0) {
                break;
            } else if (-1 == this.mWeiChatVol) {
                try {
                    synchronized (this.mObject) {
                        this.mObject.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                nCount++;
                Log.d(Tag, "MediaCodec Error happen!");
            } else if (this.mWeiChatVol == 0) {
                nCount++;
            }
        }
        if (this.mPairOne.getSize() != this.mWeiChatVol) {
            Log.e(Tag, "Get Audio size Error =" + this.mPairOne.getSize() + "  Return=" + this.mWeiChatVol);
        }
        if (this.mWeiChatVol <= 0) {
            return null;
        }
        this.decoderOut = new byte[(this.mPairOne.getSize() * 2)];
        byte[] dataIn = this.mPairOne.getData();
        Log.d(Tag, "decoder out :" + this.mWeiChatVol);
        for (int i = 0; i < this.mWeiChatVol; i += 2) {
            this.decoderOut[i * 2] = dataIn[i];
            this.decoderOut[(i * 2) + 1] = dataIn[i + 1];
            this.decoderOut[(i * 2) + 2] = dataIn[i];
            this.decoderOut[(i * 2) + 3] = dataIn[i + 1];
        }
        return this.decoderOut;
    }


    public void initAudioTrack() {
        if (createAudioTrack()) {
            ArbitrationModule.newInstance().musicAudioFocus();
            playAudioTrack();
            return;
        }
        Log.d(Tag, "audio Track Init Error!!!");
    }


    public void m3941c() {
        int nCount = 0;
        while (nCount < 8) {
            long lstarttime = System.currentTimeMillis();
            this.mWeiChatVol = this.mMediaCodecDecoder.changeOutput(this.mPairOne, 0);
            Log.d(Tag, "Get WeChat Vol:" + this.mWeiChatVol);
            if (-1 == this.mWeiChatVol) {
                try {
                    synchronized (this.mObject) {
                        this.mObject.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                nCount++;
                Log.d(Tag, "MediaCodec Error happen!");
            } else if (this.mWeiChatVol == 0) {
                nCount++;
            } else {
                if (this.mPairOne.getSize() != this.mWeiChatVol) {
                    Log.e(Tag, "Get Audio size Error =" + this.mPairOne.getSize() + "  Return=" + this.mWeiChatVol);
                }
                nCount = 0;
                this.decoderOut = new byte[(this.mPairOne.getSize() * 2)];
                this.mPairTwo.setSize(this.mPairOne.getSize() * 2);
                this.mPairTwo.setData(this.decoderOut);
                byte[] dataIn = this.mPairOne.getData();
                for (int i = 0; i < this.mWeiChatVol; i += 2) {
                    this.decoderOut[i * 2] = dataIn[i];
                    this.decoderOut[(i * 2) + 1] = dataIn[i + 1];
                    this.decoderOut[(i * 2) + 2] = dataIn[i];
                    this.decoderOut[(i * 2) + 3] = dataIn[i + 1];
                }
                Log.d(Tag, "Use Time :" + (System.currentTimeMillis() - lstarttime));
                writeAudioData();
            }
        }
    }


    public void stop() {
        synchronized (this.mObject) {
            Log.d(Tag, "stop() is called");
            if (this.mAudioTrack == null) {
                return;
            }
            try {
                this.mAudioTrack.stop();
            } catch (IllegalStateException e) {
                MsgHandlerCenter.dispatchMessage(415);
                e.printStackTrace();
            }
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
    }


    public void play() {
        synchronized (this.mObject) {
            ArbitrationModule.newInstance().musicAudioFocus();
            Log.d(Tag, "play() is called");
            if (this.mAudioTrack == null || this.mAudioTrack.getPlayState() == 3) {
                Log.d(Tag, "play music has been triggered");
            } else {
                playAudioTrack();
            }
        }
    }


    private boolean createAudioTrack() {
        int channelConfig;
        this.mSampleRate = this.mMediaCodecDecoder.getSampleRate();
        if (this.mSampleRate == 8000) {
            this.mSampleRate *= 2;
        }
        this.mChannelConfig = this.mMediaCodecDecoder.getChannelConfig();
        this.mReSampleRate = this.mMediaCodecDecoder.getReSampleRate();
        if (this.mAudioTrack != null) {
            this.mAudioTrack.flush();
        }
        if (this.mChannelConfig == 1) {
            channelConfig = 4;
        } else {
            channelConfig = 12;
        }
        Log.d(Tag, "samplerate = " + this.mSampleRate);
        if (this.mSampleRate < 4000 || this.mSampleRate > 48000) {
            this.mAudioTrack = null;
            Log.d(Tag, "4000>sample rate || sample rate>48000: " + this.mSampleRate);
            return false;
        }
        int audioMinBufSizeLocal = AudioTrack.getMinBufferSize(this.mSampleRate, channelConfig, 2);
        Log.d(Tag, "audioMinBufSizeLocal= " + audioMinBufSizeLocal);
        try {
            this.mAudioTrack = new AudioTrack(3, this.mSampleRate, channelConfig, 2, audioMinBufSizeLocal * 2, 1);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            this.mAudioTrack = null;
            Log.d(Tag, "IllegalArgumentException: mAudioTrack =new AudioTrack");
            return false;
        }
    }


    private void playAudioTrack() {
        if (this.mAudioTrack != null) {
            if (this.mAudioTrack.getPlayState() != 3) {
                try {
                    Log.d(Tag, "Play WeChat voice!");
                    this.mAudioTrack.play();
                } catch (IllegalStateException e) {
                    MsgHandlerCenter.dispatchMessage(415);
                    e.printStackTrace();
                }
                synchronized (this.mObject) {
                    this.mObject.notify();
                }
                return;
            }
            Log.d(Tag, "play music has been triggered");
        }
    }


    public void writeAudioData(byte[] pData) {
        int size = pData.length;
        if (size <= 0) {
            Log.e(Tag, "Data size 0!!!");
            return;
        }
        synchronized (this.mObject) {
            if (this.mAudioTrack != null && this.mAudioTrack.getPlayState() == 3) {
                Log.e(Tag, "Trace size:  " + size);
                this.mAudioTrack.write(pData, 0, size);
            }
        }
    }


    public void writeAudioData() {
        int size = this.mPairTwo.getSize();
        if (size <= 0) {
            Log.e(Tag, "Out size 0!!!");
            return;
        }
        synchronized (this.mObject) {
            if (this.mAudioTrack != null && this.mAudioTrack.getPlayState() == 3) {
                Log.e(Tag, "size  " + size);
                this.mAudioTrack.write(this.mPairTwo.getData(), 0, size);
            }
        }
    }


    private void audioWait() {
        synchronized (this.mObject) {
            if (this.mAudioTrack == null || this.mAudioTrack.getPlayState() != 3) {
                try {
                    this.mObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
