package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.C9322b;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class NegativeTestAudienceExperiment {
    public static final NegativeTestAudienceExperiment INSTANCE = new NegativeTestAudienceExperiment();
    @Group(isDefault = true, value = "default group")
    private static final C9322b close = new C9322b((byte) 0);
    private static final AbstractC89244h settingValue$delegate = C89250i.m154773a((AbstractC89171a) C9334a.f22789a);

    private final C9322b getSettingValue() {
        return (C9322b) settingValue$delegate.getValue();
    }

    private NegativeTestAudienceExperiment() {
    }

    public final C9322b getClose() {
        return close;
    }

    public final long getCyclePeriod() {
        return getSettingValue().f22758b;
    }

    /* renamed from: com.bytedance.android.livesdk.livesetting.performance.NegativeTestAudienceExperiment$a */
    static final class C9334a extends AbstractC89220m implements AbstractC89171a<C9322b> {

        /* renamed from: a */
        public static final C9334a f22789a = new C9334a();

        static {
            Covode.recordClassIndex(10668);
        }

        C9334a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9322b invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(NegativeTestAudienceExperiment.class);
            if (valueSafely == null) {
                return NegativeTestAudienceExperiment.INSTANCE.getClose();
            }
            return valueSafely;
        }
    }

    static {
        Covode.recordClassIndex(10667);
    }

    public final long getCpuSleepTime() {
        return (getSettingValue().f22758b * (100 - getSettingValue().f22757a)) / 100;
    }

    public final boolean isEnable(boolean z) {
        if (getSettingValue().f22759c != z || getSettingValue().f22757a <= close.f22757a) {
            return false;
        }
        return true;
    }
}
