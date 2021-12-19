package com.facebook.p1826c.p1827a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.facebook.c.a.i */
public final class C24030i implements AbstractC24024d {

    /* renamed from: a */
    private static C24030i f56891a;

    static {
        Covode.recordClassIndex(28156);
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24024d
    /* renamed from: a */
    public final void mo34229a(AbstractC24023c cVar) {
    }

    private C24030i() {
    }

    /* renamed from: a */
    public static synchronized C24030i m45464a() {
        C24030i iVar;
        synchronized (C24030i.class) {
            MethodCollector.m26663i(5334);
            if (f56891a == null) {
                f56891a = new C24030i();
            }
            iVar = f56891a;
            MethodCollector.m26664o(5334);
        }
        return iVar;
    }
}
