package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9524aj;
import com.bytedance.covode.number.Covode;

public final class LiveDegradeThresholdSettingSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9524aj DEFAULT = new C9524aj();
    public static final LiveDegradeThresholdSettingSetting INSTANCE = new LiveDegradeThresholdSettingSetting();

    private LiveDegradeThresholdSettingSetting() {
    }

    public final C9524aj getDEFAULT() {
        return DEFAULT;
    }

    public final C9524aj getValue() {
        C9524aj ajVar = (C9524aj) SettingsManager.INSTANCE.getValueSafely(LiveDegradeThresholdSettingSetting.class);
        if (ajVar == null) {
            return DEFAULT;
        }
        return ajVar;
    }

    static {
        Covode.recordClassIndex(10640);
    }
}
