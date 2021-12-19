package com.bytedance.android.live.p407t;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.C10930u;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.t.a */
public class C6193a {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class<? extends AbstractC2953a>, AbstractC2953a> f15432a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(6899);
    }

    /* renamed from: a */
    public static <T extends AbstractC2953a> T m13435a(Class<T> cls) {
        ConcurrentHashMap<Class<? extends AbstractC2953a>, AbstractC2953a> concurrentHashMap = f15432a;
        AbstractC2953a aVar = concurrentHashMap.get(cls);
        T t = (T) aVar;
        if (t != null) {
            return t;
        }
        try {
            C10930u.f26257b.mo17782a();
            return (T) concurrentHashMap.get(cls);
        } catch (Exception unused) {
            return t;
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC2953a> void m13436a(Class<T> cls, T t) {
        if (cls != null && t != null) {
            f15432a.put(cls, t);
        }
    }
}
