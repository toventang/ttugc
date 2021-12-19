package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.dm */
public abstract class AbstractC25897dm<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a */
    private static final Map.Entry<?, ?>[] f61034a = new Map.Entry[0];

    /* renamed from: b */
    private transient AbstractC25901dq<Map.Entry<K, V>> f61035b;

    /* renamed from: c */
    private transient AbstractC25901dq<K> f61036c;

    /* renamed from: d */
    private transient AbstractC25894dj<V> f61037d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC25901dq<Map.Entry<K, V>> mo42308a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract AbstractC25901dq<K> mo42309b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC25894dj<V> mo42310c();

    @Override // java.util.Map
    public abstract V get(Object obj);

    AbstractC25897dm() {
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(31312);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        AbstractC25901dq<Map.Entry<K, V>> dqVar = this.f61035b;
        if (dqVar != null) {
            return dqVar;
        }
        AbstractC25901dq<Map.Entry<K, V>> a = mo42308a();
        this.f61035b = a;
        return a;
    }

    public int hashCode() {
        return C25918eg.m50161a(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        AbstractC25901dq<K> dqVar = this.f61036c;
        if (dqVar != null) {
            return dqVar;
        }
        AbstractC25901dq<K> b = mo42309b();
        this.f61036c = b;
        return b;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        AbstractC25894dj<V> djVar = this.f61037d;
        if (djVar != null) {
            return djVar;
        }
        AbstractC25894dj<V> c = mo42310c();
        this.f61037d = c;
        return c;
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder append = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L)).append('{');
            boolean z = true;
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!z) {
                    append.append(", ");
                }
                z = false;
                append.append((Object) entry.getKey()).append('=').append((Object) entry.getValue());
            }
            return append.append('}').toString();
        }
        throw new IllegalArgumentException(new StringBuilder("size".length() + 40).append("size").append(" cannot be negative but was: ").append(size).toString());
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return ((AbstractC25894dj) values()).contains(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }
}
