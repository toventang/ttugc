package com.bytedance.news.common.service.manager;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.news.common.service.manager.c */
public final class C21520c {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f51091a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Class, AbstractC21518a<?>> f51092b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Class, AbstractC21519b> f51093c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25159);
    }

    /* renamed from: b */
    private static <T> T m40427b(Class<T> cls) {
        try {
            Object newInstance = Class.forName(C1764a.m5928a("%s__ServiceProxy", new Object[]{cls.getName()})).newInstance();
            if (newInstance instanceof IServiceProxy) {
                return (T) ((IServiceProxy) newInstance).newInstance();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m40424a(Class<T> cls) {
        MethodCollector.m26663i(1480);
        ConcurrentHashMap<Class, Object> concurrentHashMap = f51091a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (cls) {
                try {
                    T t2 = (T) concurrentHashMap.get(cls);
                    if (t2 != null) {
                        return t2;
                    }
                    ConcurrentHashMap<Class, AbstractC21518a<?>> concurrentHashMap2 = f51092b;
                    AbstractC21518a<?> aVar = concurrentHashMap2.get(cls);
                    if (aVar != null) {
                        T t3 = (T) aVar.mo20336a();
                        concurrentHashMap2.remove(cls);
                        if (t3 != null) {
                            m40428b(cls, t3);
                            MethodCollector.m26664o(1480);
                            return t3;
                        }
                    }
                    t = (T) m40427b(cls);
                    if (t != null) {
                        m40428b(cls, t);
                        MethodCollector.m26664o(1480);
                        return t;
                    }
                } finally {
                    MethodCollector.m26664o(1480);
                }
            }
        }
        MethodCollector.m26664o(1480);
        return t;
    }

    /* renamed from: a */
    public static <T> void m40425a(Class<T> cls, AbstractC21518a<T> aVar) {
        f51092b.put(cls, aVar);
    }

    /* renamed from: a */
    public static <T> void m40426a(Class<T> cls, T t) {
        f51091a.put(cls, t);
    }

    /* renamed from: b */
    private static <T> void m40428b(Class<T> cls, T t) {
        f51091a.put(cls, t);
        ConcurrentHashMap<Class, AbstractC21519b> concurrentHashMap = f51093c;
        if (concurrentHashMap.get(cls) != null) {
            concurrentHashMap.remove(cls);
        }
    }
}
