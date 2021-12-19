package com.bytedance.android.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.monitor.c */
public class C11915c {

    /* renamed from: b */
    private static volatile C11915c f28463b;

    /* renamed from: a */
    Map<String, Set<String>> f28464a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(13641);
    }

    private C11915c() {
    }

    /* renamed from: a */
    public static C11915c m21019a() {
        MethodCollector.m26663i(3467);
        if (f28463b == null) {
            synchronized (C11915c.class) {
                try {
                    if (f28463b == null) {
                        f28463b = new C11915c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3467);
                    throw th;
                }
            }
        }
        C11915c cVar = f28463b;
        MethodCollector.m26664o(3467);
        return cVar;
    }
}
