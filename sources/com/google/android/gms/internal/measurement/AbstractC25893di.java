package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.di */
public abstract class AbstractC25893di<E> extends AbstractC25894dj<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private static final AbstractC25919eh<Object> f61030a = new C25896dl(C25910dz.f61055a, 0);

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final AbstractC25893di<E> zzc() {
        return this;
    }

    AbstractC25893di() {
    }

    public static <E> AbstractC25893di<E> zza() {
        return (AbstractC25893di<E>) C25910dz.f61055a;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.measurement.AbstractC25894dj, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final AbstractC25920ei<E> zzb() {
        return (AbstractC25920ei) listIterator();
    }

    static {
        Covode.recordClassIndex(31308);
    }

    public AbstractC25893di<E> zzd() {
        if (size() <= 1) {
            return this;
        }
        return new C25895dk(this);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public static <E> AbstractC25893di<E> zza(E e) {
        Object[] objArr = {e};
        int i = 0;
        do {
            C25908dx.m50132a(objArr[0], 0);
            i++;
        } while (i <= 0);
        return m50110a(objArr, 1);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        C25866ci.m50070b(i, size());
        if (isEmpty()) {
            return f61030a;
        }
        return new C25896dl(this, i);
    }

    public boolean equals(Object obj) {
        if (obj == C25866ci.m50065a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C25865ch.m50063a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!C25865ch.m50063a(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    static <E> AbstractC25893di<E> m50110a(Object[] objArr, int i) {
        return i == 0 ? (AbstractC25893di<E>) C25910dz.f61055a : new C25910dz(objArr, i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: b */
    public int mo42278b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: zza */
    public AbstractC25893di<E> subList(int i, int i2) {
        C25866ci.m50068a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (AbstractC25893di<E>) C25910dz.f61055a : new C25898dn(this, i, i3);
    }
}
