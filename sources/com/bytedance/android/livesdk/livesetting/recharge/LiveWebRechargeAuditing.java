package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveWebRechargeAuditing {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveWebRechargeAuditing INSTANCE = new LiveWebRechargeAuditing();

    private LiveWebRechargeAuditing() {
    }

    static {
        Covode.recordClassIndex(10713);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWebRechargeAuditing.class);
    }
}
