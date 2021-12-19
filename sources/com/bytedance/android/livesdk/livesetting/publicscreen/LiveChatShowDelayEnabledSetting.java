package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveChatShowDelayEnabledSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveChatShowDelayEnabledSetting INSTANCE = new LiveChatShowDelayEnabledSetting();

    private LiveChatShowDelayEnabledSetting() {
    }

    static {
        Covode.recordClassIndex(10673);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveChatShowDelayEnabledSetting.class);
    }
}
