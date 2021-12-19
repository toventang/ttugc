package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hd */
final class C26007hd extends AbstractC25934ev<Long> implements AbstractC25992gp, AbstractC26033ic, RandomAccess {

    /* renamed from: a */
    static final C26007hd f61283a;

    /* renamed from: b */
    private long[] f61284b;

    /* renamed from: c */
    private int f61285c;

    public final int size() {
        return this.f61285c;
    }

    C26007hd() {
        this(new long[10], 0);
    }

    static {
        Covode.recordClassIndex(31422);
        C26007hd hdVar = new C26007hd(new long[0], 0);
        f61283a = hdVar;
        hdVar.mo42371b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f61285c; i2++) {
            long j = this.f61284b[i2];
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25992gp
    /* renamed from: b */
    public final long mo42639b(int i) {
        m50641d(i);
        return this.f61284b[i];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Long l) {
        mo42662a(l.longValue());
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
        return Long.valueOf(mo42639b(i));
    }

    /* renamed from: d */
    private final void m50641d(int i) {
        if (i < 0 || i >= this.f61285c) {
            throw new IndexOutOfBoundsException(m50642e(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25992gp
    /* renamed from: c */
    public final AbstractC25992gp mo42382a(int i) {
        if (i >= this.f61285c) {
            return new C26007hd(Arrays.copyOf(this.f61284b, i), this.f61285c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f61284b[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    private final String m50642e(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.f61285c).toString();
    }

    /* renamed from: a */
    public final void mo42662a(long j) {
        mo42372c();
        int i = this.f61285c;
        long[] jArr = this.f61284b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f61284b = jArr2;
        }
        long[] jArr3 = this.f61284b;
        int i2 = this.f61285c;
        this.f61285c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26007hd)) {
            return super.equals(obj);
        }
        C26007hd hdVar = (C26007hd) obj;
        if (this.f61285c != hdVar.f61285c) {
            return false;
        }
        long[] jArr = hdVar.f61284b;
        for (int i = 0; i < this.f61285c; i++) {
            if (this.f61284b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Long remove(int i) {
        mo42372c();
        m50641d(i);
        long[] jArr = this.f61284b;
        long j = jArr[i];
        int i2 = this.f61285c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f61285c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        mo42372c();
        C25989gm.m50599a(collection);
        if (!(collection instanceof C26007hd)) {
            return super.addAll(collection);
        }
        C26007hd hdVar = (C26007hd) collection;
        int i = hdVar.f61285c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f61285c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f61284b;
            if (i3 > jArr.length) {
                this.f61284b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(hdVar.f61284b, 0, this.f61284b, this.f61285c, hdVar.f61285c);
            this.f61285c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev
    public final boolean remove(Object obj) {
        mo42372c();
        for (int i = 0; i < this.f61285c; i++) {
            if (obj.equals(Long.valueOf(this.f61284b[i]))) {
                long[] jArr = this.f61284b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f61285c - i) - 1);
                this.f61285c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private C26007hd(long[] jArr, int i) {
        this.f61284b = jArr;
        this.f61285c = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ Long set(int i, Long l) {
        long longValue = l.longValue();
        mo42372c();
        m50641d(i);
        long[] jArr = this.f61284b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42372c();
        if (i2 >= i) {
            long[] jArr = this.f61284b;
            System.arraycopy(jArr, i2, jArr, i, this.f61285c - i2);
            this.f61285c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25934ev, java.util.AbstractList
    public final /* synthetic */ void add(int i, Long l) {
        int i2;
        long longValue = l.longValue();
        mo42372c();
        if (i < 0 || i > (i2 = this.f61285c)) {
            throw new IndexOutOfBoundsException(m50642e(i));
        }
        long[] jArr = this.f61284b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f61284b, i, jArr2, i + 1, this.f61285c - i);
            this.f61284b = jArr2;
        }
        this.f61284b[i] = longValue;
        this.f61285c++;
        this.modCount++;
    }
}
