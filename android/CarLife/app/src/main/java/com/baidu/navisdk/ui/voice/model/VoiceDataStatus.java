package com.baidu.navisdk.ui.voice.model;

public class VoiceDataStatus {
    public static int VOICE_DATA_DOWN_DOWNING = 1;
    public static int VOICE_DATA_DOWN_END = 2;
    public static int VOICE_DATA_DOWN_INVALID = -1;
    public static int VOICE_DATA_DOWN_UNSTART = 0;
    public int status;
    public long unDwonloadSize;
    public long unTotalSize;
}
