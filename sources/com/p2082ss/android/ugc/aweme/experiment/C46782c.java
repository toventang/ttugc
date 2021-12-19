package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.c */
public final class C46782c {

    /* renamed from: a */
    public static final boolean f109000a = true;

    /* renamed from: b */
    public static final C46782c f109001b = new C46782c();

    private C46782c() {
    }

    /* renamed from: a */
    public static final boolean m90130a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_ad_fake_user_profile_bugfix", true);
        } catch (Throwable unused) {
            return f109000a;
        }
    }

    static {
        Covode.recordClassIndex(55383);
    }
}
