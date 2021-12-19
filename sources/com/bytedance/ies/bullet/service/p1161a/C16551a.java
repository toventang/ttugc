package com.bytedance.ies.bullet.service.p1161a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.a.a */
public final class C16551a<K, V> extends HashMap<K, V> implements AbstractC16559e<K, V> {
    static {
        Covode.recordClassIndex(18987);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final Set getEntries() {
        return super.entrySet();
    }

    public final Set getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final Collection getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<K> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Collection<V> values() {
        return getValues();
    }

    public final V getAny(K k) {
        return get(k);
    }

    @Override // com.bytedance.ies.bullet.service.p1161a.AbstractC16559e
    public final Boolean getBoolean(K k) {
        V v = get(k);
        if (!(v instanceof Boolean)) {
            v = null;
        }
        return v;
    }

    @Override // com.bytedance.ies.bullet.service.p1161a.AbstractC16559e
    public final String getString(K k) {
        V v = get(k);
        if (!(v instanceof String)) {
            v = null;
        }
        return v;
    }

    public final boolean putAnyIfAbsent(K k, V v) {
        if (containsKey(k)) {
            return false;
        }
        put(k, v);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.bullet.service.a.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.p1161a.AbstractC16559e
    public final boolean putBooleanIfAbsent(K k, boolean z) {
        Object obj;
        if (containsKey(k)) {
            return false;
        }
        try {
            obj = C89379q.m157068constructorimpl(put(k, Boolean.valueOf(z)));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return C89379q.m157074isSuccessimpl(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.p1161a.AbstractC16559e
    public final boolean putStringIfAbsent(K k, String str) {
        Object obj;
        C89219l.m154719c(str, "");
        if (containsKey(k)) {
            return false;
        }
        try {
            obj = C89379q.m157068constructorimpl(put(k, str));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return C89379q.m157074isSuccessimpl(obj);
    }
}
