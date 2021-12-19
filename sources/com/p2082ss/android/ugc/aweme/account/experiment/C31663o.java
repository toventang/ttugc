package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.o */
public final class C31663o {

    /* renamed from: a */
    public static final boolean f75732a = false;

    /* renamed from: b */
    public static final C31663o f75733b = new C31663o();

    /* renamed from: c */
    private static Boolean f75734c;

    private C31663o() {
    }

    static {
        Covode.recordClassIndex(38394);
    }

    /* renamed from: a */
    public static final boolean m65975a() {
        Boolean bool = f75734c;
        if (bool != null) {
            return bool.booleanValue();
        }
        f75733b.m65976b();
        Boolean bool2 = f75734c;
        if (bool2 == null) {
            C89219l.m154715b();
        }
        return bool2.booleanValue();
    }

    /* renamed from: b */
    private synchronized void m65976b() {
        Boolean bool;
        MethodCollector.m26663i(10704);
        if (f75734c != null) {
            MethodCollector.m26664o(10704);
            return;
        }
        try {
            bool = Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_6_digit_sms_verification", false));
        } catch (Throwable unused) {
            bool = Boolean.valueOf(f75732a);
        }
        f75734c = bool;
        MethodCollector.m26664o(10704);
    }
}
