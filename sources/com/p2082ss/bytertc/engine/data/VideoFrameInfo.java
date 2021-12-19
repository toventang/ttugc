package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.VideoFrameInfo */
public class VideoFrameInfo {
    private int height;
    public VideoRotation rotation = VideoRotation.VIDEO_ROTATION_0;
    private int width;

    static {
        Covode.recordClassIndex(100989);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "VideoFrameInfo{width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + '}';
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public VideoFrameInfo(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.rotation = VideoRotation.fromId(i3);
    }
}
