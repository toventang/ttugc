package com.bytedance.jedi.p1445a.p1454g.p1456b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1454g.p1455a.C20198c;
import java.util.AbstractMap;

/* renamed from: com.bytedance.jedi.a.g.b.g */
public final class C20262g<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final EnumC20255e f48114a;

    static {
        Covode.recordClassIndex(23770);
    }

    public final EnumC20255e getCause() {
        return this.f48114a;
    }

    public final boolean wasEvicted() {
        return this.f48114a.mo33634a();
    }

    public static <K, V> C20262g<K, V> create(K k, V v, EnumC20255e eVar) {
        return new C20262g<>(k, v, eVar);
    }

    private C20262g(K k, V v, EnumC20255e eVar) {
        super(k, v);
        this.f48114a = (EnumC20255e) C20198c.m38190a(eVar);
    }
}
