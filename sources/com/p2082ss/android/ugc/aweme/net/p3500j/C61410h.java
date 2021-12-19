package com.p2082ss.android.ugc.aweme.net.p3500j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.net.j.h */
public final class C61410h {

    /* renamed from: a */
    public static final C61409g f139435a = new C61409g();

    /* renamed from: b */
    public static final C61410h f139436b = new C61410h();

    /* renamed from: c */
    private static C61409g f139437c;

    private C61410h() {
    }

    static {
        Covode.recordClassIndex(72060);
    }

    /* renamed from: a */
    public static C61409g m111181a() {
        try {
            if (f139437c == null) {
                f139437c = (C61409g) SettingsManager.m29616a().mo25397a("payload_control_settings", C61409g.class, f139435a);
            }
            C61409g gVar = f139437c;
            if (gVar == null) {
                return f139435a;
            }
            return gVar;
        } catch (Throwable unused) {
            C61409g gVar2 = f139437c;
            if (gVar2 == null) {
                return f139435a;
            }
            return gVar2;
        }
    }
}
