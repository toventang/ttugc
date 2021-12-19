package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.C27917g;

/* renamed from: com.bytedance.android.live_settings.f */
public final class C6414f {

    /* renamed from: a */
    private static C27910f f15991a;

    static {
        Covode.recordClassIndex(7146);
    }

    /* renamed from: a */
    public static synchronized C27910f m13807a() {
        C27910f fVar;
        synchronized (C6414f.class) {
            MethodCollector.m26663i(11005);
            if (f15991a == null) {
                C27917g gVar = new C27917g();
                gVar.f65565e = false;
                f15991a = gVar.mo46682b();
            }
            fVar = f15991a;
            MethodCollector.m26664o(11005);
        }
        return fVar;
    }
}
