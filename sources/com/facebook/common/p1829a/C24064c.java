package com.facebook.common.p1829a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.facebook.common.a.c */
public final class C24064c implements AbstractC24063b {

    /* renamed from: a */
    private static C24064c f56997a;

    static {
        Covode.recordClassIndex(28191);
    }

    private C24064c() {
    }

    /* renamed from: a */
    public static synchronized C24064c m45574a() {
        C24064c cVar;
        synchronized (C24064c.class) {
            MethodCollector.m26663i(11869);
            if (f56997a == null) {
                f56997a = new C24064c();
            }
            cVar = f56997a;
            MethodCollector.m26664o(11869);
        }
        return cVar;
    }
}
