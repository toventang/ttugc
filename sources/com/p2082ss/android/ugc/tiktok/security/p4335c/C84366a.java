package com.p2082ss.android.ugc.tiktok.security.p4335c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.tiktok.security.c.a */
public final class C84366a {

    /* renamed from: a */
    public static final boolean f188616a = false;

    /* renamed from: b */
    public static final C84366a f188617b = new C84366a();

    private C84366a() {
    }

    static {
        Covode.recordClassIndex(98318);
    }

    /* renamed from: a */
    public static boolean m145125a() {
        try {
            return SettingsManager.m29616a().mo25400a("hybrid_sec_route_monitor_switch", false);
        } catch (Throwable unused) {
            return f188616a;
        }
    }
}
