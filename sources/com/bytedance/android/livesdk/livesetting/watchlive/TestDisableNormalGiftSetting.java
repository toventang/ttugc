package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;

public final class TestDisableNormalGiftSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisableNormalGiftSetting INSTANCE = new TestDisableNormalGiftSetting();

    private TestDisableNormalGiftSetting() {
    }

    static {
        Covode.recordClassIndex(10831);
    }

    public final boolean getValue() {
        if (C6802e.f16868c) {
            return SettingsManager.INSTANCE.getBooleanValue(TestDisableNormalGiftSetting.class);
        }
        return false;
    }
}
