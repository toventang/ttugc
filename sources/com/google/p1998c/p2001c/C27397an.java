package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.google.p1998c.p1999a.C27245k;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.c.c.an */
public final class C27397an {
    static {
        Covode.recordClassIndex(32977);
    }

    /* renamed from: com.google.c.c.an$b */
    enum EnumC27402b implements Iterator<Object> {
        INSTANCE;

        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            C27245k.m54244b(false, (Object) "no calls to next() since the last call to remove()");
        }

        static {
            Covode.recordClassIndex(32982);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.an$a */
    public static final class C27401a<T> extends AbstractC27346a<T> {

        /* renamed from: a */
        static final AbstractC27480bs<Object> f64702a = new C27401a(new Object[0]);

        /* renamed from: b */
        private final T[] f64703b;

        /* renamed from: c */
        private final int f64704c = 0;

        static {
            Covode.recordClassIndex(32981);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p2001c.AbstractC27346a
        /* renamed from: a */
        public final T mo45524a(int i) {
            return this.f64703b[this.f64704c + i];
        }

        private C27401a(T[] tArr) {
            super(0, 0);
            this.f64703b = tArr;
        }
    }

    /* renamed from: b */
    static <T> T m54802b(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: a */
    public static <T> T m54799a(Iterator<? extends T> it) {
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }

    /* renamed from: c */
    static void m54803c(Iterator<?> it) {
        C27245k.m54229a(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: a */
    public static <T> AbstractC27479br<T> m54798a(final Iterator<T> it, final AbstractC27246l<? super T> lVar) {
        C27245k.m54229a(it);
        C27245k.m54229a(lVar);
        return new AbstractC27451b<T>() {
            /* class com.google.p1998c.p2001c.C27397an.C273981 */

            static {
                Covode.recordClassIndex(32978);
            }

            /* access modifiers changed from: protected */
            @Override // com.google.p1998c.p2001c.AbstractC27451b
            /* renamed from: a */
            public final T mo45699a() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (lVar.mo45331a(t)) {
                        return t;
                    }
                }
                return (T) mo45815b();
            }
        };
    }

    /* renamed from: a */
    public static <F, T> Iterator<T> m54800a(Iterator<F> it, final AbstractC27235f<? super F, ? extends T> fVar) {
        C27245k.m54229a(fVar);
        return new AbstractC27476bo<F, T>(it) {
            /* class com.google.p1998c.p2001c.C27397an.C273992 */

            static {
                Covode.recordClassIndex(32979);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27476bo
            /* renamed from: a */
            public final T mo45700a(F f) {
                return (T) fVar.mo45319a(f);
            }
        };
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> boolean m54801a(Collection<T> collection, Iterator<? extends T> it) {
        C27245k.m54229a(collection);
        C27245k.m54229a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
