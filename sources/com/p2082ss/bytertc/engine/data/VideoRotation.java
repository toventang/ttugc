package com.p2082ss.bytertc.engine.data;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.VideoRotation */
public enum VideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(LiveFeedRefreshTimeSetting.DEFAULT),
    VIDEO_ROTATION_270(270);
    
    private int value;

    public final int value() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(100990);
    }

    public static VideoRotation fromId(int i) {
        VideoRotation[] values = values();
        for (VideoRotation videoRotation : values) {
            if (videoRotation.value() == i) {
                return videoRotation;
            }
        }
        return null;
    }

    private VideoRotation(int i) {
        this.value = i;
    }
}
