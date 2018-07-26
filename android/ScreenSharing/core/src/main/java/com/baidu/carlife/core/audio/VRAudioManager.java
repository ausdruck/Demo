package com.baidu.carlife.core.audio;

import com.baidu.carlife.core.CommonParams;
import com.baidu.carlife.core.LogUtil;
import com.baidu.carlife.core.connect.ConnectManager;
import com.baidu.carlife.core.connect.config.AESManager;
import com.baidu.carlife.core.connect.config.EncryptSetupManager;

/* compiled from: VRAudioManager */
/* renamed from: com.baidu.carlife.core.audio.q */
public class VRAudioManager extends AudioSourceManagerBase {
    /* renamed from: a */
    private static final String Tag = (AudioUtil.AUDIO + VRAudioManager.class.getSimpleName());
    /* renamed from: b */
    private PCMPackageHead mPCMPackageHead = new PCMPackageHead();
    /* renamed from: c */
    private byte[] f3147c = new byte[120];
    /* renamed from: d */
    private int f3148d;
    /* renamed from: e */
    private int f3149e;
    /* renamed from: f */
    private Pair mPair = new Pair();
    /* renamed from: g */
    private ArrayAdd mArrayAdd = new ArrayAdd();
    /* renamed from: h */
    private AESManager mAESManager = new AESManager();

    public VRAudioManager() {
        AudioUtil.newInstance();
        this.f3149e = 12;
    }

    /* renamed from: a */
    public synchronized void send(int sampleRate, int channelConfig, int sampleFormat) {
        if (AudioUtil.getIs()) {
            int revisedSampleRate;
            int revisedChannelConfig;
            int revisedFormat;
            LogUtil.d(Tag, "sampleRate: " + sampleRate + " channelConfig: " + channelConfig + " sampleFormat: " + sampleFormat);
            if (sampleRate < 4000 || sampleRate > 48000) {
                revisedSampleRate = 16000;
            } else {
                revisedSampleRate = sampleRate;
            }
            if (channelConfig == 1 && channelConfig == 2) {
                revisedChannelConfig = channelConfig;
            } else {
                revisedChannelConfig = 1;
            }
            if (sampleFormat == 8 && sampleFormat == 16) {
                revisedFormat = sampleFormat;
            } else {
                revisedFormat = 16;
            }
            this.mPCMPackageHead.m4053c(CommonParams.bz);
            this.f3148d = this.mPCMPackageHead.encryptTTSLength(revisedSampleRate, revisedChannelConfig, revisedFormat, this.f3147c);
            this.mPCMPackageHead.m4047a(this.f3148d);
            System.arraycopy(this.mPCMPackageHead.m4048a(), 0, this.f3147c, 0, this.f3149e);
            writeVR(this.f3147c, this.f3149e + this.f3148d);
        }
    }

    /* renamed from: a */
    public synchronized void send() {
        if (AudioUtil.getIs()) {
            LogUtil.d(Tag, "VR stop");
            this.mPCMPackageHead.m4053c(CommonParams.bB);
            this.mPCMPackageHead.m4047a(0);
            writeVR(this.mPCMPackageHead.m4048a(), this.mPCMPackageHead.m4049b());
        }
    }

    /* renamed from: a */
    public synchronized void send(byte[] data, int len) {
        byte[] sendData = data;
        int sendLen = len;
        if (EncryptSetupManager.newInstance().getFlag() && len > 0) {
            sendData = this.mAESManager.encrypt(data, len);
            if (sendData == null) {
                LogUtil.e(Tag, "encrypt failed!");
            } else {
                sendLen = sendData.length;
            }
        }
        if (AudioUtil.getIs()) {
            LogUtil.d(Tag, "VR write " + sendLen);
            this.mPCMPackageHead.m4053c(CommonParams.bA);
            this.mPCMPackageHead.m4047a(sendLen);
            this.mPCMPackageHead.m4052c();
            this.mArrayAdd.merge(this.mPCMPackageHead.m4048a(), this.f3149e, sendData, sendLen, this.mPair);
            writeVR(this.mPair.getData(), this.mPair.getSize());
        }
    }

    /* renamed from: b */
    private int writeVR(byte[] data, int size) {
        if (AudioUtil.newInstance().isBlueToothMode()) {
            return -1;
        }
        return ConnectManager.newInstance().writeVR(data, size);
    }
}
