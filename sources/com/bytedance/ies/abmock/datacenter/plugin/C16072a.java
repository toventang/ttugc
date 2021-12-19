package com.bytedance.ies.abmock.datacenter.plugin;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.abmock.datacenter.plugin.a */
public class C16072a {

    /* renamed from: b */
    private static C16072a f38706b;

    /* renamed from: a */
    public Map<BaseConfigPlugin, Boolean> f38707a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(18345);
    }

    private C16072a() {
    }

    /* renamed from: a */
    public static C16072a m29859a() {
        MethodCollector.m26663i(6526);
        if (f38706b == null) {
            synchronized (C16072a.class) {
                try {
                    if (f38706b == null) {
                        f38706b = new C16072a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6526);
                    throw th;
                }
            }
        }
        C16072a aVar = f38706b;
        MethodCollector.m26664o(6526);
        return aVar;
    }
}
