package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.c.c.t */
public abstract class AbstractC27532t<E> extends AbstractC27533u implements Collection<E> {
    static {
        Covode.recordClassIndex(33112);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Collection<E> mo45371c();

    protected AbstractC27532t() {
    }

    public void clear() {
        mo45371c().clear();
    }

    public boolean isEmpty() {
        return mo45371c().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return mo45371c().iterator();
    }

    public int size() {
        return mo45371c().size();
    }

    public Object[] toArray() {
        return mo45371c().toArray();
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        return mo45371c().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return mo45371c().addAll(collection);
    }

    public boolean contains(Object obj) {
        return mo45371c().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return mo45371c().containsAll(collection);
    }

    public boolean remove(Object obj) {
        return mo45371c().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return mo45371c().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return mo45371c().retainAll(collection);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) mo45371c().toArray(tArr);
    }
}
