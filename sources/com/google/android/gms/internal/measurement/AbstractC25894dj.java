package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.dj */
public abstract class AbstractC25894dj<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f61031a = new Object[0];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object[] mo42294a() {
        return null;
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo42300d();

    /* renamed from: zzb */
    public abstract AbstractC25920ei<E> iterator();

    AbstractC25894dj() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo42297b() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo42298c() {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f61031a);
    }

    static {
        Covode.recordClassIndex(31309);
    }

    public AbstractC25893di<E> zzc() {
        if (isEmpty()) {
            return AbstractC25893di.zza();
        }
        Object[] array = toArray();
        return AbstractC25893di.m50110a(array, array.length);
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

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C25866ci.m50065a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] a = mo42294a();
            if (a != null) {
                return (T[]) Arrays.copyOfRange(a, mo42297b(), mo42298c(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo42278b(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo42278b(Object[] objArr, int i) {
        Iterator it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }
}
