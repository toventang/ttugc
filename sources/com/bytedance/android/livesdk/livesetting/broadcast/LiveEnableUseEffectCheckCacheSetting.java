package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableUseEffectCheckCacheSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveEnableUseEffectCheckCacheSetting INSTANCE = new LiveEnableUseEffectCheckCacheSetting();

    private LiveEnableUseEffectCheckCacheSetting() {
    }

    static {
        Covode.recordClassIndex(10301);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableUseEffectCheckCacheSetting.class);
    }
}
