package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftFluencyOptSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveGiftFluencyOptSetting INSTANCE = new LiveGiftFluencyOptSetting();

    private LiveGiftFluencyOptSetting() {
    }

    static {
        Covode.recordClassIndex(10649);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftFluencyOptSetting.class);
    }
}
