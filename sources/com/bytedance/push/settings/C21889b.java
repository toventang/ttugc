package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.b */
public class C21889b {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f51855a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25552);
    }

    /* renamed from: a */
    public static <T> T m41112a(Class<T> cls, AbstractC21890c cVar) {
        MethodCollector.m26663i(11310);
        ConcurrentHashMap<Class, Object> concurrentHashMap = f51855a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (C21889b.class) {
                try {
                    t = concurrentHashMap.get(cls);
                    if (t == null && (t = (T) cVar.mo24752a(cls)) != null) {
                        concurrentHashMap.put(cls, t);
                    }
                } finally {
                    MethodCollector.m26664o(11310);
                }
            }
        }
        return t;
    }
}
