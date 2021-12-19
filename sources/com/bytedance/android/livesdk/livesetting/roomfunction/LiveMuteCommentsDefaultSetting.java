package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMuteCommentsDefaultSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 300;
    public static final LiveMuteCommentsDefaultSetting INSTANCE = new LiveMuteCommentsDefaultSetting();

    private LiveMuteCommentsDefaultSetting() {
    }

    static {
        Covode.recordClassIndex(10728);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveMuteCommentsDefaultSetting.class);
    }
}
