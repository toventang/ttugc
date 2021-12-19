package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.ListIterator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bp */
public abstract class AbstractC27477bp<F, T> extends AbstractC27476bo<F, T> implements ListIterator<T> {
    static {
        Covode.recordClassIndex(33057);
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f64803b).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f64803b).nextIndex();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.bp<F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) mo45700a(((ListIterator) this.f64803b).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f64803b).previousIndex();
    }

    AbstractC27477bp(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
