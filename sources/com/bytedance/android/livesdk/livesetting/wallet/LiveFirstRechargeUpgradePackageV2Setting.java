package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9901q;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeUpgradePackageV2Setting {
    @Group(isDefault = true, value = "default group")
    private static final C9901q DEFAULT = new C9901q();
    public static final LiveFirstRechargeUpgradePackageV2Setting INSTANCE = new LiveFirstRechargeUpgradePackageV2Setting();

    private LiveFirstRechargeUpgradePackageV2Setting() {
    }

    public final C9901q getDEFAULT() {
        return DEFAULT;
    }

    public final C9901q getValue() {
        C9901q qVar = (C9901q) SettingsManager.INSTANCE.getValueSafely(LiveFirstRechargeUpgradePackageV2Setting.class);
        if (qVar == null) {
            return DEFAULT;
        }
        return qVar;
    }

    static {
        Covode.recordClassIndex(10752);
    }
}
