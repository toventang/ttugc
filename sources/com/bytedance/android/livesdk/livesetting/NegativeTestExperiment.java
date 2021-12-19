package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class NegativeTestExperiment {
    public static final NegativeTestExperiment INSTANCE = new NegativeTestExperiment();
    @Group(isDefault = true, value = "default group")
    private static final C9322b close;
    private static final C9322b settingValue;

    private NegativeTestExperiment() {
    }

    public final C9322b getClose() {
        return close;
    }

    public final long getCyclePeriod() {
        return settingValue.f22758b;
    }

    public final long getCpuSleepTime() {
        C9322b bVar = settingValue;
        return (bVar.f22758b * (100 - bVar.f22757a)) / 100;
    }

    static {
        Covode.recordClassIndex(10256);
        C9322b bVar = new C9322b((byte) 0);
        close = bVar;
        C9322b bVar2 = (C9322b) SettingsManager.INSTANCE.getValueSafely(NegativeTestExperiment.class);
        if (bVar2 != null) {
            bVar = bVar2;
        }
        settingValue = bVar;
    }

    public final boolean isEnable(boolean z) {
        C9322b bVar = settingValue;
        if (bVar.f22759c != z || bVar.f22757a <= close.f22757a) {
            return false;
        }
        return true;
    }
}
