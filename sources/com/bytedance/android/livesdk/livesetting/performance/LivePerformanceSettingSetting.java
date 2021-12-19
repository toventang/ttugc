package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9535as;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class LivePerformanceSettingSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9535as DEFAULT;
    public static final LivePerformanceSettingSetting INSTANCE = new LivePerformanceSettingSetting();

    private LivePerformanceSettingSetting() {
    }

    public final C9535as getDEFAULT() {
        return DEFAULT;
    }

    public final C9535as getValue() {
        C9535as asVar = (C9535as) SettingsManager.INSTANCE.getValueSafely(LivePerformanceSettingSetting.class);
        if (asVar == null) {
            return DEFAULT;
        }
        return asVar;
    }

    static {
        Covode.recordClassIndex(10659);
        C9535as asVar = new C9535as();
        asVar.f23153a = true;
        C89219l.m154716b(asVar, "");
        DEFAULT = asVar;
    }
}
