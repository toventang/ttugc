package com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.c */
public final class C84341c {

    /* renamed from: a */
    public static final C84339a f188578a = new C84339a((byte) 0);

    /* renamed from: b */
    public static final C84341c f188579b = new C84341c();

    private C84341c() {
    }

    static {
        Covode.recordClassIndex(98292);
    }

    /* renamed from: a */
    public static C84339a m145088a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            C84339a aVar = f188578a;
            C84339a aVar2 = (C84339a) a.mo25397a("seclink_config", C84339a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f188578a;
        }
    }
}
