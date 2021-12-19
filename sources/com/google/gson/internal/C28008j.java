package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.internal.j */
public final class C28008j {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f65793a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f65794b;

    static {
        Covode.recordClassIndex(33621);
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m56098a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m56098a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m56098a(hashMap, hashMap2, Character.TYPE, Character.class);
        m56098a(hashMap, hashMap2, Double.TYPE, Double.class);
        m56098a(hashMap, hashMap2, Float.TYPE, Float.class);
        m56098a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m56098a(hashMap, hashMap2, Long.TYPE, Long.class);
        m56098a(hashMap, hashMap2, Short.TYPE, Short.class);
        m56098a(hashMap, hashMap2, Void.TYPE, Void.class);
        f65793a = Collections.unmodifiableMap(hashMap);
        f65794b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m56097a(Class<T> cls) {
        Class<T> cls2 = (Class<T>) f65793a.get(C27921a.m55968a(cls));
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    /* renamed from: a */
    private static void m56098a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
