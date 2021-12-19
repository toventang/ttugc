package com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.e */
public final class C84343e {

    /* renamed from: a */
    public static final C84342d f188581a = new C84342d();

    /* renamed from: b */
    public static final C84343e f188582b = new C84343e();

    private C84343e() {
    }

    static {
        Covode.recordClassIndex(98294);
    }

    /* renamed from: a */
    public static C84342d m145089a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            C84342d dVar = f188581a;
            C84342d dVar2 = (C84342d) a.mo25397a("seclink_white_list_config", C84342d.class, dVar);
            return dVar2 == null ? dVar : dVar2;
        } catch (Throwable unused) {
            return f188581a;
        }
    }
}
