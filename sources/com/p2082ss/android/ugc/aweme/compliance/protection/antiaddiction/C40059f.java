package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.f */
public final class C40059f {

    /* renamed from: a */
    public static String f94099a;

    /* renamed from: b */
    public static final C40059f f94100b = new C40059f();

    /* renamed from: c */
    private static final AbstractC89244h f94101c = C89250i.m154773a((AbstractC89171a) C40060a.f94102a);

    private C40059f() {
    }

    static {
        Covode.recordClassIndex(47830);
    }

    /* renamed from: b */
    public static final String m81019b() {
        try {
            String a = SettingsManager.m29616a().mo25398a("anti_addiction_pop_up_text", "");
            C89219l.m154716b(a, "");
            return a;
        } catch (Throwable unused) {
            return C40058e.f94097a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.f$a */
    static final class C40060a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C40060a f94102a = new C40060a();

        static {
            Covode.recordClassIndex(47831);
        }

        C40060a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Integer antiAddictionDayTime = iESSettingsProxy.getAntiAddictionDayTime();
            IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy2, "");
            Integer antiAddictionNightTime = iESSettingsProxy2.getAntiAddictionNightTime();
            String b = C40059f.m81019b();
            if (antiAddictionDayTime == null || antiAddictionNightTime == null || antiAddictionDayTime.intValue() <= 0 || antiAddictionNightTime.intValue() <= 0 || TextUtils.isEmpty(b)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final boolean m81018a() {
        if (C46796cm.f109016a) {
            return ((Boolean) f94101c.getValue()).booleanValue();
        }
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        Integer antiAddictionDayTime = iESSettingsProxy.getAntiAddictionDayTime();
        IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy2, "");
        Integer antiAddictionNightTime = iESSettingsProxy2.getAntiAddictionNightTime();
        String b = m81019b();
        if (antiAddictionDayTime == null || antiAddictionNightTime == null || antiAddictionDayTime.intValue() <= 0 || antiAddictionNightTime.intValue() <= 0 || TextUtils.isEmpty(b)) {
            return false;
        }
        return true;
    }
}
