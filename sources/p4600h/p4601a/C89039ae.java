package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.ae */
public final class C89039ae<T> implements AbstractC89196a, Iterator<C89037ac<? extends T>> {

    /* renamed from: a */
    private int f202769a;

    /* renamed from: b */
    private final Iterator<T> f202770b;

    static {
        Covode.recordClassIndex(105123);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return this.f202770b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.f202769a;
        this.f202769a = i + 1;
        if (i < 0) {
            C89070n.m154520a();
        }
        return new C89037ac(i, this.f202770b.next());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89039ae(Iterator<? extends T> it) {
        C89219l.m154721d(it, "");
        this.f202770b = it;
    }
}
