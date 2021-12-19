package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ie */
public final class C26035ie<E> extends AbstractC25934ev<E> implements RandomAccess {

    /* renamed from: a */
    static final C26035ie<Object> f61328a;

    /* renamed from: b */
    private E[] f61329b;

    /* renamed from: c */
    private int f61330c;

    public final int size() {
        return this.f61330c;
    }

    C26035ie() {
        this(new Object[10], 0);
    }

    static {
        Covode.recordClassIndex(31450);
        C26035ie<Object> ieVar = new C26035ie<>(new Object[0], 0);
        f61328a = ieVar;
        ieVar.mo42371b();
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i) {
        m50766b(i);
        return this.f61329b[i];
    }

    /* renamed from: b */
    private final void m50766b(int i) {
        if (i < 0 || i >= this.f61330c) {
            throw new IndexOutOfBoundsException(m50767c(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: a */
    public final /* synthetic */ AbstractC25995gs mo42382a(int i) {
        if (i >= this.f61330c) {
            return new C26035ie(Arrays.copyOf(this.f61329b, i), this.f61330c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    private final String m50767c(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.f61330c).toString();
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection, java.util.AbstractList
    public final boolean add(E e) {
        mo42372c();
        int i = this.f61330c;
        E[] eArr = this.f61329b;
        if (i == eArr.length) {
            this.f61329b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f61329b;
        int i2 = this.f61330c;
        this.f61330c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final E remove(int i) {
        mo42372c();
        m50766b(i);
        E[] eArr = this.f61329b;
        E e = eArr[i];
        int i2 = this.f61330c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f61330c--;
        this.modCount++;
        return e;
    }

    private C26035ie(E[] eArr, int i) {
        this.f61329b = eArr;
        this.f61330c = i;
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final E set(int i, E e) {
        mo42372c();
        m50766b(i);
        E[] eArr = this.f61329b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final void add(int i, E e) {
        int i2;
        mo42372c();
        if (i < 0 || i > (i2 = this.f61330c)) {
            throw new IndexOutOfBoundsException(m50767c(i));
        }
        E[] eArr = this.f61329b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f61329b, i, eArr2, i + 1, this.f61330c - i);
            this.f61329b = eArr2;
        }
        this.f61329b[i] = e;
        this.f61330c++;
        this.modCount++;
    }
}
