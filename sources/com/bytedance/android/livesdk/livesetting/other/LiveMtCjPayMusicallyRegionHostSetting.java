package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtCjPayMusicallyRegionHostSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveMtCjPayMusicallyRegionHostSetting INSTANCE = new LiveMtCjPayMusicallyRegionHostSetting();

    private LiveMtCjPayMusicallyRegionHostSetting() {
    }

    static {
        Covode.recordClassIndex(10593);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMtCjPayMusicallyRegionHostSetting.class);
    }
}
