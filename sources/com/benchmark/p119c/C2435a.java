package com.benchmark.p119c;

import com.benchmark.port.AbstractC2500c;
import com.benchmark.port.C2499b;
import com.benchmark.strategy.C2508b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.benchmark.c.a */
public class C2435a {

    /* renamed from: a */
    private static C2435a f7317a;

    /* renamed from: b */
    private ConcurrentHashMap<Integer, AbstractC2500c> f7318b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(2788);
    }

    private C2435a() {
    }

    /* renamed from: a */
    public static C2435a m7273a() {
        MethodCollector.m26663i(9931);
        if (f7317a == null) {
            synchronized (C2435a.class) {
                try {
                    if (f7317a == null) {
                        f7317a = new C2435a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9931);
                    throw th;
                }
            }
        }
        C2435a aVar = f7317a;
        MethodCollector.m26664o(9931);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized AbstractC2500c mo6803a(int i) {
        MethodCollector.m26663i(9933);
        AbstractC2500c cVar = null;
        if (!C2499b.f7582a.get()) {
            MethodCollector.m26664o(9933);
            return null;
        }
        if (i <= 0) {
            i = C2436b.f7319m.f7323d;
        }
        if (this.f7318b.containsKey(Integer.valueOf(i))) {
            AbstractC2500c cVar2 = this.f7318b.get(Integer.valueOf(i));
            MethodCollector.m26664o(9933);
            return cVar2;
        }
        synchronized (C2435a.class) {
            try {
                if (this.f7318b.containsKey(Integer.valueOf(i))) {
                    cVar = this.f7318b.get(Integer.valueOf(i));
                } else if (C2499b.f7582a.get()) {
                    cVar = new C2508b();
                    this.f7318b.put(Integer.valueOf(i), cVar);
                }
            } finally {
                MethodCollector.m26664o(9933);
            }
        }
        return cVar;
    }
}
