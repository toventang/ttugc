package com.facebook.internal.p1899b.p1900a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.b.a.a */
public class C24714a {

    /* renamed from: a */
    private static C24714a f58681a;

    /* renamed from: b */
    private static final String f58682b = C24714a.class.getCanonicalName();

    /* renamed from: c */
    private final Map<Object, Object> f58683c = new HashMap();

    static {
        Covode.recordClassIndex(28867);
    }

    private C24714a() {
    }

    /* renamed from: a */
    public static synchronized C24714a m47334a() {
        synchronized (C24714a.class) {
            MethodCollector.m26663i(6546);
            if (C24677a.m47209a(C24714a.class)) {
                MethodCollector.m26664o(6546);
                return null;
            }
            try {
                if (f58681a == null) {
                    f58681a = new C24714a();
                }
                C24714a aVar = f58681a;
                MethodCollector.m26664o(6546);
                return aVar;
            } catch (Throwable th) {
                C24677a.m47208a(th, C24714a.class);
                MethodCollector.m26664o(6546);
                return null;
            }
        }
    }
}
