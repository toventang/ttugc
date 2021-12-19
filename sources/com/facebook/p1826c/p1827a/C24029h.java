package com.facebook.p1826c.p1827a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.facebook.c.a.h */
public final class C24029h implements AbstractC24022b {

    /* renamed from: a */
    private static C24029h f56890a;

    static {
        Covode.recordClassIndex(28155);
    }

    private C24029h() {
    }

    /* renamed from: a */
    public static synchronized C24029h m45463a() {
        C24029h hVar;
        synchronized (C24029h.class) {
            MethodCollector.m26663i(5339);
            if (f56890a == null) {
                f56890a = new C24029h();
            }
            hVar = f56890a;
            MethodCollector.m26664o(5339);
        }
        return hVar;
    }
}
