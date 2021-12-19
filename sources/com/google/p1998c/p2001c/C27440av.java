package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27241i;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27438au;
import com.google.p1998c.p2001c.C27471bk;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.c.c.av */
public final class C27440av {
    static {
        Covode.recordClassIndex(33020);
    }

    /* renamed from: com.google.c.c.av$a */
    static abstract class AbstractC27441a<E> implements AbstractC27438au.AbstractC27439a<E> {
        static {
            Covode.recordClassIndex(33021);
        }

        AbstractC27441a() {
        }

        public int hashCode() {
            int hashCode;
            E a = mo45778a();
            if (a == null) {
                hashCode = 0;
            } else {
                hashCode = a.hashCode();
            }
            return hashCode ^ mo45779b();
        }

        public String toString() {
            String valueOf = String.valueOf(mo45778a());
            int b = mo45779b();
            if (b == 1) {
                return valueOf;
            }
            return valueOf + " x " + b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AbstractC27438au.AbstractC27439a) {
                AbstractC27438au.AbstractC27439a aVar = (AbstractC27438au.AbstractC27439a) obj;
                if (mo45779b() != aVar.mo45779b() || !C27241i.m54222a(mo45778a(), aVar.mo45778a())) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.c.c.av$b */
    static abstract class AbstractC27442b<E> extends C27471bk.AbstractC27472a<E> {
        static {
            Covode.recordClassIndex(33022);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC27438au<E> mo45785a();

        AbstractC27442b() {
        }

        public void clear() {
            mo45785a().clear();
        }

        public boolean isEmpty() {
            return mo45785a().isEmpty();
        }

        public int size() {
            return mo45785a().entrySet().size();
        }

        public boolean contains(Object obj) {
            return mo45785a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo45785a().containsAll(collection);
        }

        public boolean remove(Object obj) {
            if (mo45785a().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.c.c.av$c */
    static abstract class AbstractC27443c<E> extends C27471bk.AbstractC27472a<AbstractC27438au.AbstractC27439a<E>> {
        static {
            Covode.recordClassIndex(33023);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC27438au<E> mo45792a();

        AbstractC27443c() {
        }

        public void clear() {
            mo45792a().clear();
        }

        public boolean remove(Object obj) {
            if (obj instanceof AbstractC27438au.AbstractC27439a) {
                AbstractC27438au.AbstractC27439a aVar = (AbstractC27438au.AbstractC27439a) obj;
                E e = (E) aVar.mo45778a();
                int b = aVar.mo45779b();
                if (b != 0) {
                    return mo45792a().setCount(e, b, 0);
                }
            }
            return false;
        }

        public boolean contains(Object obj) {
            if (obj instanceof AbstractC27438au.AbstractC27439a) {
                AbstractC27438au.AbstractC27439a aVar = (AbstractC27438au.AbstractC27439a) obj;
                if (aVar.mo45779b() > 0 && mo45792a().count(aVar.mo45778a()) == aVar.mo45779b()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.c.c.av$d */
    static class C27444d<E> extends AbstractC27441a<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final E f64738a;

        /* renamed from: b */
        private final int f64739b;

        static {
            Covode.recordClassIndex(33024);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au.AbstractC27439a
        /* renamed from: a */
        public final E mo45778a() {
            return this.f64738a;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au.AbstractC27439a
        /* renamed from: b */
        public final int mo45779b() {
            return this.f64739b;
        }

        C27444d(E e, int i) {
            this.f64738a = e;
            this.f64739b = i;
            C27511k.m54993a(i, "count");
        }
    }

    /* renamed from: com.google.c.c.av$e */
    static final class C27445e<E> implements Iterator<E> {

        /* renamed from: a */
        private final AbstractC27438au<E> f64740a;

        /* renamed from: b */
        private final Iterator<AbstractC27438au.AbstractC27439a<E>> f64741b;

        /* renamed from: c */
        private AbstractC27438au.AbstractC27439a<E> f64742c;

        /* renamed from: d */
        private int f64743d;

        /* renamed from: e */
        private int f64744e;

        /* renamed from: f */
        private boolean f64745f;

        static {
            Covode.recordClassIndex(33025);
        }

        public final boolean hasNext() {
            if (this.f64743d > 0 || this.f64741b.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (hasNext()) {
                if (this.f64743d == 0) {
                    AbstractC27438au.AbstractC27439a<E> next = this.f64741b.next();
                    this.f64742c = next;
                    int b = next.mo45779b();
                    this.f64743d = b;
                    this.f64744e = b;
                }
                this.f64743d--;
                this.f64745f = true;
                return this.f64742c.mo45778a();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C27245k.m54244b(this.f64745f, "no calls to next() since the last call to remove()");
            if (this.f64744e == 1) {
                this.f64741b.remove();
            } else {
                this.f64740a.remove(this.f64742c.mo45778a());
            }
            this.f64744e--;
            this.f64745f = false;
        }

        C27445e(AbstractC27438au<E> auVar, Iterator<AbstractC27438au.AbstractC27439a<E>> it) {
            this.f64740a = auVar;
            this.f64741b = it;
        }
    }

    /* renamed from: a */
    static boolean m54853a(AbstractC27438au<?> auVar, Object obj) {
        if (obj == auVar) {
            return true;
        }
        if (obj instanceof AbstractC27438au) {
            AbstractC27438au auVar2 = (AbstractC27438au) obj;
            if (auVar.size() == auVar2.size() && auVar.entrySet().size() == auVar2.entrySet().size()) {
                for (AbstractC27438au.AbstractC27439a aVar : auVar2.entrySet()) {
                    if (auVar.count(aVar.mo45778a()) != aVar.mo45779b()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
