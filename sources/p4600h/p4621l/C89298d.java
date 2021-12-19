package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.d */
public final class C89298d<T> implements AbstractC89306h<T> {

    /* renamed from: a */
    public final AbstractC89306h<T> f202939a;

    /* renamed from: b */
    public final boolean f202940b;

    /* renamed from: c */
    public final AbstractC89172b<T, Boolean> f202941c;

    static {
        Covode.recordClassIndex(105382);
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<T> mo2926a() {
        return new C89299a(this);
    }

    /* renamed from: h.l.d$a */
    public static final class C89299a implements AbstractC89196a, Iterator<T> {

        /* renamed from: a */
        public final Iterator<T> f202942a;

        /* renamed from: b */
        public int f202943b = -1;

        /* renamed from: c */
        public T f202944c;

        /* renamed from: d */
        final /* synthetic */ C89298d f202945d;

        static {
            Covode.recordClassIndex(105383);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f202943b == -1) {
                m154781a();
            }
            if (this.f202943b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f202943b == -1) {
                m154781a();
            }
            if (this.f202943b != 0) {
                T t = this.f202944c;
                this.f202944c = null;
                this.f202943b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final void m154781a() {
            while (this.f202942a.hasNext()) {
                T next = this.f202942a.next();
                if (this.f202945d.f202941c.invoke(next).booleanValue() == this.f202945d.f202940b) {
                    this.f202944c = next;
                    this.f202943b = 1;
                    return;
                }
            }
            this.f202943b = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89299a(C89298d dVar) {
            this.f202945d = dVar;
            this.f202942a = dVar.f202939a.mo2926a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89298d(AbstractC89306h<? extends T> hVar, boolean z, AbstractC89172b<? super T, Boolean> bVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        this.f202939a = hVar;
        this.f202940b = z;
        this.f202941c = bVar;
    }
}
