package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.fp */
public final class C25957fp extends AbstractC25955fn {

    /* renamed from: d */
    private final byte[] f61131d;

    /* renamed from: e */
    private final boolean f61132e;

    /* renamed from: f */
    private int f61133f;

    /* renamed from: g */
    private int f61134g;

    /* renamed from: h */
    private int f61135h;

    /* renamed from: i */
    private int f61136i;

    /* renamed from: j */
    private int f61137j;

    /* renamed from: k */
    private int f61138k;

    static {
        Covode.recordClassIndex(31372);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: d */
    public final long mo42433d() {
        return m50335w();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: e */
    public final long mo42435e() {
        return m50335w();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: f */
    public final int mo42436f() {
        return m50334v();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: g */
    public final long mo42437g() {
        return m50337y();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: h */
    public final int mo42438h() {
        return m50336x();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: m */
    public final int mo42443m() {
        return m50334v();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: n */
    public final int mo42444n() {
        return m50334v();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: o */
    public final int mo42445o() {
        return m50336x();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: p */
    public final long mo42446p() {
        return m50337y();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: u */
    public final int mo42451u() {
        return this.f61135h - this.f61136i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: b */
    public final double mo42429b() {
        return Double.longBitsToDouble(m50337y());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: c */
    public final float mo42431c() {
        return Float.intBitsToFloat(m50336x());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: i */
    public final boolean mo42439i() {
        if (m50335w() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: q */
    public final int mo42447q() {
        return m50256e(m50334v());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: r */
    public final long mo42448r() {
        return m50254a(m50335w());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: t */
    public final boolean mo42450t() {
        if (this.f61135h == this.f61133f) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    private final byte m50332A() {
        int i = this.f61135h;
        if (i != this.f61133f) {
            byte[] bArr = this.f61131d;
            this.f61135h = i + 1;
            return bArr[i];
        }
        throw C25994gr.m50607a();
    }

    /* renamed from: z */
    private final void m50338z() {
        int i = this.f61133f + this.f61134g;
        this.f61133f = i;
        int i2 = i - this.f61136i;
        int i3 = this.f61138k;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f61134g = i4;
            this.f61133f = i - i4;
            return;
        }
        this.f61134g = 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: a */
    public final int mo42427a() {
        if (mo42450t()) {
            this.f61137j = 0;
            return 0;
        }
        int v = m50334v();
        this.f61137j = v;
        if ((v >>> 3) != 0) {
            return v;
        }
        throw C25994gr.m50610d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: s */
    public final long mo42449s() {
        long j = 0;
        int i = 0;
        do {
            byte A = m50332A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw C25994gr.m50609c();
    }

    /* renamed from: x */
    private final int m50336x() {
        int i = this.f61135h;
        if (this.f61133f - i >= 4) {
            byte[] bArr = this.f61131d;
            this.f61135h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C25994gr.m50607a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: j */
    public final String mo42440j() {
        int v = m50334v();
        if (v > 0) {
            if (v <= this.f61133f - this.f61135h) {
                String str = new String(this.f61131d, this.f61135h, v, C25989gm.f61260a);
                this.f61135h += v;
                return str;
            }
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw C25994gr.m50608b();
            }
        }
        throw C25994gr.m50607a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: k */
    public final String mo42441k() {
        int v = m50334v();
        if (v > 0) {
            int i = this.f61133f;
            int i2 = this.f61135h;
            if (v <= i - i2) {
                String b = C26071jj.m51025b(this.f61131d, i2, v);
                this.f61135h += v;
                return b;
            }
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw C25994gr.m50608b();
            }
        }
        throw C25994gr.m50607a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: l */
    public final AbstractC25943fb mo42442l() {
        int v = m50334v();
        if (v > 0) {
            int i = this.f61133f;
            int i2 = this.f61135h;
            if (v <= i - i2) {
                AbstractC25943fb zza = AbstractC25943fb.zza(this.f61131d, i2, v);
                this.f61135h += v;
                return zza;
            }
        } else if (v == 0) {
            return AbstractC25943fb.zza;
        } else {
            if (v <= 0) {
                throw C25994gr.m50608b();
            }
        }
        int i3 = this.f61133f;
        int i4 = this.f61135h;
        if (v <= i3 - i4) {
            int i5 = v + i4;
            this.f61135h = i5;
            return new C25954fm(Arrays.copyOfRange(this.f61131d, i4, i5));
        }
        throw C25994gr.m50607a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r4[r2] >= 0) goto L_0x0021;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m50334v() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C25957fp.m50334v():int");
    }

    /* renamed from: y */
    private final long m50337y() {
        int i = this.f61135h;
        if (this.f61133f - i >= 8) {
            byte[] bArr = this.f61131d;
            this.f61135h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C25994gr.m50607a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (((long) r6[r5]) >= 0) goto L_0x006b;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m50335w() {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C25957fp.m50335w():long");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: a */
    public final void mo42428a(int i) {
        if (this.f61137j != i) {
            throw C25994gr.m50611e();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: d */
    public final void mo42434d(int i) {
        this.f61138k = i;
        m50338z();
    }

    /* renamed from: f */
    private final void m50333f(int i) {
        if (i >= 0) {
            int i2 = this.f61133f;
            int i3 = this.f61135h;
            if (i <= i2 - i3) {
                this.f61135h = i3 + i;
                return;
            }
            throw C25994gr.m50607a();
        }
        throw C25994gr.m50608b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: c */
    public final int mo42432c(int i) {
        if (i >= 0) {
            int u = i + mo42451u();
            int i2 = this.f61138k;
            if (u <= i2) {
                this.f61138k = u;
                m50338z();
                return i2;
            }
            throw C25994gr.m50607a();
        }
        throw C25994gr.m50608b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25955fn
    /* renamed from: b */
    public final boolean mo42430b(int i) {
        int a;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f61133f - this.f61135h >= 10) {
                do {
                    byte[] bArr = this.f61131d;
                    int i4 = this.f61135h;
                    this.f61135h = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                } while (i3 < 10);
                throw C25994gr.m50609c();
            }
            while (m50332A() < 0) {
                i3++;
                if (i3 >= 10) {
                    throw C25994gr.m50609c();
                }
            }
            return true;
        } else if (i2 == 1) {
            m50333f(8);
            return true;
        } else if (i2 == 2) {
            m50333f(m50334v());
            return true;
        } else if (i2 == 3) {
            do {
                a = mo42427a();
                if (a == 0) {
                    break;
                }
            } while (mo42430b(a));
            mo42428a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                m50333f(4);
                return true;
            }
            throw C25994gr.m50612f();
        }
    }

    private C25957fp(byte[] bArr, int i) {
        super((byte) 0);
        this.f61138k = Integer.MAX_VALUE;
        this.f61131d = bArr;
        this.f61133f = i + 0;
        this.f61135h = 0;
        this.f61136i = 0;
        this.f61132e = false;
    }

    /* synthetic */ C25957fp(byte[] bArr, int i, byte b) {
        this(bArr, i);
    }
}
