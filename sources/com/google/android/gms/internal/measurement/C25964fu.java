package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fu */
final class C25964fu extends AbstractC25934ev<Double> implements AbstractC26033ic, RandomAccess {

    /* renamed from: a */
    private static final C25964fu f61148a;

    /* renamed from: b */
    private double[] f61149b;

    /* renamed from: c */
    private int f61150c;

    public final int size() {
        return this.f61150c;
    }

    C25964fu() {
        this(new double[10], 0);
    }

    static {
        Covode.recordClassIndex(31379);
        C25964fu fuVar = new C25964fu(new double[0], 0);
        f61148a = fuVar;
        fuVar.mo42371b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f61150c; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f61149b[i2]);
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Double d) {
        mo42569a(d.doubleValue());
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
        m50496b(i);
        return Double.valueOf(this.f61149b[i]);
    }

    /* renamed from: b */
    private final void m50496b(int i) {
        if (i < 0 || i >= this.f61150c) {
            throw new IndexOutOfBoundsException(m50497c(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: a */
    public final /* synthetic */ AbstractC25995gs mo42382a(int i) {
        if (i >= this.f61150c) {
            return new C25964fu(Arrays.copyOf(this.f61149b, i), this.f61150c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f61149b[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private final String m50497c(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.f61150c).toString();
    }

    /* renamed from: a */
    public final void mo42569a(double d) {
        mo42372c();
        int i = this.f61150c;
        double[] dArr = this.f61149b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f61149b = dArr2;
        }
        double[] dArr3 = this.f61149b;
        int i2 = this.f61150c;
        this.f61150c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25964fu)) {
            return super.equals(obj);
        }
        C25964fu fuVar = (C25964fu) obj;
        if (this.f61150c != fuVar.f61150c) {
            return false;
        }
        double[] dArr = fuVar.f61149b;
        for (int i = 0; i < this.f61150c; i++) {
            if (Double.doubleToLongBits(this.f61149b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Double remove(int i) {
        mo42372c();
        m50496b(i);
        double[] dArr = this.f61149b;
        double d = dArr[i];
        int i2 = this.f61150c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f61150c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final boolean addAll(Collection<? extends Double> collection) {
        mo42372c();
        C25989gm.m50599a(collection);
        if (!(collection instanceof C25964fu)) {
            return super.addAll(collection);
        }
        C25964fu fuVar = (C25964fu) collection;
        int i = fuVar.f61150c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f61150c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f61149b;
            if (i3 > dArr.length) {
                this.f61149b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(fuVar.f61149b, 0, this.f61149b, this.f61150c, fuVar.f61150c);
            this.f61150c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean remove(Object obj) {
        mo42372c();
        for (int i = 0; i < this.f61150c; i++) {
            if (obj.equals(Double.valueOf(this.f61149b[i]))) {
                double[] dArr = this.f61149b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f61150c - i) - 1);
                this.f61150c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private C25964fu(double[] dArr, int i) {
        this.f61149b = dArr;
        this.f61150c = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Double set(int i, Double d) {
        double doubleValue = d.doubleValue();
        mo42372c();
        m50496b(i);
        double[] dArr = this.f61149b;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42372c();
        if (i2 >= i) {
            double[] dArr = this.f61149b;
            System.arraycopy(dArr, i2, dArr, i, this.f61150c - i2);
            this.f61150c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ void add(int i, Double d) {
        int i2;
        double doubleValue = d.doubleValue();
        mo42372c();
        if (i < 0 || i > (i2 = this.f61150c)) {
            throw new IndexOutOfBoundsException(m50497c(i));
        }
        double[] dArr = this.f61149b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f61149b, i, dArr2, i + 1, this.f61150c - i);
            this.f61149b = dArr2;
        }
        this.f61149b[i] = doubleValue;
        this.f61150c++;
        this.modCount++;
    }
}
