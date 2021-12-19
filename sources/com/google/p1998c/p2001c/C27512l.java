package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27247m;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.c.c.l */
public final class C27512l {
    static {
        Covode.recordClassIndex(33092);
    }

    /* renamed from: com.google.c.c.l$b */
    static class C27514b<F, T> extends AbstractCollection<T> {

        /* renamed from: a */
        final Collection<F> f64856a;

        /* renamed from: b */
        final AbstractC27235f<? super F, ? extends T> f64857b;

        static {
            Covode.recordClassIndex(33094);
        }

        public final void clear() {
            this.f64856a.clear();
        }

        public final boolean isEmpty() {
            return this.f64856a.isEmpty();
        }

        public final int size() {
            return this.f64856a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return C27397an.m54800a(this.f64856a.iterator(), this.f64857b);
        }

        C27514b(Collection<F> collection, AbstractC27235f<? super F, ? extends T> fVar) {
            this.f64856a = (Collection) C27245k.m54229a(collection);
            this.f64857b = (AbstractC27235f) C27245k.m54229a(fVar);
        }
    }

    /* renamed from: com.google.c.c.l$a */
    static class C27513a<E> extends AbstractCollection<E> {

        /* renamed from: a */
        final Collection<E> f64854a;

        /* renamed from: b */
        final AbstractC27246l<? super E> f64855b;

        static {
            Covode.recordClassIndex(33093);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return C27397an.m54798a(this.f64854a.iterator(), this.f64855b);
        }

        public final Object[] toArray() {
            return C27404ap.m54808a(iterator()).toArray();
        }

        public final int size() {
            int i = 0;
            for (E e : this.f64854a) {
                if (this.f64855b.mo45331a(e)) {
                    i++;
                }
            }
            return i;
        }

        public final void clear() {
            Collection<E> collection = this.f64854a;
            AbstractC27246l<? super E> lVar = this.f64855b;
            if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
                Iterator<T> it = collection.iterator();
                C27245k.m54229a(lVar);
                while (it.hasNext()) {
                    if (lVar.mo45331a(it.next())) {
                        it.remove();
                    }
                }
                return;
            }
            C27394am.m54794a((List) collection, (AbstractC27246l) C27245k.m54229a(lVar));
        }

        public final boolean isEmpty() {
            Collection<E> collection = this.f64854a;
            AbstractC27246l<? super E> lVar = this.f64855b;
            Iterator<T> it = collection.iterator();
            C27245k.m54230a(lVar, "predicate");
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (lVar.mo45331a(it.next())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(E e) {
            C27245k.m54235a(this.f64855b.mo45331a(e));
            return this.f64854a.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                C27245k.m54235a(this.f64855b.mo45331a(it.next()));
            }
            return this.f64854a.addAll(collection);
        }

        public final boolean contains(Object obj) {
            if (C27512l.m54998a((Collection<?>) this.f64854a, obj)) {
                return this.f64855b.mo45331a(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!contains(obj) || !this.f64854a.remove(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C27404ap.m54808a(iterator()).toArray(tArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f64854a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f64855b.mo45331a(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f64854a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f64855b.mo45331a(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        C27513a(Collection<E> collection, AbstractC27246l<? super E> lVar) {
            this.f64854a = collection;
            this.f64855b = lVar;
        }
    }

    /* renamed from: a */
    public static <F, T> Collection<T> m54996a(Collection<F> collection, AbstractC27235f<? super F, T> fVar) {
        return new C27514b(collection, fVar);
    }

    /* renamed from: a */
    static boolean m54998a(Collection<?> collection, Object obj) {
        C27245k.m54229a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.google.c.a.l[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <E> Collection<E> m54997a(Collection<E> collection, AbstractC27246l<? super E> lVar) {
        if (!(collection instanceof C27513a)) {
            return new C27513a((Collection) C27245k.m54229a(collection), (AbstractC27246l) C27245k.m54229a(lVar));
        }
        C27513a aVar = (C27513a) collection;
        return new C27513a(aVar.f64854a, new C27247m.C27248a(Arrays.asList(C27245k.m54229a(aVar.f64855b), C27245k.m54229a(lVar)), (byte) 0));
    }
}
