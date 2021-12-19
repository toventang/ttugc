package com.bytedance.p1734ug.p1735a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.ug.a.b */
class C23441b {

    /* renamed from: a */
    private static volatile AbstractC23451i f55595a;

    static {
        Covode.recordClassIndex(27401);
    }

    C23441b() {
    }

    /* renamed from: b */
    private static AbstractC23451i m44132b() {
        try {
            return new C23443d();
        } catch (Throwable unused) {
            return new C23456n();
        }
    }

    /* renamed from: a */
    static AbstractC23451i m44131a() {
        MethodCollector.m26663i(4911);
        if (f55595a == null) {
            synchronized (C23441b.class) {
                try {
                    if (f55595a == null) {
                        f55595a = m44132b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4911);
                    throw th;
                }
            }
        }
        AbstractC23451i iVar = f55595a;
        MethodCollector.m26664o(4911);
        return iVar;
    }
}
