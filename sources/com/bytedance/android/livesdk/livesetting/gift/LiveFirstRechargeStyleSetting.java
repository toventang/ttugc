package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeStyleSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveFirstRechargeStyleSetting INSTANCE = new LiveFirstRechargeStyleSetting();

    private LiveFirstRechargeStyleSetting() {
    }

    static {
        Covode.recordClassIndex(10406);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFirstRechargeStyleSetting.class);
    }
}
