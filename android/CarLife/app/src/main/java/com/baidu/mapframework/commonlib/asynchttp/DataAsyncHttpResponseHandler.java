package com.baidu.mapframework.commonlib.asynchttp;

import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    protected static final int PROGRESS_DATA_MESSAGE = 7;
    /* renamed from: a */
    private static final String f18850a = "DataAsyncHttpRH";

    public static byte[] copyOfRange(byte[] original, int start, int end) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NullPointerException {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int originalLength = original.length;
        if (start < 0 || start > originalLength) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int resultLength = end - start;
        byte[] result = new byte[resultLength];
        System.arraycopy(original, start, result, 0, Math.min(resultLength, originalLength - start));
        return result;
    }

    public void onProgressData(byte[] responseBody) {
        AsyncHttpClient.log.mo2623d(f18850a, "onProgressData(byte[]) was not overriden, but callback was received");
    }

    public final void sendProgressDataMessage(byte[] responseBytes) {
        sendMessage(obtainMessage(7, new Object[]{responseBytes}));
    }

    protected void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case 7:
                Object[] response = (Object[]) message.obj;
                if (response == null || response.length < 1) {
                    AsyncHttpClient.log.mo2625e(f18850a, "PROGRESS_DATA_MESSAGE didn't got enough params");
                    return;
                }
                try {
                    onProgressData((byte[]) response[0]);
                    return;
                } catch (Throwable t) {
                    AsyncHttpClient.log.mo2626e(f18850a, "custom onProgressData contains an error", t);
                    return;
                }
            default:
                return;
        }
    }

    byte[] getResponseData(HttpEntity entity) throws IOException {
        byte[] responseBody = null;
        if (entity != null) {
            InputStream instream = entity.getContent();
            if (instream != null) {
                long contentLength = entity.getContentLength();
                if (contentLength > 2147483647L) {
                    throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
                }
                if (contentLength < 0) {
                    contentLength = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                }
                try {
                    ByteArrayBuffer buffer = new ByteArrayBuffer((int) contentLength);
                    byte[] tmp = new byte[4096];
                    while (true) {
                        int l = instream.read(tmp);
                        if (l == -1 || Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        buffer.append(tmp, 0, l);
                        sendProgressDataMessage(copyOfRange(tmp, 0, l));
                        sendProgressMessage((long) 0, contentLength);
                    }
                    AsyncHttpClient.silentCloseInputStream(instream);
                    responseBody = buffer.toByteArray();
                } catch (OutOfMemoryError e) {
                    System.gc();
                    throw new IOException("File too large to fit into available memory");
                } catch (Throwable th) {
                    AsyncHttpClient.silentCloseInputStream(instream);
                }
            }
        }
        return responseBody;
    }
}
