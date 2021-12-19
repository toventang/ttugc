package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4601a.C89037ac;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.g */
public final class C89304g<T> implements AbstractC89306h<C89037ac<? extends T>> {

    /* renamed from: a */
    public final AbstractC89306h<T> f202957a;

    static {
        Covode.recordClassIndex(105388);
    }

    /* renamed from: h.l.g$a */
    public static final class C89305a implements AbstractC89196a, Iterator<C89037ac<? extends T>> {

        /* renamed from: a */
        public final Iterator<T> f202958a;

        /* renamed from: b */
        public int f202959b;

        /* renamed from: c */
        final /* synthetic */ C89304g f202960c;

        static {
            Covode.recordClassIndex(105389);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f202958a.hasNext();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            int i = this.f202959b;
            this.f202959b = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            return new C89037ac(i, this.f202958a.next());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89305a(C89304g gVar) {
            this.f202960c = gVar;
            this.f202958a = gVar.f202957a.mo2926a();
        }
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<C89037ac<T>> mo2926a() {
        return new C89305a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89304g(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        this.f202957a = hVar;
    }
}
