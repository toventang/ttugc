package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.y */
public final class C27539y<K, V> extends AbstractC27501f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final K f64906a;

    /* renamed from: b */
    final V f64907b;

    static {
        Covode.recordClassIndex(33119);
    }

    @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
    public final K getKey() {
        return this.f64906a;
    }

    @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
    public final V getValue() {
        return this.f64907b;
    }

    @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    C27539y(K k, V v) {
        this.f64906a = k;
        this.f64907b = v;
    }
}
