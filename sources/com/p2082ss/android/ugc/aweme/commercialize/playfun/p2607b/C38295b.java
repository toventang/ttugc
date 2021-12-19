package com.p2082ss.android.ugc.aweme.commercialize.playfun.p2607b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.b.b */
public final class C38295b {

    /* renamed from: a */
    public static final boolean f90503a = true;

    /* renamed from: b */
    public static final C38295b f90504b = new C38295b();

    private C38295b() {
    }

    /* renamed from: a */
    public static final boolean m77675a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_ad_playfun_monitor_log", true);
        } catch (Throwable unused) {
            return f90503a;
        }
    }

    static {
        Covode.recordClassIndex(45782);
    }
}
