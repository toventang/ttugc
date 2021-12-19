package com.bytedance.common.jato.scheduler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.common.jato.scheduler.a */
public final class C13578a {

    /* renamed from: b */
    private static C13578a f33021b;

    /* renamed from: a */
    public AtomicBoolean f33022a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(15599);
    }

    /* renamed from: a */
    public static synchronized C13578a m24392a() {
        C13578a aVar;
        synchronized (C13578a.class) {
            MethodCollector.m26663i(9899);
            if (f33021b == null) {
                f33021b = new C13578a();
            }
            aVar = f33021b;
            MethodCollector.m26664o(9899);
        }
        return aVar;
    }
}
