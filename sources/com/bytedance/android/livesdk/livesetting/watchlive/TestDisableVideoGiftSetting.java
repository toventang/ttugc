package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;

public final class TestDisableVideoGiftSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisableVideoGiftSetting INSTANCE = new TestDisableVideoGiftSetting();

    private TestDisableVideoGiftSetting() {
    }

    static {
        Covode.recordClassIndex(10836);
    }

    public final boolean getValue() {
        if (C6802e.f16868c) {
            return SettingsManager.INSTANCE.getBooleanValue(TestDisableVideoGiftSetting.class);
        }
        return false;
    }
}
