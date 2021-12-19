package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.q */
public final class C89327q<T> implements AbstractC89296b<T> {

    /* renamed from: a */
    public final AbstractC89306h<T> f202978a;

    /* renamed from: b */
    public final int f202979b = 5;

    static {
        Covode.recordClassIndex(105411);
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<T> mo2926a() {
        return new C89328a(this);
    }

    /* renamed from: h.l.q$a */
    public static final class C89328a implements AbstractC89196a, Iterator<T> {

        /* renamed from: a */
        public int f202980a;

        /* renamed from: b */
        public final Iterator<T> f202981b;

        /* renamed from: c */
        final /* synthetic */ C89327q f202982c;

        static {
            Covode.recordClassIndex(105412);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f202980a <= 0 || !this.f202981b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.f202980a;
            if (i != 0) {
                this.f202980a = i - 1;
                return this.f202981b.next();
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89328a(C89327q qVar) {
            this.f202982c = qVar;
            this.f202980a = qVar.f202979b;
            this.f202981b = qVar.f202978a.mo2926a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89327q(AbstractC89306h<? extends T> hVar, int i) {
        C89219l.m154721d(hVar, "");
        this.f202978a = hVar;
    }
}
