package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;

public final class TestDisablePushStreamSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisablePushStreamSetting INSTANCE = new TestDisablePushStreamSetting();

    private TestDisablePushStreamSetting() {
    }

    static {
        Covode.recordClassIndex(10834);
    }

    public final boolean getValue() {
        if (C6802e.f16868c) {
            return SettingsManager.INSTANCE.getBooleanValue(TestDisablePushStreamSetting.class);
        }
        return false;
    }
}
