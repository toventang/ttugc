package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9539aw;
import com.bytedance.covode.number.Covode;

public final class CloseLiveSwitchSquareParamSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9539aw DEFAULT = new C9539aw();
    public static final CloseLiveSwitchSquareParamSetting INSTANCE = new CloseLiveSwitchSquareParamSetting();

    private CloseLiveSwitchSquareParamSetting() {
    }

    public final C9539aw getDEFAULT() {
        return DEFAULT;
    }

    public final C9539aw getValue() {
        C9539aw awVar = (C9539aw) SettingsManager.INSTANCE.getValueSafely(CloseLiveSwitchSquareParamSetting.class);
        if (awVar == null) {
            return DEFAULT;
        }
        return awVar;
    }

    static {
        Covode.recordClassIndex(10371);
    }
}
