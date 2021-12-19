package com.bytedance.jedi.p1445a.p1463m;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.m.h */
public final class C20349h<K, V> extends WeakReference<V> {

    /* renamed from: a */
    public final K f48223a;

    static {
        Covode.recordClassIndex(23857);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20349h(K k, V v, ReferenceQueue<V> referenceQueue) {
        super(v, referenceQueue);
        C89219l.m154719c(referenceQueue, "");
        this.f48223a = k;
    }
}
