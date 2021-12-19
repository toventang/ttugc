package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class LiveFollowFeedDrawLoop {
    @AbstractC27891c(mo46611a = "loop_enable")
    private boolean enable;
    @AbstractC27891c(mo46611a = "threshold")
    private int threshold;

    static {
        Covode.recordClassIndex(10228);
    }

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public static LiveFollowFeedDrawLoop getDefault() {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = new LiveFollowFeedDrawLoop();
        liveFollowFeedDrawLoop.enable = false;
        liveFollowFeedDrawLoop.threshold = 3;
        return liveFollowFeedDrawLoop;
    }
}
