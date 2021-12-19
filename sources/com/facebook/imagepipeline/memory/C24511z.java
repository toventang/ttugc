package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24119b;
import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.z */
final class C24511z<V> extends C24487f<V> {

    /* renamed from: f */
    private LinkedList<C24119b<V>> f58221f = new LinkedList<>();

    static {
        Covode.recordClassIndex(28655);
    }

    @Override // com.facebook.imagepipeline.memory.C24487f
    /* renamed from: b */
    public final V mo40367b() {
        C24119b<V> bVar = (C24119b) this.f58186c.poll();
        T t = bVar.f57051a == null ? (V) null : bVar.f57051a.get();
        if (bVar.f57051a != null) {
            bVar.f57051a.clear();
            bVar.f57051a = null;
        }
        if (bVar.f57052b != null) {
            bVar.f57052b.clear();
            bVar.f57052b = null;
        }
        if (bVar.f57053c != null) {
            bVar.f57053c.clear();
            bVar.f57053c = null;
        }
        this.f58221f.add(bVar);
        return (V) t;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.imagepipeline.memory.C24487f
    /* renamed from: a */
    public final void mo40366a(V v) {
        C24119b<V> poll = this.f58221f.poll();
        if (poll == null) {
            poll = new C24119b<>();
        }
        poll.f57051a = new SoftReference<>(v);
        poll.f57052b = new SoftReference<>(v);
        poll.f57053c = new SoftReference<>(v);
        this.f58186c.add(poll);
    }

    public C24511z(int i, int i2) {
        super(i, i2, 0, false);
    }
}
