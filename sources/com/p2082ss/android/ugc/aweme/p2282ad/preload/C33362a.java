package com.p2082ss.android.ugc.aweme.p2282ad.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ad.preload.a */
public final class C33362a {

    /* renamed from: a */
    public static final boolean f79301a = true;

    /* renamed from: b */
    public static final C33362a f79302b = new C33362a();

    private C33362a() {
    }

    /* renamed from: a */
    public static final boolean m68415a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_ad_lynx_land_page_preload_optimize", true);
        } catch (Throwable unused) {
            return f79301a;
        }
    }

    static {
        Covode.recordClassIndex(40208);
    }
}
