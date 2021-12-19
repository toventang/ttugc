package com.bytedance.ttnet.p1704e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ttnet.e.a */
public final class C22949a {

    /* renamed from: b */
    private static C22949a f54254b;

    /* renamed from: a */
    public Map<String, C22950b> f54255a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(26862);
    }

    /* renamed from: a */
    public static synchronized C22949a m43251a() {
        C22949a aVar;
        synchronized (C22949a.class) {
            MethodCollector.m26663i(4512);
            if (f54254b == null) {
                f54254b = new C22949a();
            }
            aVar = f54254b;
            MethodCollector.m26664o(4512);
        }
        return aVar;
    }
}
