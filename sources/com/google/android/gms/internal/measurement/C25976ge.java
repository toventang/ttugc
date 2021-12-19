package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ge */
final class C25976ge extends AbstractC25934ev<Float> implements AbstractC26033ic, RandomAccess {

    /* renamed from: a */
    private static final C25976ge f61225a;

    /* renamed from: b */
    private float[] f61226b;

    /* renamed from: c */
    private int f61227c;

    public final int size() {
        return this.f61227c;
    }

    C25976ge() {
        this(new float[10], 0);
    }

    static {
        Covode.recordClassIndex(31391);
        C25976ge geVar = new C25976ge(new float[0], 0);
        f61225a = geVar;
        geVar.mo42371b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f61227c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f61226b[i2]);
        }
        return i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Float f) {
        mo42605a(f.floatValue());
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
        m50547b(i);
        return Float.valueOf(this.f61226b[i]);
    }

    /* renamed from: b */
    private final void m50547b(int i) {
        if (i < 0 || i >= this.f61227c) {
            throw new IndexOutOfBoundsException(m50548c(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25995gs
    /* renamed from: a */
    public final /* synthetic */ AbstractC25995gs mo42382a(int i) {
        if (i >= this.f61227c) {
            return new C25976ge(Arrays.copyOf(this.f61226b, i), this.f61227c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f61226b[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private final String m50548c(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.f61227c).toString();
    }

    /* renamed from: a */
    public final void mo42605a(float f) {
        mo42372c();
        int i = this.f61227c;
        float[] fArr = this.f61226b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f61226b = fArr2;
        }
        float[] fArr3 = this.f61226b;
        int i2 = this.f61227c;
        this.f61227c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25976ge)) {
            return super.equals(obj);
        }
        C25976ge geVar = (C25976ge) obj;
        if (this.f61227c != geVar.f61227c) {
            return false;
        }
        float[] fArr = geVar.f61226b;
        for (int i = 0; i < this.f61227c; i++) {
            if (Float.floatToIntBits(this.f61226b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Float remove(int i) {
        mo42372c();
        m50547b(i);
        float[] fArr = this.f61226b;
        float f = fArr[i];
        int i2 = this.f61227c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f61227c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        mo42372c();
        C25989gm.m50599a(collection);
        if (!(collection instanceof C25976ge)) {
            return super.addAll(collection);
        }
        C25976ge geVar = (C25976ge) collection;
        int i = geVar.f61227c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f61227c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f61226b;
            if (i3 > fArr.length) {
                this.f61226b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(geVar.f61226b, 0, this.f61226b, this.f61227c, geVar.f61227c);
            this.f61227c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean remove(Object obj) {
        mo42372c();
        for (int i = 0; i < this.f61227c; i++) {
            if (obj.equals(Float.valueOf(this.f61226b[i]))) {
                float[] fArr = this.f61226b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f61227c - i) - 1);
                this.f61227c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private C25976ge(float[] fArr, int i) {
        this.f61226b = fArr;
        this.f61227c = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Float set(int i, Float f) {
        float floatValue = f.floatValue();
        mo42372c();
        m50547b(i);
        float[] fArr = this.f61226b;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42372c();
        if (i2 >= i) {
            float[] fArr = this.f61226b;
            System.arraycopy(fArr, i2, fArr, i, this.f61227c - i2);
            this.f61227c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ void add(int i, Float f) {
        int i2;
        float floatValue = f.floatValue();
        mo42372c();
        if (i < 0 || i > (i2 = this.f61227c)) {
            throw new IndexOutOfBoundsException(m50548c(i));
        }
        float[] fArr = this.f61226b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f61226b, i, fArr2, i + 1, this.f61227c - i);
            this.f61226b = fArr2;
        }
        this.f61226b[i] = floatValue;
        this.f61227c++;
        this.modCount++;
    }
}
