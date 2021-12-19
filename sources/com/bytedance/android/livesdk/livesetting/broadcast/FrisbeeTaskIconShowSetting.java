package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class FrisbeeTaskIconShowSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final FrisbeeTaskIconShowSetting INSTANCE = new FrisbeeTaskIconShowSetting();

    private FrisbeeTaskIconShowSetting() {
    }

    static {
        Covode.recordClassIndex(10275);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(FrisbeeTaskIconShowSetting.class);
    }
}
