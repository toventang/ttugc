package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRResultElement {
    private long bitrate;
    private int cacheTime;
    private int mediaType;
    private int seconds;
    private int useSR;

    static {
        Covode.recordClassIndex(27584);
    }

    public long getBitrate() {
        return this.bitrate;
    }

    public int getCacheTime() {
        return this.cacheTime;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getUseSR() {
        return this.useSR;
    }

    public ABRResultElement(long j, int i, int i2, int i3) {
        this.bitrate = j;
        this.seconds = i;
        this.mediaType = i2;
        this.cacheTime = i3;
    }

    public ABRResultElement(long j, int i, int i2, int i3, int i4) {
        this.bitrate = j;
        this.seconds = i;
        this.mediaType = i2;
        this.cacheTime = i3;
        this.useSR = i4;
    }
}
