package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.t */
public final class C68754t {

    /* renamed from: a */
    public static final C68753s f153793a = new C68753s((byte) 0);

    /* renamed from: b */
    public static final C68754t f153794b = new C68754t();

    private C68754t() {
    }

    static {
        Covode.recordClassIndex(81023);
    }

    /* renamed from: a */
    public static C68753s m121189a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            C68753s sVar = f153793a;
            C68753s sVar2 = (C68753s) a.mo25397a("js2_xss_config", C68753s.class, sVar);
            return sVar2 == null ? sVar : sVar2;
        } catch (Throwable unused) {
            return f153793a;
        }
    }
}
