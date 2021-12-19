package com.p2082ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.video.VideoPreset */
public class VideoPreset {
    private int bandwidth;
    private int fps;
    private int height;
    private int width;

    static {
        Covode.recordClassIndex(101187);
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public VideoPreset(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bandwidth = i4;
    }
}
