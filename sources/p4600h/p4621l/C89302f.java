package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.f */
public final class C89302f<T> implements AbstractC89306h<T> {

    /* renamed from: a */
    public final AbstractC89171a<T> f202952a;

    /* renamed from: b */
    public final AbstractC89172b<T, T> f202953b;

    static {
        Covode.recordClassIndex(105386);
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<T> mo2926a() {
        return new C89303a(this);
    }

    /* renamed from: h.l.f$a */
    public static final class C89303a implements AbstractC89196a, Iterator<T> {

        /* renamed from: a */
        public T f202954a;

        /* renamed from: b */
        public int f202955b = -2;

        /* renamed from: c */
        final /* synthetic */ C89302f f202956c;

        static {
            Covode.recordClassIndex(105387);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f202955b < 0) {
                m154785a();
            }
            if (this.f202955b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f202955b < 0) {
                m154785a();
            }
            if (this.f202955b != 0) {
                T t = this.f202954a;
                Objects.requireNonNull(t, "null cannot be cast to non-null type T");
                this.f202955b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final void m154785a() {
            T invoke;
            int i;
            if (this.f202955b == -2) {
                invoke = this.f202956c.f202952a.invoke();
            } else {
                AbstractC89172b<T, T> bVar = this.f202956c.f202953b;
                T t = this.f202954a;
                if (t == null) {
                    C89219l.m154715b();
                }
                invoke = bVar.invoke(t);
            }
            this.f202954a = invoke;
            if (invoke == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f202955b = i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89303a(C89302f fVar) {
            this.f202956c = fVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89302f(AbstractC89171a<? extends T> aVar, AbstractC89172b<? super T, ? extends T> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f202952a = aVar;
        this.f202953b = bVar;
    }
}
