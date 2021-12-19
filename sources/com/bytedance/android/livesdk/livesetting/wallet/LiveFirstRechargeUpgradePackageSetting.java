package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9899p;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeUpgradePackageSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9899p DEFAULT = new C9899p();
    public static final LiveFirstRechargeUpgradePackageSetting INSTANCE = new LiveFirstRechargeUpgradePackageSetting();

    private LiveFirstRechargeUpgradePackageSetting() {
    }

    public final C9899p getDEFAULT() {
        return DEFAULT;
    }

    public final C9899p getValue() {
        C9899p pVar = (C9899p) SettingsManager.INSTANCE.getValueSafely(LiveFirstRechargeUpgradePackageSetting.class);
        if (pVar == null) {
            return DEFAULT;
        }
        return pVar;
    }

    static {
        Covode.recordClassIndex(10751);
    }
}
