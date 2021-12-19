package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27241i;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.C27440av;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.ay */
public final class C27448ay<K> {

    /* renamed from: a */
    transient Object[] f64747a;

    /* renamed from: b */
    transient int[] f64748b;

    /* renamed from: c */
    public transient int f64749c;

    /* renamed from: d */
    transient int f64750d;

    /* renamed from: e */
    transient int[] f64751e;

    /* renamed from: f */
    transient long[] f64752f;

    /* renamed from: g */
    private transient float f64753g;

    /* renamed from: h */
    private transient int f64754h;

    static {
        Covode.recordClassIndex(33028);
    }

    /* renamed from: a */
    private static long m54861a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: com.google.c.c.ay$a */
    class C27449a extends C27440av.AbstractC27441a<K> {

        /* renamed from: a */
        final K f64755a;

        /* renamed from: b */
        int f64756b;

        static {
            Covode.recordClassIndex(33029);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au.AbstractC27439a
        /* renamed from: a */
        public final K mo45778a() {
            return this.f64755a;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au.AbstractC27439a
        /* renamed from: b */
        public final int mo45779b() {
            int i = this.f64756b;
            if (i == -1 || i >= C27448ay.this.f64749c || !C27241i.m54222a(this.f64755a, C27448ay.this.f64747a[this.f64756b])) {
                this.f64756b = C27448ay.this.mo45804a(this.f64755a);
            }
            if (this.f64756b == -1) {
                return 0;
            }
            return C27448ay.this.f64748b[this.f64756b];
        }

        C27449a(int i) {
            this.f64755a = (K) C27448ay.this.f64747a[i];
            this.f64756b = i;
        }
    }

    C27448ay() {
        m54863f(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo45802a() {
        if (this.f64749c == 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: g */
    private static int[] m54864g(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: h */
    private static long[] m54865h(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    C27448ay(int i) {
        this(i, (byte) 0);
    }

    /* renamed from: b */
    public final int mo45807b(Object obj) {
        int a = mo45804a(obj);
        if (a == -1) {
            return 0;
        }
        return this.f64748b[a];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo45810c(int i) {
        C27245k.m54228a(i, this.f64749c);
        return this.f64748b[i];
    }

    /* renamed from: i */
    private void m54866i(int i) {
        int length = this.f64752f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                m54867j(max);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final K mo45809b(int i) {
        C27245k.m54228a(i, this.f64749c);
        return (K) this.f64747a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo45811d(int i) {
        if (i > this.f64752f.length) {
            m54867j(i);
        }
        if (i >= this.f64754h) {
            m54868k(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo45812e(int i) {
        return mo45808b(this.f64747a[i], (int) (this.f64752f[i] >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.ay<K> */
    /* JADX WARN: Multi-variable type inference failed */
    C27448ay(C27448ay<? extends K> ayVar) {
        m54863f(ayVar.f64749c);
        int a = ayVar.mo45802a();
        while (a != -1) {
            mo45805a(ayVar.mo45809b(a), ayVar.mo45810c(a));
            a = ayVar.mo45803a(a);
        }
    }

    /* renamed from: f */
    private void m54863f(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54236a(z, "Initial capacity must be non-negative");
        C27245k.m54236a(true, (Object) "Illegal load factor");
        int a = C27535w.m55047a(i, 1.0d);
        this.f64751e = m54864g(a);
        this.f64753g = 1.0f;
        this.f64747a = new Object[i];
        this.f64748b = new int[i];
        this.f64752f = m54865h(i);
        this.f64754h = Math.max(1, (int) (((float) a) * 1.0f));
    }

    /* renamed from: j */
    private void m54867j(int i) {
        this.f64747a = Arrays.copyOf(this.f64747a, i);
        this.f64748b = Arrays.copyOf(this.f64748b, i);
        long[] jArr = this.f64752f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f64752f = copyOf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo45803a(int i) {
        int i2 = i + 1;
        if (i2 < this.f64749c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: k */
    private void m54868k(int i) {
        if (this.f64751e.length >= 1073741824) {
            this.f64754h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f64753g)) + 1;
        int[] g = m54864g(i);
        long[] jArr = this.f64752f;
        int length = g.length - 1;
        for (int i3 = 0; i3 < this.f64749c; i3++) {
            int i4 = (int) (jArr[i3] >>> 32);
            int i5 = i4 & length;
            int i6 = g[i5];
            g[i5] = i3;
            jArr[i3] = (((long) i4) << 32) | (((long) i6) & 4294967295L);
        }
        this.f64754h = i2;
        this.f64751e = g;
    }

    /* renamed from: l */
    private void m54869l(int i) {
        int i2 = this.f64749c - 1;
        if (i < i2) {
            Object[] objArr = this.f64747a;
            objArr[i] = objArr[i2];
            int[] iArr = this.f64748b;
            iArr[i] = iArr[i2];
            objArr[i2] = null;
            iArr[i2] = 0;
            long[] jArr = this.f64752f;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int[] iArr2 = this.f64751e;
            int length = ((int) (j >>> 32)) & (iArr2.length - 1);
            int i3 = iArr2[length];
            if (i3 == i2) {
                iArr2[length] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.f64752f;
                long j2 = jArr2[i3];
                int i4 = (int) j2;
                if (i4 == i2) {
                    jArr2[i3] = m54861a(j2, i);
                    return;
                }
                i3 = i4;
            }
        } else {
            this.f64747a[i] = null;
            this.f64748b[i] = 0;
            this.f64752f[i] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo45804a(Object obj) {
        int a = C27535w.m55048a(obj);
        int[] iArr = this.f64751e;
        int i = iArr[(iArr.length - 1) & a];
        while (i != -1) {
            long j = this.f64752f[i];
            if (((int) (j >>> 32)) == a && C27241i.m54222a(obj, this.f64747a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    private C27448ay(int i, byte b) {
        m54863f(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo45808b(Object obj, int i) {
        int[] iArr = this.f64751e;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f64752f[i2] >>> 32)) != i || !C27241i.m54222a(obj, this.f64747a[i2])) {
                int i4 = (int) this.f64752f[i2];
                if (i4 == -1) {
                    return 0;
                }
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.f64748b[i2];
                if (i3 == -1) {
                    this.f64751e[length] = (int) this.f64752f[i2];
                } else {
                    long[] jArr = this.f64752f;
                    jArr[i3] = m54861a(jArr[i3], (int) jArr[i2]);
                }
                m54869l(i2);
                this.f64749c--;
                this.f64750d++;
                return i5;
            }
        }
    }

    /* renamed from: a */
    public final int mo45805a(K k, int i) {
        C27511k.m54995b(i, "count");
        long[] jArr = this.f64752f;
        Object[] objArr = this.f64747a;
        int[] iArr = this.f64748b;
        int a = C27535w.m55048a(k);
        int[] iArr2 = this.f64751e;
        int length = (iArr2.length - 1) & a;
        int i2 = this.f64749c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) != a || !C27241i.m54222a(k, objArr[i3])) {
                    int i4 = (int) j;
                    if (i4 == -1) {
                        jArr[i3] = m54861a(j, i2);
                        break;
                    }
                    i3 = i4;
                } else {
                    int i5 = iArr[i3];
                    iArr[i3] = i;
                    return i5;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i6 = i2 + 1;
            m54866i(i6);
            m54862a(i2, k, i, a);
            this.f64749c = i6;
            if (i2 >= this.f64754h) {
                m54868k(this.f64751e.length * 2);
            }
            this.f64750d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo45806a(int i, int i2) {
        C27245k.m54228a(i, this.f64749c);
        this.f64748b[i] = i2;
    }

    /* renamed from: a */
    private void m54862a(int i, K k, int i2, int i3) {
        this.f64752f[i] = (((long) i3) << 32) | 4294967295L;
        this.f64747a[i] = k;
        this.f64748b[i] = i2;
    }
}
