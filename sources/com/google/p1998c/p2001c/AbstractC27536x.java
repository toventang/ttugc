package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27540z;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.c.c.x */
public abstract class AbstractC27536x<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f64902a = new Object[0];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo45578a();

    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract AbstractC27479br<E> iterator();

    /* renamed from: com.google.c.c.x$b */
    public static abstract class AbstractC27538b<E> {
        static {
            Covode.recordClassIndex(33118);
        }

        /* renamed from: b */
        public abstract AbstractC27538b<E> mo45653b(E e);

        AbstractC27538b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.x$b<E> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public AbstractC27538b<E> mo45648a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo45653b(it.next());
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.x$b<E> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public AbstractC27538b<E> mo45647a(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                mo45653b(it.next());
            }
            return this;
        }

        /* renamed from: a */
        public AbstractC27538b<E> mo45649a(E... eArr) {
            for (E e : eArr) {
                mo45653b(e);
            }
            return this;
        }

        /* renamed from: a */
        static int m55056a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    AbstractC27536x() {
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(33116);
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f64902a;
        }
        Object[] objArr = new Object[size];
        mo45633a(objArr, 0);
        return objArr;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new AbstractC27540z.C27544d(toArray());
    }

    public AbstractC27540z<E> asList() {
        if (isEmpty()) {
            return AbstractC27540z.m55062of();
        }
        Object[] array = toArray();
        return AbstractC27540z.m55061b(array, array.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.x$a */
    public static abstract class AbstractC27537a<E> extends AbstractC27538b<E> {

        /* renamed from: a */
        Object[] f64903a;

        /* renamed from: b */
        int f64904b = 0;

        /* renamed from: c */
        boolean f64905c;

        static {
            Covode.recordClassIndex(33117);
        }

        AbstractC27537a(int i) {
            C27511k.m54993a(i, "initialCapacity");
            this.f64903a = new Object[i];
        }

        /* renamed from: a */
        public AbstractC27537a<E> mo45653b(E e) {
            C27245k.m54229a(e);
            m55051a(this.f64904b + 1);
            Object[] objArr = this.f64903a;
            int i = this.f64904b;
            this.f64904b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: a */
        private void m55051a(int i) {
            Object[] objArr = this.f64903a;
            if (objArr.length < i) {
                this.f64903a = Arrays.copyOf(objArr, m55056a(objArr.length, i));
                this.f64905c = false;
            } else if (this.f64905c) {
                this.f64903a = (Object[]) objArr.clone();
                this.f64905c = false;
            }
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public AbstractC27538b<E> mo45647a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m55051a(this.f64904b + collection.size());
                if (collection instanceof AbstractC27536x) {
                    this.f64904b = ((AbstractC27536x) collection).mo45633a(this.f64903a, this.f64904b);
                    return this;
                }
            }
            super.mo45647a((Iterable) iterable);
            return this;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public AbstractC27538b<E> mo45649a(E... eArr) {
            C27447ax.m54860a((Object[]) eArr, eArr.length);
            m55051a(this.f64904b + eArr.length);
            System.arraycopy(eArr, 0, this.f64903a, this.f64904b, eArr.length);
            this.f64904b += eArr.length;
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C27245k.m54229a(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) C27454ba.m54889a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo45633a(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo45633a(Object[] objArr, int i) {
        AbstractC27479br<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }
}
