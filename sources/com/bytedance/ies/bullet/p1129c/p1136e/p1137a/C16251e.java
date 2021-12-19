package com.bytedance.ies.bullet.p1129c.p1136e.p1137a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.e.a.e */
public final class C16251e<T, R> implements AbstractC16249c<R> {

    /* renamed from: a */
    private WeakReference<T> f39040a;

    /* renamed from: b */
    private final AbstractC89172b<T, R> f39041b;

    static {
        Covode.recordClassIndex(18544);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        WeakReference<T> weakReference = this.f39040a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f39040a = null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c
    /* renamed from: b */
    public final R mo25823b() {
        T t;
        WeakReference<T> weakReference = this.f39040a;
        if (weakReference == null || (t = weakReference.get()) == null) {
            return null;
        }
        return this.f39041b.invoke(t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16251e(T t, AbstractC89172b<? super T, ? extends R> bVar) {
        C89219l.m154719c(bVar, "");
        this.f39041b = bVar;
        this.f39040a = new WeakReference<>(t);
    }
}
