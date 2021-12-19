package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27241i;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.f */
public abstract class AbstractC27501f<K, V> implements Map.Entry<K, V> {
    static {
        Covode.recordClassIndex(33081);
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    AbstractC27501f() {
    }

    public int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return ((Object) getKey()) + "=" + ((Object) getValue());
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!C27241i.m54222a(getKey(), entry.getKey()) || !C27241i.m54222a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
