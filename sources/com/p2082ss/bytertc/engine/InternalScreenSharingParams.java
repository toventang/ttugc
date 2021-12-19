package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.video.ScreenSharingParameters;

/* renamed from: com.ss.bytertc.engine.InternalScreenSharingParams */
public class InternalScreenSharingParams {
    public int bitrate = -1;
    public int frameRate = 15;
    public int maxHeight;
    public int maxWidth;

    static {
        Covode.recordClassIndex(100902);
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.maxHeight;
    }

    public int getWidth() {
        return this.maxWidth;
    }

    public InternalScreenSharingParams(ScreenSharingParameters screenSharingParameters) {
        if (screenSharingParameters != null) {
            this.maxHeight = screenSharingParameters.maxHeight;
            this.maxWidth = screenSharingParameters.maxWidth;
            this.frameRate = screenSharingParameters.frameRate;
            this.bitrate = screenSharingParameters.bitrate;
        }
    }

    public InternalScreenSharingParams(int i, int i2, int i3, int i4) {
        this.maxHeight = i2;
        this.maxWidth = i;
        this.frameRate = i3;
        this.bitrate = i4;
    }
}
