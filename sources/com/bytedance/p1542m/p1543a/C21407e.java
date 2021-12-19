package com.bytedance.p1542m.p1543a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1542m.C21411c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.m.a.e */
public class C21407e {

    /* renamed from: a */
    private static volatile C21407e f50786a;

    /* renamed from: b */
    private SharedPreferences f50787b;

    static {
        Covode.recordClassIndex(25027);
    }

    private C21407e() {
        SharedPreferences a = C34822d.m71158a(C21411c.f50798b, "app_bundle_session_ids", 0);
        this.f50787b = a;
        if (C21411c.f50799c.mo35000b() != a.getInt("app_version_code", -1)) {
            this.f50787b.edit().clear().apply();
        }
    }

    /* renamed from: a */
    public static C21407e m40182a() {
        MethodCollector.m26663i(11771);
        if (f50786a == null) {
            synchronized (C21407e.class) {
                try {
                    if (f50786a == null) {
                        f50786a = new C21407e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11771);
                    throw th;
                }
            }
        }
        C21407e eVar = f50786a;
        MethodCollector.m26664o(11771);
        return eVar;
    }

    /* renamed from: a */
    public final int mo35011a(String str) {
        return this.f50787b.getInt(str, -1);
    }

    /* renamed from: a */
    public final void mo35012a(String str, int i) {
        this.f50787b.edit().putInt(str, i).apply();
    }
}
