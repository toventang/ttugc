package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2004f.C27560a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: com.google.c.c.ap */
public final class C27404ap {
    static {
        Covode.recordClassIndex(32984);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.ap$b */
    public static class C27406b<T> extends AbstractList<T> {

        /* renamed from: a */
        public final List<T> f64707a;

        static {
            Covode.recordClassIndex(32986);
        }

        public void clear() {
            this.f64707a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
        public Iterator<T> iterator() {
            return listIterator();
        }

        public int size() {
            return this.f64707a.size();
        }

        C27406b(List<T> list) {
            this.f64707a = (List) C27245k.m54229a(list);
        }

        /* renamed from: b */
        private int m54812b(int i) {
            int size = size();
            C27245k.m54228a(i, size);
            return (size - 1) - i;
        }

        /* renamed from: a */
        public final int mo45706a(int i) {
            int size = size();
            C27245k.m54242b(i, size);
            return size - i;
        }

        @Override // java.util.List, java.util.AbstractList
        public T get(int i) {
            return this.f64707a.get(m54812b(i));
        }

        @Override // java.util.List, java.util.AbstractList
        public ListIterator<T> listIterator(int i) {
            final ListIterator<T> listIterator = this.f64707a.listIterator(mo45706a(i));
            return new ListIterator<T>() {
                /* class com.google.p1998c.p2001c.C27404ap.C27406b.C274071 */

                /* renamed from: a */
                boolean f64708a;

                static {
                    Covode.recordClassIndex(32987);
                }

                public final boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public final boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                public final int nextIndex() {
                    return C27406b.this.mo45706a(listIterator.nextIndex());
                }

                public final void remove() {
                    C27245k.m54244b(this.f64708a, "no calls to next() since the last call to remove()");
                    listIterator.remove();
                    this.f64708a = false;
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final T next() {
                    if (hasNext()) {
                        this.f64708a = true;
                        return (T) listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public final T previous() {
                    if (hasPrevious()) {
                        this.f64708a = true;
                        return (T) listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public final void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.f64708a = false;
                }

                @Override // java.util.ListIterator
                public final void set(T t) {
                    C27245k.m54243b(this.f64708a);
                    listIterator.set(t);
                }
            };
        }

        @Override // java.util.List, java.util.AbstractList
        public T remove(int i) {
            return this.f64707a.remove(m54812b(i));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.List, java.util.AbstractList
        public void add(int i, T t) {
            this.f64707a.add(mo45706a(i), t);
        }

        @Override // java.util.List, java.util.AbstractList
        public T set(int i, T t) {
            return this.f64707a.set(m54812b(i), t);
        }

        @Override // java.util.List, java.util.AbstractList
        public List<T> subList(int i, int i2) {
            C27245k.m54234a(i, i2, size());
            return C27404ap.m54810a((List) this.f64707a.subList(mo45706a(i2), mo45706a(i)));
        }
    }

    /* renamed from: com.google.c.c.ap$c */
    static class C27408c<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f64711a;

        /* renamed from: b */
        final AbstractC27235f<? super F, ? extends T> f64712b;

        static {
            Covode.recordClassIndex(32988);
        }

        public final void clear() {
            this.f64711a.clear();
        }

        public final boolean isEmpty() {
            return this.f64711a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
        public final Iterator<T> iterator() {
            return listIterator();
        }

        public final int size() {
            return this.f64711a.size();
        }

        @Override // java.util.List, java.util.AbstractList
        public final T get(int i) {
            return (T) this.f64712b.mo45319a(this.f64711a.get(i));
        }

        @Override // java.util.List, java.util.AbstractList
        public final ListIterator<T> listIterator(int i) {
            return new AbstractC27477bp<F, T>(this.f64711a.listIterator(i)) {
                /* class com.google.p1998c.p2001c.C27404ap.C27408c.C274091 */

                static {
                    Covode.recordClassIndex(32989);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2001c.AbstractC27476bo
                /* renamed from: a */
                public final T mo45700a(F f) {
                    return (T) C27408c.this.f64712b.mo45319a(f);
                }
            };
        }

        @Override // java.util.List, java.util.AbstractList
        public final T remove(int i) {
            return (T) this.f64712b.mo45319a(this.f64711a.remove(i));
        }

        C27408c(List<F> list, AbstractC27235f<? super F, ? extends T> fVar) {
            this.f64711a = (List) C27245k.m54229a(list);
            this.f64712b = (AbstractC27235f) C27245k.m54229a(fVar);
        }
    }

    /* renamed from: com.google.c.c.ap$d */
    static class C27410d<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f64714a;

        /* renamed from: b */
        final AbstractC27235f<? super F, ? extends T> f64715b;

        static {
            Covode.recordClassIndex(32990);
        }

        public final void clear() {
            this.f64714a.clear();
        }

        public final int size() {
            return this.f64714a.size();
        }

        @Override // java.util.List, java.util.AbstractList, java.util.AbstractSequentialList
        public final ListIterator<T> listIterator(int i) {
            return new AbstractC27477bp<F, T>(this.f64714a.listIterator(i)) {
                /* class com.google.p1998c.p2001c.C27404ap.C27410d.C274111 */

                static {
                    Covode.recordClassIndex(32991);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2001c.AbstractC27476bo
                /* renamed from: a */
                public final T mo45700a(F f) {
                    return (T) C27410d.this.f64715b.mo45319a(f);
                }
            };
        }

        C27410d(List<F> list, AbstractC27235f<? super F, ? extends T> fVar) {
            this.f64714a = (List) C27245k.m54229a(list);
            this.f64715b = (AbstractC27235f) C27245k.m54229a(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.ap$a */
    public static class C27405a<T> extends C27406b<T> implements RandomAccess {
        static {
            Covode.recordClassIndex(32985);
        }

        C27405a(List<T> list) {
            super(list);
        }
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m54808a(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        C27397an.m54801a(arrayList, it);
        return arrayList;
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m54807a(Iterable<? extends E> iterable) {
        C27245k.m54229a(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return m54808a(iterable.iterator());
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m54809a(E... eArr) {
        C27245k.m54229a(eArr);
        int length = eArr.length;
        C27511k.m54993a(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(C27560a.m55098a(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    /* renamed from: a */
    public static <T> List<T> m54810a(List<T> list) {
        if (list instanceof AbstractC27540z) {
            return ((AbstractC27540z) list).reverse();
        }
        if (list instanceof C27406b) {
            return ((C27406b) list).f64707a;
        }
        if (list instanceof RandomAccess) {
            return new C27405a(list);
        }
        return new C27406b(list);
    }

    /* renamed from: a */
    public static <F, T> List<T> m54811a(List<F> list, AbstractC27235f<? super F, ? extends T> fVar) {
        if (list instanceof RandomAccess) {
            return new C27408c(list, fVar);
        }
        return new C27410d(list, fVar);
    }
}
