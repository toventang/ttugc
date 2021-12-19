package com.bytedance.android.livesdk.p425aa.p429d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.aa.d.e */
public final class C6543e {

    /* renamed from: a */
    private static List<Runnable> f16338a = new ArrayList();

    static {
        Covode.recordClassIndex(7279);
    }

    /* renamed from: a */
    public static synchronized void m13986a() {
        synchronized (C6543e.class) {
            MethodCollector.m26663i(10658);
            try {
                if (!f16338a.isEmpty()) {
                    for (Runnable runnable : f16338a) {
                        runnable.run();
                    }
                }
                f16338a.clear();
                MethodCollector.m26664o(10658);
            } catch (Throwable unused) {
                MethodCollector.m26664o(10658);
            }
        }
    }
}
