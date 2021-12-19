package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.google.p1998c.p2001c.AbstractC27536x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: com.google.c.c.ak */
public abstract class AbstractC27390ak<E> extends AbstractC27393al<E> implements AbstractC27474bm<E>, NavigableSet<E> {

    /* renamed from: a */
    transient AbstractC27390ak<E> f64689a;
    public final transient Comparator<? super E> comparator;

    static {
        Covode.recordClassIndex(32970);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC27390ak<E> mo45672a(E e, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC27390ak<E> mo45673a(E e, boolean z, E e2, boolean z2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract AbstractC27390ak<E> mo45674b();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract AbstractC27390ak<E> mo45675b(E e, boolean z);

    @Override // java.util.NavigableSet
    public abstract AbstractC27479br<E> descendingIterator();

    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.util.NavigableSet, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public abstract AbstractC27479br<E> iterator();

    /* renamed from: of */
    public static <E> AbstractC27390ak<E> m54761of() {
        return C27465bf.f64796b;
    }

    @Override // java.util.SortedSet, com.google.p1998c.p2001c.AbstractC27474bm
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public static <E extends Comparable<?>> C27391a<E> naturalOrder() {
        return new C27391a<>(C27446aw.f64746a);
    }

    @Override // java.util.NavigableSet
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public static <E extends Comparable<?>> C27391a<E> reverseOrder() {
        return new C27391a<>(Collections.reverseOrder());
    }

    @Override // java.util.NavigableSet
    public AbstractC27390ak<E> descendingSet() {
        AbstractC27390ak<E> akVar = this.f64689a;
        if (akVar != null) {
            return akVar;
        }
        AbstractC27390ak<E> b = mo45674b();
        this.f64689a = b;
        b.f64689a = this;
        return b;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27536x
    public Object writeReplace() {
        return new C27392b(this.comparator, toArray());
    }

    /* renamed from: com.google.c.c.ak$a */
    public static final class C27391a<E> extends AbstractC27381ai.C27382a<E> {

        /* renamed from: e */
        private final Comparator<? super E> f64690e;

        static {
            Covode.recordClassIndex(32971);
        }

        /* renamed from: b */
        public final AbstractC27390ak<E> mo45658a() {
            AbstractC27390ak<E> a = AbstractC27390ak.m54759a(this.f64690e, this.f64904b, this.f64903a);
            this.f64904b = a.size();
            this.f64905c = true;
            return a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a
        /* renamed from: a */
        public final /* synthetic */ AbstractC27536x.AbstractC27537a mo45659a(Object obj) {
            super.mo45653b(obj);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC27381ai.C27382a mo45660b(Iterable iterable) {
            super.mo45647a(iterable);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ AbstractC27381ai.C27382a mo45663c(Object obj) {
            super.mo45653b(obj);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC27381ai.C27382a mo45661b(Iterator it) {
            super.mo45648a(it);
            return this;
        }

        /* renamed from: c */
        public final C27391a<E> mo45694c(Iterator<? extends E> it) {
            super.mo45648a((Iterator) it);
            return this;
        }

        public C27391a(Comparator<? super E> comparator) {
            this.f64690e = (Comparator) C27245k.m54229a(comparator);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* synthetic */ AbstractC27536x.AbstractC27538b mo45647a(Iterable iterable) {
            super.mo45647a(iterable);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC27381ai.C27382a mo45662b(Object[] objArr) {
            super.mo45649a(objArr);
            return this;
        }

        /* renamed from: c */
        public final C27391a<E> mo45695c(E... eArr) {
            super.mo45649a((Object[]) eArr);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* synthetic */ AbstractC27536x.AbstractC27538b mo45648a(Iterator it) {
            super.mo45648a(it);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* synthetic */ AbstractC27536x.AbstractC27538b mo45649a(Object[] objArr) {
            super.mo45649a(objArr);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai.C27382a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27537a, com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: b */
        public final /* synthetic */ AbstractC27536x.AbstractC27538b mo45653b(Object obj) {
            super.mo45653b(obj);
            return this;
        }
    }

    /* renamed from: com.google.c.c.ak$b */
    static class C27392b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super E> f64691a;

        /* renamed from: b */
        final Object[] f64692b;

        static {
            Covode.recordClassIndex(32972);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ak$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return new C27391a(this.f64691a).mo45695c(this.f64692b).mo45658a();
        }

        public C27392b(Comparator<? super E> comparator, Object[] objArr) {
            this.f64691a = comparator;
            this.f64692b = objArr;
        }
    }

    AbstractC27390ak(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> AbstractC27390ak<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(C27446aw.f64746a, iterable);
    }

    public static <E> C27391a<E> orderedBy(Comparator<E> comparator2) {
        return new C27391a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public AbstractC27390ak<E> headSet(E e) {
        return headSet((Object) e, false);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public AbstractC27390ak<E> tailSet(E e) {
        return tailSet((Object) e, true);
    }

    public static <E> AbstractC27390ak<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) C27446aw.f64746a, (Collection) collection);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> AbstractC27390ak<E> m54762of(E e) {
        return new C27465bf(AbstractC27540z.m55063of(e), C27446aw.f64746a);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return (E) C27394am.m54797c(tailSet((Object) e, true));
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return (E) C27397an.m54799a(headSet((Object) e, true).descendingIterator());
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return (E) C27394am.m54797c(tailSet((Object) e, false));
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return (E) C27397an.m54799a(headSet((Object) e, false).descendingIterator());
    }

    /* renamed from: a */
    static <E> C27465bf<E> m54760a(Comparator<? super E> comparator2) {
        return C27446aw.f64746a.equals(comparator2) ? (C27465bf<E>) C27465bf.f64796b : new C27465bf<>(AbstractC27540z.m55062of(), comparator2);
    }

    public static <E> AbstractC27390ak<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator a = C27475bn.m54936a(sortedSet);
        AbstractC27540z copyOf = AbstractC27540z.copyOf((Collection) sortedSet);
        if (copyOf.isEmpty()) {
            return m54760a(a);
        }
        return new C27465bf(copyOf, a);
    }

    public static <E> AbstractC27390ak<E> copyOf(Iterator<? extends E> it) {
        return copyOf(C27446aw.f64746a, it);
    }

    public static <E extends Comparable<? super E>> AbstractC27390ak<E> copyOf(E[] eArr) {
        return m54759a(C27446aw.f64746a, eArr.length, (Object[]) eArr.clone());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo45671a(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public AbstractC27390ak<E> subSet(E e, E e2) {
        return subSet((Object) e, true, (Object) e2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ak<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public AbstractC27390ak<E> headSet(E e, boolean z) {
        return mo45672a(C27245k.m54229a(e), z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ak<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public AbstractC27390ak<E> tailSet(E e, boolean z) {
        return mo45675b(C27245k.m54229a(e), z);
    }

    public static <E> AbstractC27390ak<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator2, (Iterable) collection);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> AbstractC27390ak<E> m54763of(E e, E e2) {
        return m54759a(C27446aw.f64746a, 2, e, e2);
    }

    public static <E> AbstractC27390ak<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        C27245k.m54229a(comparator2);
        if (C27475bn.m54937a(comparator2, iterable) && (iterable instanceof AbstractC27390ak)) {
            AbstractC27390ak<E> akVar = (AbstractC27390ak) iterable;
            if (!akVar.mo45578a()) {
                return akVar;
            }
        }
        Object[] a = C27394am.m54795a(iterable);
        return m54759a(comparator2, a.length, a);
    }

    public static <E> AbstractC27390ak<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        return new C27391a(comparator2).mo45694c((Iterator) it).mo45658a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static <E> AbstractC27390ak<E> m54759a(Comparator<? super E> comparator2, int i, E... eArr) {
        if (i == 0) {
            return m54760a(comparator2);
        }
        C27447ax.m54860a((Object[]) eArr, i);
        Arrays.sort(eArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = (Object) eArr[i3];
            if (comparator2.compare(obj, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        int length = eArr.length / 2;
        E[] eArr2 = eArr;
        if (i2 < length) {
            eArr2 = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new C27465bf(AbstractC27540z.m55061b(eArr2, i2), comparator2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> AbstractC27390ak<E> m54764of(E e, E e2, E e3) {
        return m54759a(C27446aw.f64746a, 3, e, e2, e3);
    }

    @Override // java.util.NavigableSet
    public AbstractC27390ak<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        C27245k.m54229a(e);
        C27245k.m54229a(e2);
        if (this.comparator.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C27245k.m54235a(z3);
        return mo45673a(e, z, e2, z2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> AbstractC27390ak<E> m54765of(E e, E e2, E e3, E e4) {
        return m54759a(C27446aw.f64746a, 4, e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> AbstractC27390ak<E> m54766of(E e, E e2, E e3, E e4, E e5) {
        return m54759a(C27446aw.f64746a, 5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> AbstractC27390ak<E> m54767of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return m54759a(C27446aw.f64746a, length, comparableArr);
    }
}
