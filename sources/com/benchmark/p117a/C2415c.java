package com.benchmark.p117a;

import com.benchmark.tools.C2517e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.benchmark.a.c */
public final class C2415c {

    /* renamed from: a */
    public static C2517e.AbstractC2520c f7252a;

    static {
        Covode.recordClassIndex(2766);
    }

    /* renamed from: a */
    public static void m7261a(Throwable th) {
        C2517e.AbstractC2520c cVar = f7252a;
        if (cVar != null) {
            cVar.mo6979a(th);
        }
    }

    /* renamed from: a */
    public static synchronized void m7260a(C2517e.AbstractC2520c cVar) {
        synchronized (C2415c.class) {
            MethodCollector.m26663i(7601);
            f7252a = cVar;
            MethodCollector.m26664o(7601);
        }
    }
}
