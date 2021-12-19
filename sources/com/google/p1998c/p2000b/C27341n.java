package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.AbstractMap;

/* renamed from: com.google.c.b.n */
public final class C27341n<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final EnumC27334l f64606a;

    static {
        Covode.recordClassIndex(32921);
    }

    public final EnumC27334l getCause() {
        return this.f64606a;
    }

    public final boolean wasEvicted() {
        return this.f64606a.mo45517a();
    }

    public static <K, V> C27341n<K, V> create(K k, V v, EnumC27334l lVar) {
        return new C27341n<>(k, v, lVar);
    }

    private C27341n(K k, V v, EnumC27334l lVar) {
        super(k, v);
        this.f64606a = (EnumC27334l) C27245k.m54229a(lVar);
    }
}
