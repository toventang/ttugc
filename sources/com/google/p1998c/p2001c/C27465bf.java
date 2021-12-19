package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bf */
public final class C27465bf<E> extends AbstractC27390ak<E> {

    /* renamed from: b */
    static final C27465bf<Comparable> f64796b = new C27465bf<>(AbstractC27540z.m55062of(), C27446aw.f64746a);

    /* renamed from: c */
    final transient AbstractC27540z<E> f64797c;

    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27536x
    public final AbstractC27540z<E> asList() {
        return this.f64797c;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.Collection, java.util.Set, java.util.NavigableSet, com.google.p1998c.p2001c.AbstractC27390ak, com.google.p1998c.p2001c.AbstractC27390ak, java.lang.Iterable, java.util.AbstractCollection, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x
    public final AbstractC27479br<E> iterator() {
        return this.f64797c.iterator();
    }

    public final int size() {
        return this.f64797c.size();
    }

    @Override // java.util.NavigableSet, com.google.p1998c.p2001c.AbstractC27390ak, com.google.p1998c.p2001c.AbstractC27390ak
    public final AbstractC27479br<E> descendingIterator() {
        return this.f64797c.reverse().iterator();
    }

    static {
        Covode.recordClassIndex(33045);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27390ak
    /* renamed from: b */
    public final AbstractC27390ak<E> mo45674b() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return m54760a(reverseOrder);
        }
        return new C27465bf(this.f64797c.reverse(), reverseOrder);
    }

    @Override // java.util.SortedSet, com.google.p1998c.p2001c.AbstractC27390ak
    public final E first() {
        if (!isEmpty()) {
            return this.f64797c.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet, com.google.p1998c.p2001c.AbstractC27390ak
    public final E last() {
        if (!isEmpty()) {
            return this.f64797c.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return this.f64797c.mo45578a();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f64797c, obj, this.comparator) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet, com.google.p1998c.p2001c.AbstractC27390ak
    public final E ceiling(E e) {
        int d = m54915d(e, true);
        if (d == size()) {
            return null;
        }
        return this.f64797c.get(d);
    }

    @Override // java.util.NavigableSet, com.google.p1998c.p2001c.AbstractC27390ak
    public final E floor(E e) {
        int c = m54914c(e, true) - 1;
        if (c == -1) {
            return null;
        }
        return this.f64797c.get(c);
    }

    @Override // java.util.NavigableSet, com.google.p1998c.p2001c.AbstractC27390ak
    public final E higher(E e) {
        int d = m54915d(e, false);
        if (d == size()) {
            return null;
        }
        return this.f64797c.get(d);
    }

    @Override // java.util.NavigableSet, com.google.p1998c.p2001c.AbstractC27390ak
    public final E lower(E e) {
        int c = m54914c(e, false) - 1;
        if (c == -1) {
            return null;
        }
        return this.f64797c.get(c);
    }

    @Override // java.util.Collection, java.util.Set, java.util.AbstractCollection
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof AbstractC27438au) {
            collection = ((AbstractC27438au) collection).elementSet();
        }
        if (!C27475bn.m54937a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC27479br<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int a = mo45671a(next2, next);
                if (a >= 0) {
                    if (a != 0) {
                        break;
                    } else if (!it2.hasNext()) {
                        return true;
                    } else {
                        next = it2.next();
                    }
                } else if (!it.hasNext()) {
                    return false;
                } else {
                    next2 = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 != r6) goto L_0x0004
            return r5
        L_0x0004:
            boolean r0 = r7 instanceof java.util.Set
            r4 = 0
            if (r0 != 0) goto L_0x000a
            return r4
        L_0x000a:
            java.util.Set r7 = (java.util.Set) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 == r0) goto L_0x0017
            return r4
        L_0x0017:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x001e
            return r5
        L_0x001e:
            java.util.Comparator r0 = r6.comparator
            boolean r0 = com.google.p1998c.p2001c.C27475bn.m54937a(r0, r7)
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r3 = r7.iterator()
            com.google.c.c.br r2 = r6.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r0 = r2.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r2.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r0 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            int r0 = r6.mo45671a(r1, r0)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r0 == 0) goto L_0x002e
        L_0x0044:
            return r4
        L_0x0045:
            return r5
        L_0x0046:
            return r4
        L_0x0047:
            boolean r0 = r6.containsAll(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2001c.C27465bf.equals(java.lang.Object):boolean");
    }

    C27465bf(AbstractC27540z<E> zVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f64797c = zVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final int mo45633a(Object[] objArr, int i) {
        return this.f64797c.mo45633a(objArr, i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27390ak
    /* renamed from: a */
    public final AbstractC27390ak<E> mo45672a(E e, boolean z) {
        return m54913a(0, m54914c(e, z));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27390ak
    /* renamed from: b */
    public final AbstractC27390ak<E> mo45675b(E e, boolean z) {
        return m54913a(m54915d(e, z), size());
    }

    /* renamed from: a */
    private C27465bf<E> m54913a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C27465bf<>(this.f64797c.subList(i, i2), this.comparator);
        }
        return m54760a(this.comparator);
    }

    /* renamed from: c */
    private int m54914c(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f64797c, C27245k.m54229a(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    /* renamed from: d */
    private int m54915d(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f64797c, C27245k.m54229a(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27390ak
    /* renamed from: a */
    public final AbstractC27390ak<E> mo45673a(E e, boolean z, E e2, boolean z2) {
        return mo45675b(e, z).mo45672a(e2, z2);
    }
}
