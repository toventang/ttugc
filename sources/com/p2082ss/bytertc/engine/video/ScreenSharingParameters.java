package com.p2082ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.video.ScreenSharingParameters */
public class ScreenSharingParameters {
    public int bitrate = -1;
    public int frameRate = 15;
    public int maxHeight;
    public int maxWidth;

    static {
        Covode.recordClassIndex(101183);
    }

    public ScreenSharingParameters() {
    }

    public ScreenSharingParameters(int i, int i2, int i3, int i4) {
        this.maxHeight = i2;
        this.maxWidth = i;
        this.frameRate = i3;
        this.bitrate = i4;
    }
}
