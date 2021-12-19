package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.common.d.f */
public class C24086f<K, V> extends HashMap<K, V> {
    static {
        Covode.recordClassIndex(28214);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m45602of() {
        return Collections.unmodifiableMap(new HashMap());
    }

    private C24086f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> C24086f<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return new C24086f<>(map);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m45603of(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m45604of(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m45605of(K k, V v, K k2, V v2, K k3, V v3) {
        HashMap hashMap = new HashMap(3);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m45606of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m45607of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        HashMap hashMap = new HashMap(5);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m45608of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        HashMap hashMap = new HashMap(6);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        hashMap.put(k6, v6);
        return Collections.unmodifiableMap(hashMap);
    }
}
