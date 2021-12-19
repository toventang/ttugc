package com.bytedance.android.livesdk.util.rxutils.p651b.p652a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88985y;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88717bh;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.b.a.b */
public final class C11185b<T, R> implements AbstractC88985y<T, T> {

    /* renamed from: a */
    private final AbstractC88979t<R> f26812a;

    /* renamed from: b */
    private final R f26813b;

    static {
        Covode.recordClassIndex(12812);
    }

    public final int hashCode() {
        return (this.f26812a.hashCode() * 31) + this.f26813b.hashCode();
    }

    public final String toString() {
        return "UntilEventObservableTransformer{lifecycle=" + this.f26812a + ", event=" + ((Object) this.f26813b) + '}';
    }

    @Override // p4560f.p4561a.AbstractC88985y
    /* renamed from: a */
    public final AbstractC88984x<T> mo17921a(AbstractC88979t<T> tVar) {
        AbstractC88979t<R> b = this.f26812a.mo143268a(new C11184a(this.f26813b)).mo143276b(1);
        C88466b.m153697a((Object) b, "other is null");
        return C88925a.m154171a(new C88717bh(tVar, b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11185b bVar = (C11185b) obj;
        if (!this.f26812a.equals(bVar.f26812a)) {
            return false;
        }
        return this.f26813b.equals(bVar.f26813b);
    }

    public C11185b(AbstractC88979t<R> tVar, R r) {
        this.f26812a = tVar;
        this.f26813b = r;
    }
}
