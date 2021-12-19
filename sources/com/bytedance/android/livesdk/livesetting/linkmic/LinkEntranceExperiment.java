package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class LinkEntranceExperiment {
    @Group(isDefault = true, value = "default")
    private static final boolean DEFAULT = false;
    public static final LinkEntranceExperiment INSTANCE = new LinkEntranceExperiment();
    private static final AbstractC89244h settingValue$delegate = C89250i.m154773a((AbstractC89171a) C9329a.f22783a);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    private LinkEntranceExperiment() {
    }

    public final boolean getValue() {
        return getSettingValue();
    }

    /* renamed from: com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment$a */
    static final class C9329a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C9329a f22783a = new C9329a();

        static {
            Covode.recordClassIndex(10483);
        }

        C9329a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LinkEntranceExperiment.class));
        }
    }

    static {
        Covode.recordClassIndex(10482);
    }
}
