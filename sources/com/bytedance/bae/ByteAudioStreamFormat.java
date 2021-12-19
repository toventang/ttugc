package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public class ByteAudioStreamFormat {
    public int bitRateBps;
    public int channelNum;
    public int codecType;
    public int frameSizeMs = 20;
    public int sampleRate;

    static {
        Covode.recordClassIndex(14992);
    }

    public int getBitRateBps() {
        return this.bitRateBps;
    }

    public int getChannelNum() {
        return this.channelNum;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public int getFrameSizeMs() {
        return this.frameSizeMs;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setBitRateBps(int i) {
        this.bitRateBps = i;
    }

    public void setChannelNum(int i) {
        this.channelNum = i;
    }

    public void setFrameSizeMs(int i) {
        this.frameSizeMs = i;
    }

    public void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public void setCodecType(int i) {
        if (i < 10000 || i > 10006) {
            this.codecType = 0;
        } else {
            this.codecType = i;
        }
    }

    private static ByteAudioStreamFormat create(int i, int i2, int i3, int i4) {
        return new ByteAudioStreamFormat(i, i2, i3, i4);
    }

    public ByteAudioStreamFormat(int i, int i2, int i3, int i4) {
        this.sampleRate = i;
        this.channelNum = i2;
        this.codecType = i3;
        this.bitRateBps = i4;
    }
}
