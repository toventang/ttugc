package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ev */
public abstract class AbstractC25934ev<E> extends AbstractList<E> implements AbstractC25995gs<E> {

    /* renamed from: a */
    private boolean f61085a = true;

    static {
        Covode.recordClassIndex(31349);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: b */
    public final void mo42371b() {
        this.f61085a = false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: a */
    public boolean mo42366a() {
        return this.f61085a;
    }

    AbstractC25934ev() {
    }

    public void clear() {
        mo42372c();
        super.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo42372c() {
        if (!this.f61085a) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public E remove(int i) {
        mo42372c();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        mo42372c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        mo42372c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(E e) {
        mo42372c();
        return super.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        mo42372c();
        return super.addAll(collection);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        mo42372c();
        return super.remove(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, E e) {
        mo42372c();
        super.add(i, e);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection<? extends E> collection) {
        mo42372c();
        return super.addAll(i, collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public E set(int i, E e) {
        mo42372c();
        return (E) super.set(i, e);
    }
}
