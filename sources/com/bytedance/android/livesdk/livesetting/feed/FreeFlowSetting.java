package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.feed.feed.C8585d;
import com.bytedance.covode.number.Covode;

public final class FreeFlowSetting {
    @Group(isDefault = true, value = "default group")
    private static final C8585d DEFAULT = new C8585d();
    public static final FreeFlowSetting INSTANCE = new FreeFlowSetting();

    private FreeFlowSetting() {
    }

    public final C8585d getDEFAULT() {
        return DEFAULT;
    }

    public final C8585d getValue() {
        C8585d dVar = (C8585d) SettingsManager.INSTANCE.getValueSafely(FreeFlowSetting.class);
        if (dVar == null) {
            return DEFAULT;
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(10379);
    }
}
