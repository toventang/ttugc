package com.bytedance.ies.p1208im.core.api.p1219i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.ies.im.core.api.i.a */
public final class C17468a {

    /* renamed from: a */
    private static long f41824a;

    static {
        Covode.recordClassIndex(19955);
    }

    /* renamed from: a */
    public static synchronized long m32437a() {
        long currentTimeMillis;
        synchronized (C17468a.class) {
            MethodCollector.m26663i(5781);
            currentTimeMillis = System.currentTimeMillis();
            long j = f41824a;
            if (currentTimeMillis <= j) {
                currentTimeMillis = 1 + j;
            }
            f41824a = currentTimeMillis;
            MethodCollector.m26664o(5781);
        }
        return currentTimeMillis;
    }
}
