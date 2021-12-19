package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ja */
public final class C26058ja {

    /* renamed from: a */
    static final C26058ja f61368a = new C26058ja(0, new int[0], new Object[0], false);

    /* renamed from: b */
    int f61369b;

    /* renamed from: c */
    int[] f61370c;

    /* renamed from: d */
    Object[] f61371d;

    /* renamed from: e */
    int f61372e;

    /* renamed from: f */
    boolean f61373f;

    C26058ja() {
        this(0, new int[8], new Object[8], true);
    }

    static {
        Covode.recordClassIndex(31473);
    }

    public final int hashCode() {
        int i = this.f61369b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f61370c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f61371d;
        int i7 = this.f61369b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: a */
    public final int mo42751a() {
        int e;
        int i = this.f61372e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f61369b; i3++) {
            int i4 = this.f61370c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                e = AbstractC25958fq.m50380e(i5, ((Long) this.f61371d[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.f61371d[i3]).longValue();
                e = AbstractC25958fq.m50385g(i5);
            } else if (i6 == 2) {
                e = AbstractC25958fq.m50374c(i5, (AbstractC25943fb) this.f61371d[i3]);
            } else if (i6 == 3) {
                e = (AbstractC25958fq.m50394m(i5 << 3) << 1) + ((C26058ja) this.f61371d[i3]).mo42751a();
            } else if (i6 == 5) {
                ((Integer) this.f61371d[i3]).intValue();
                e = AbstractC25958fq.m50379e(i5);
            } else {
                throw new IllegalStateException(C25994gr.m50612f());
            }
            i2 += e;
        }
        this.f61372e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C26058ja)) {
            return false;
        }
        C26058ja jaVar = (C26058ja) obj;
        int i = this.f61369b;
        if (i == jaVar.f61369b) {
            int[] iArr = this.f61370c;
            int[] iArr2 = jaVar.f61370c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f61371d;
                    Object[] objArr2 = jaVar.f61371d;
                    int i3 = this.f61369b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo42753a(AbstractC26081jt jtVar) {
        if (this.f61369b != 0) {
            if (jtVar.mo42528a() == AbstractC25981gj.C25986e.f61252j) {
                for (int i = 0; i < this.f61369b; i++) {
                    m50900a(this.f61370c[i], this.f61371d[i], jtVar);
                }
                return;
            }
            for (int i2 = this.f61369b - 1; i2 >= 0; i2--) {
                m50900a(this.f61370c[i2], this.f61371d[i2], jtVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42754a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f61369b; i2++) {
            C26025hv.m50749a(sb, i, String.valueOf(this.f61370c[i2] >>> 3), this.f61371d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42752a(int i, Object obj) {
        int i2;
        if (this.f61373f) {
            int i3 = this.f61369b;
            int[] iArr = this.f61370c;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f61370c = Arrays.copyOf(iArr, i4);
                this.f61371d = Arrays.copyOf(this.f61371d, i4);
            }
            int[] iArr2 = this.f61370c;
            int i5 = this.f61369b;
            iArr2[i5] = i;
            this.f61371d[i5] = obj;
            this.f61369b = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static void m50900a(int i, Object obj, AbstractC26081jt jtVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            jtVar.mo42533a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            jtVar.mo42554d(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            jtVar.mo42534a(i2, (AbstractC25943fb) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                jtVar.mo42553d(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C25994gr.m50612f());
        } else if (jtVar.mo42528a() == AbstractC25981gj.C25986e.f61252j) {
            jtVar.mo42529a(i2);
            ((C26058ja) obj).mo42753a(jtVar);
            jtVar.mo42543b(i2);
        } else {
            jtVar.mo42543b(i2);
            ((C26058ja) obj).mo42753a(jtVar);
            jtVar.mo42529a(i2);
        }
    }

    C26058ja(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f61372e = -1;
        this.f61369b = i;
        this.f61370c = iArr;
        this.f61371d = objArr;
        this.f61373f = z;
    }
}
