package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveFollowFeedDrawLoop;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class FollowFeedDrawLoopSetting {
    @Group(isDefault = true, value = "default group")
    private static final LiveFollowFeedDrawLoop DEFAULT;
    public static final FollowFeedDrawLoopSetting INSTANCE = new FollowFeedDrawLoopSetting();

    private FollowFeedDrawLoopSetting() {
    }

    public final LiveFollowFeedDrawLoop getDEFAULT() {
        return DEFAULT;
    }

    public final LiveFollowFeedDrawLoop getValue() {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = (LiveFollowFeedDrawLoop) SettingsManager.INSTANCE.getValueSafely(FollowFeedDrawLoopSetting.class);
        if (liveFollowFeedDrawLoop == null) {
            return DEFAULT;
        }
        return liveFollowFeedDrawLoop;
    }

    static {
        Covode.recordClassIndex(10775);
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = LiveFollowFeedDrawLoop.getDefault();
        C89219l.m154716b(liveFollowFeedDrawLoop, "");
        DEFAULT = liveFollowFeedDrawLoop;
    }
}
