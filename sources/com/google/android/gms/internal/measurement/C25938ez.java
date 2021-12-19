package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ez */
final class C25938ez extends AbstractC25934ev<Boolean> implements AbstractC26033ic, RandomAccess {

    /* renamed from: a */
    private static final C25938ez f61090a;

    /* renamed from: b */
    private boolean[] f61091b;

    /* renamed from: c */
    private int f61092c;

    public final int size() {
        return this.f61092c;
    }

    C25938ez() {
        this(new boolean[10], 0);
    }

    static {
        Covode.recordClassIndex(31353);
        C25938ez ezVar = new C25938ez(new boolean[0], 0);
        f61090a = ezVar;
        ezVar.mo42371b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f61092c; i2++) {
            i = (i * 31) + C25989gm.m50598a(this.f61091b[i2]);
        }
        return i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Boolean bool) {
        mo42383a(bool.booleanValue());
        return true;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        m50207b(i);
        return Boolean.valueOf(this.f61091b[i]);
    }

    /* renamed from: b */
    private final void m50207b(int i) {
        if (i < 0 || i >= this.f61092c) {
            throw new IndexOutOfBoundsException(m50208c(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: a */
    public final /* synthetic */ AbstractC25995gs mo42382a(int i) {
        if (i >= this.f61092c) {
            return new C25938ez(Arrays.copyOf(this.f61091b, i), this.f61092c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f61091b[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private final String m50208c(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.f61092c).toString();
    }

    /* renamed from: a */
    public final void mo42383a(boolean z) {
        mo42372c();
        int i = this.f61092c;
        boolean[] zArr = this.f61091b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f61091b = zArr2;
        }
        boolean[] zArr3 = this.f61091b;
        int i2 = this.f61092c;
        this.f61092c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25938ez)) {
            return super.equals(obj);
        }
        C25938ez ezVar = (C25938ez) obj;
        if (this.f61092c != ezVar.f61092c) {
            return false;
        }
        boolean[] zArr = ezVar.f61091b;
        for (int i = 0; i < this.f61092c; i++) {
            if (this.f61091b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Boolean remove(int i) {
        mo42372c();
        m50207b(i);
        boolean[] zArr = this.f61091b;
        boolean z = zArr[i];
        int i2 = this.f61092c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f61092c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo42372c();
        C25989gm.m50599a(collection);
        if (!(collection instanceof C25938ez)) {
            return super.addAll(collection);
        }
        C25938ez ezVar = (C25938ez) collection;
        int i = ezVar.f61092c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f61092c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f61091b;
            if (i3 > zArr.length) {
                this.f61091b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(ezVar.f61091b, 0, this.f61091b, this.f61092c, ezVar.f61092c);
            this.f61092c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean remove(Object obj) {
        mo42372c();
        for (int i = 0; i < this.f61092c; i++) {
            if (obj.equals(Boolean.valueOf(this.f61091b[i]))) {
                boolean[] zArr = this.f61091b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f61092c - i) - 1);
                this.f61092c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private C25938ez(boolean[] zArr, int i) {
        this.f61091b = zArr;
        this.f61092c = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Boolean set(int i, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        mo42372c();
        m50207b(i);
        boolean[] zArr = this.f61091b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42372c();
        if (i2 >= i) {
            boolean[] zArr = this.f61091b;
            System.arraycopy(zArr, i2, zArr, i, this.f61092c - i2);
            this.f61092c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ void add(int i, Boolean bool) {
        int i2;
        boolean booleanValue = bool.booleanValue();
        mo42372c();
        if (i < 0 || i > (i2 = this.f61092c)) {
            throw new IndexOutOfBoundsException(m50208c(i));
        }
        boolean[] zArr = this.f61091b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f61091b, i, zArr2, i + 1, this.f61092c - i);
            this.f61091b = zArr2;
        }
        this.f61091b[i] = booleanValue;
        this.f61092c++;
        this.modCount++;
    }
}
