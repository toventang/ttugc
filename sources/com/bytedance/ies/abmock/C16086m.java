package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.C27917g;

/* renamed from: com.bytedance.ies.abmock.m */
public final class C16086m {

    /* renamed from: a */
    private static C27910f f38739a;

    static {
        Covode.recordClassIndex(18362);
    }

    /* renamed from: a */
    public static synchronized C27910f m29881a() {
        C27910f fVar;
        synchronized (C16086m.class) {
            MethodCollector.m26663i(1627);
            if (f38739a == null) {
                C27917g gVar = new C27917g();
                gVar.f65565e = false;
                f38739a = gVar.mo46682b();
            }
            fVar = f38739a;
            MethodCollector.m26664o(1627);
        }
        return fVar;
    }
}
