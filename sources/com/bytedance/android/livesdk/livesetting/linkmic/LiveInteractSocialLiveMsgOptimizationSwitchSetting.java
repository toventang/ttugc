package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractSocialLiveMsgOptimizationSwitchSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveInteractSocialLiveMsgOptimizationSwitchSetting INSTANCE = new LiveInteractSocialLiveMsgOptimizationSwitchSetting();

    private LiveInteractSocialLiveMsgOptimizationSwitchSetting() {
    }

    static {
        Covode.recordClassIndex(10507);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractSocialLiveMsgOptimizationSwitchSetting.class);
    }
}
