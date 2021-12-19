package com.google.p1998c.p2004f;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.c.f.b */
public final class C27561b {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f64929a;

    /* renamed from: b */
    public static final Map<Class<?>, Class<?>> f64930b;

    static {
        Covode.recordClassIndex(33141);
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m55099a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m55099a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m55099a(hashMap, hashMap2, Character.TYPE, Character.class);
        m55099a(hashMap, hashMap2, Double.TYPE, Double.class);
        m55099a(hashMap, hashMap2, Float.TYPE, Float.class);
        m55099a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m55099a(hashMap, hashMap2, Long.TYPE, Long.class);
        m55099a(hashMap, hashMap2, Short.TYPE, Short.class);
        m55099a(hashMap, hashMap2, Void.TYPE, Void.class);
        f64929a = Collections.unmodifiableMap(hashMap);
        f64930b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m55099a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
