package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27533u;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.c.b.f */
public abstract class AbstractC27274f<K, V> extends AbstractC27533u implements AbstractC27264b<K, V> {
    static {
        Covode.recordClassIndex(32854);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC27264b<K, V> mo45371c();

    protected AbstractC27274f() {
    }

    @Override // com.google.p1998c.p2000b.AbstractC27264b
    /* renamed from: a */
    public final ConcurrentMap<K, V> mo45355a() {
        return mo45371c().mo45355a();
    }

    @Override // com.google.p1998c.p2000b.AbstractC27264b
    /* renamed from: b */
    public final void mo45357b(Object obj) {
        mo45371c().mo45357b(obj);
    }

    @Override // com.google.p1998c.p2000b.AbstractC27264b
    /* renamed from: a */
    public final V mo45353a(Object obj) {
        return mo45371c().mo45353a(obj);
    }

    @Override // com.google.p1998c.p2000b.AbstractC27264b
    /* renamed from: a */
    public final void mo45356a(K k, V v) {
        mo45371c().mo45356a((Object) k, (Object) v);
    }

    @Override // com.google.p1998c.p2000b.AbstractC27264b
    /* renamed from: a */
    public final V mo45354a(K k, Callable<? extends V> callable) {
        return mo45371c().mo45354a((Object) k, (Callable) callable);
    }
}
