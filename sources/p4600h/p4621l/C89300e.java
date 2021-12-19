package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.e */
public final class C89300e<T, R, E> implements AbstractC89306h<E> {

    /* renamed from: a */
    public final AbstractC89306h<T> f202946a;

    /* renamed from: b */
    public final AbstractC89172b<T, R> f202947b;

    /* renamed from: c */
    public final AbstractC89172b<R, Iterator<E>> f202948c;

    static {
        Covode.recordClassIndex(105384);
    }

    /* renamed from: h.l.e$a */
    public static final class C89301a implements AbstractC89196a, Iterator<E> {

        /* renamed from: a */
        public final Iterator<T> f202949a;

        /* renamed from: b */
        public Iterator<? extends E> f202950b;

        /* renamed from: c */
        final /* synthetic */ C89300e f202951c;

        static {
            Covode.recordClassIndex(105385);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return m154783a();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (m154783a()) {
                Iterator<? extends E> it = this.f202950b;
                if (it == null) {
                    C89219l.m154715b();
                }
                return (E) it.next();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final boolean m154783a() {
            Iterator<? extends E> it = this.f202950b;
            if (it != null && !it.hasNext()) {
                this.f202950b = null;
            }
            while (true) {
                if (this.f202950b == null) {
                    if (this.f202949a.hasNext()) {
                        Iterator<E> invoke = this.f202951c.f202948c.invoke(this.f202951c.f202947b.invoke(this.f202949a.next()));
                        if (invoke.hasNext()) {
                            this.f202950b = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89301a(C89300e eVar) {
            this.f202951c = eVar;
            this.f202949a = eVar.f202946a.mo2926a();
        }
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<E> mo2926a() {
        return new C89301a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super R, ? extends java.util.Iterator<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89300e(AbstractC89306h<? extends T> hVar, AbstractC89172b<? super T, ? extends R> bVar, AbstractC89172b<? super R, ? extends Iterator<? extends E>> bVar2) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f202946a = hVar;
        this.f202947b = bVar;
        this.f202948c = bVar2;
    }
}
