package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.ad */
public final class C89038ad<T> implements AbstractC89196a, Iterable<C89037ac<? extends T>> {

    /* renamed from: a */
    private final AbstractC89171a<Iterator<T>> f202768a;

    static {
        Covode.recordClassIndex(105122);
    }

    @Override // java.lang.Iterable
    public final Iterator<C89037ac<T>> iterator() {
        return new C89039ae(this.f202768a.invoke());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89038ad(AbstractC89171a<? extends Iterator<? extends T>> aVar) {
        C89219l.m154721d(aVar, "");
        this.f202768a = aVar;
    }
}
