package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.facebook.imagepipeline.memory.y */
public final class C24510y implements AbstractC24481ae {

    /* renamed from: a */
    private static C24510y f58220a;

    static {
        Covode.recordClassIndex(28654);
    }

    private C24510y() {
    }

    /* renamed from: a */
    public static synchronized C24510y m46846a() {
        C24510y yVar;
        synchronized (C24510y.class) {
            MethodCollector.m26663i(3748);
            if (f58220a == null) {
                f58220a = new C24510y();
            }
            yVar = f58220a;
            MethodCollector.m26664o(3748);
        }
        return yVar;
    }
}
