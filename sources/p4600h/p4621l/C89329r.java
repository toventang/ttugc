package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.r */
public final class C89329r<T, R> implements AbstractC89306h<R> {

    /* renamed from: a */
    public final AbstractC89306h<T> f202983a;

    /* renamed from: b */
    public final AbstractC89172b<T, R> f202984b;

    static {
        Covode.recordClassIndex(105413);
    }

    /* renamed from: h.l.r$a */
    public static final class C89330a implements AbstractC89196a, Iterator<R> {

        /* renamed from: a */
        public final Iterator<T> f202985a;

        /* renamed from: b */
        final /* synthetic */ C89329r f202986b;

        static {
            Covode.recordClassIndex(105414);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f202985a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return this.f202986b.f202984b.invoke(this.f202985a.next());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89330a(C89329r rVar) {
            this.f202986b = rVar;
            this.f202985a = rVar.f202983a.mo2926a();
        }
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<R> mo2926a() {
        return new C89330a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89329r(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, ? extends R> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        this.f202983a = hVar;
        this.f202984b = bVar;
    }
}
