package com.p2082ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.video.VideoDimensions */
public class VideoDimensions {
    public int height;
    public int width;

    static {
        Covode.recordClassIndex(101184);
    }

    public VideoDimensions() {
    }

    public VideoDimensions(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
