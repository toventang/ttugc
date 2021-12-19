package com.bytedance.p802b.p834j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.b.j.c */
public class C13104c {

    /* renamed from: a */
    public static final ConcurrentHashMap<Class, Object> f31944a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Class, AbstractC13100a<?>> f31945b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Class, AbstractC13102b> f31946c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(14940);
    }

    /* renamed from: a */
    public static <T> T m23566a(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = f31944a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (C13104c.class) {
                ConcurrentHashMap<Class, AbstractC13100a<?>> concurrentHashMap2 = f31945b;
                AbstractC13100a<?> aVar = concurrentHashMap2.get(cls);
                if (aVar != null) {
                    t = (T) aVar.mo20915a();
                    concurrentHashMap2.remove(cls);
                    if (t != null) {
                        concurrentHashMap.put(cls, t);
                        ConcurrentHashMap<Class, AbstractC13102b> concurrentHashMap3 = f31946c;
                        if (concurrentHashMap3.get(cls) != null) {
                            concurrentHashMap3.remove(cls);
                        }
                        return t;
                    }
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <T> void m23567a(Class<T> cls, AbstractC13100a<T> aVar) {
        f31945b.put(cls, aVar);
    }
}
