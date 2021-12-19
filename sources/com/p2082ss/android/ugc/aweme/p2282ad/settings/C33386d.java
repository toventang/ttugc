package com.p2082ss.android.ugc.aweme.p2282ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.settings.d */
public final class C33386d {

    /* renamed from: a */
    public static final C33385c[] f79334a = new C33385c[0];

    /* renamed from: b */
    public static final C33386d f79335b = new C33386d();

    private C33386d() {
    }

    static {
        Covode.recordClassIndex(40234);
    }

    /* renamed from: a */
    public static C33385c[] m68469a() {
        try {
            Object a = SettingsManager.m29616a().mo25396a("intent_scheme_intercept_config", C33385c[].class);
            C89219l.m154716b(a, "");
            return (C33385c[]) a;
        } catch (Throwable unused) {
            return f79334a;
        }
    }
}
