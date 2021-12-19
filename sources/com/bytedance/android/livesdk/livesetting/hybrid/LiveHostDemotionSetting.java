package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHostDemotionSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHostDemotionSetting INSTANCE = new LiveHostDemotionSetting();

    private LiveHostDemotionSetting() {
    }

    static {
        Covode.recordClassIndex(10456);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHostDemotionSetting.class);
    }
}
