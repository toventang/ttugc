package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.hk */
public final class C26014hk<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C26014hk f61289b;

    /* renamed from: a */
    private boolean f61290a = true;

    public final void zzc() {
        this.f61290a = false;
    }

    public static <K, V> C26014hk<K, V> zza() {
        return f61289b;
    }

    public final boolean zzd() {
        return this.f61290a;
    }

    private C26014hk() {
    }

    public final void clear() {
        m50662a();
        super.clear();
    }

    static {
        Covode.recordClassIndex(31429);
        C26014hk hkVar = new C26014hk();
        f61289b = hkVar;
        hkVar.f61290a = false;
    }

    /* renamed from: a */
    private final void m50662a() {
        if (!this.f61290a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final C26014hk<K, V> zzb() {
        if (isEmpty()) {
            return new C26014hk<>();
        }
        return new C26014hk<>(this);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m50661a(entry.getValue()) ^ m50661a(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V remove(Object obj) {
        m50662a();
        return (V) super.remove(obj);
    }

    private C26014hk(Map<K, V> map) {
        super(map);
    }

    public final void zza(C26014hk<K, V> hkVar) {
        m50662a();
        if (!hkVar.isEmpty()) {
            putAll(hkVar);
        }
    }

    /* renamed from: a */
    private static int m50661a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int a = C25989gm.m50597a(length, bArr, 0, length);
            if (a == 0) {
                return 1;
            }
            return a;
        } else if (!(obj instanceof AbstractC25988gl)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void putAll(Map<? extends K, ? extends V> map) {
        m50662a();
        for (Object obj : map.keySet()) {
            C25989gm.m50599a(obj);
            C25989gm.m50599a(map.get(obj));
        }
        super.putAll(map);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                                equals = value.equals(obj2);
                                continue;
                            } else {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V put(K k, V v) {
        m50662a();
        C25989gm.m50599a(k);
        C25989gm.m50599a(v);
        return (V) super.put(k, v);
    }
}
