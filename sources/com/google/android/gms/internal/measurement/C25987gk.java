package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.gk */
final class C25987gk extends AbstractC25934ev<Integer> implements AbstractC25993gq, AbstractC26033ic, RandomAccess {

    /* renamed from: a */
    static final C25987gk f61257a;

    /* renamed from: b */
    private int[] f61258b;

    /* renamed from: c */
    private int f61259c;

    public final int size() {
        return this.f61259c;
    }

    C25987gk() {
        this(new int[10], 0);
    }

    static {
        Covode.recordClassIndex(31402);
        C25987gk gkVar = new C25987gk(new int[0], 0);
        f61257a = gkVar;
        gkVar.mo42371b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f61259c; i2++) {
            i = (i * 31) + this.f61258b[i2];
        }
        return i;
    }

    /* renamed from: c */
    public final int mo42632c(int i) {
        m50591e(i);
        return this.f61258b[i];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Integer num) {
        mo42634d(num.intValue());
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
        return Integer.valueOf(mo42632c(i));
    }

    /* renamed from: e */
    private final void m50591e(int i) {
        if (i < 0 || i >= this.f61259c) {
            throw new IndexOutOfBoundsException(m50592f(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25993gq
    /* renamed from: b */
    public final AbstractC25993gq mo42382a(int i) {
        if (i >= this.f61259c) {
            return new C25987gk(Arrays.copyOf(this.f61258b, i), this.f61259c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f61258b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    private final String m50592f(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.f61259c).toString();
    }

    /* renamed from: d */
    public final void mo42634d(int i) {
        mo42372c();
        int i2 = this.f61259c;
        int[] iArr = this.f61258b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f61258b = iArr2;
        }
        int[] iArr3 = this.f61258b;
        int i3 = this.f61259c;
        this.f61259c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25987gk)) {
            return super.equals(obj);
        }
        C25987gk gkVar = (C25987gk) obj;
        if (this.f61259c != gkVar.f61259c) {
            return false;
        }
        int[] iArr = gkVar.f61258b;
        for (int i = 0; i < this.f61259c; i++) {
            if (this.f61258b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Integer remove(int i) {
        mo42372c();
        m50591e(i);
        int[] iArr = this.f61258b;
        int i2 = iArr[i];
        int i3 = this.f61259c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f61259c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        mo42372c();
        C25989gm.m50599a(collection);
        if (!(collection instanceof C25987gk)) {
            return super.addAll(collection);
        }
        C25987gk gkVar = (C25987gk) collection;
        int i = gkVar.f61259c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f61259c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f61258b;
            if (i3 > iArr.length) {
                this.f61258b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(gkVar.f61258b, 0, this.f61258b, this.f61259c, gkVar.f61259c);
            this.f61259c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean remove(Object obj) {
        mo42372c();
        for (int i = 0; i < this.f61259c; i++) {
            if (obj.equals(Integer.valueOf(this.f61258b[i]))) {
                int[] iArr = this.f61258b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f61259c - i) - 1);
                this.f61259c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private C25987gk(int[] iArr, int i) {
        this.f61258b = iArr;
        this.f61259c = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Integer set(int i, Integer num) {
        int intValue = num.intValue();
        mo42372c();
        m50591e(i);
        int[] iArr = this.f61258b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42372c();
        if (i2 >= i) {
            int[] iArr = this.f61258b;
            System.arraycopy(iArr, i2, iArr, i, this.f61259c - i2);
            this.f61259c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ void add(int i, Integer num) {
        int i2;
        int intValue = num.intValue();
        mo42372c();
        if (i < 0 || i > (i2 = this.f61259c)) {
            throw new IndexOutOfBoundsException(m50592f(i));
        }
        int[] iArr = this.f61258b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f61258b, i, iArr2, i + 1, this.f61259c - i);
            this.f61258b = iArr2;
        }
        this.f61258b[i] = intValue;
        this.f61259c++;
        this.modCount++;
    }
}
