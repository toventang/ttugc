package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.by */
public final class C26818by {

    /* renamed from: a */
    public int f63607a;

    /* renamed from: b */
    private byte[] f63608b = new byte[4096];

    /* renamed from: c */
    private int f63609c;

    /* renamed from: d */
    private long f63610d;

    /* renamed from: e */
    private long f63611e;

    /* renamed from: f */
    private int f63612f;

    /* renamed from: g */
    private int f63613g;

    /* renamed from: h */
    private boolean f63614h;

    /* renamed from: i */
    private String f63615i;

    static {
        Covode.recordClassIndex(32293);
    }

    public C26818by() {
        m53274b();
    }

    /* renamed from: a */
    private final int m53273a(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f63609c;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f63608b, this.f63609c, min);
        int i5 = this.f63609c + min;
        this.f63609c = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* renamed from: b */
    private void m53274b() {
        this.f63609c = 0;
        this.f63612f = -1;
        this.f63610d = -1;
        this.f63614h = false;
        this.f63607a = 30;
        this.f63611e = -1;
        this.f63613g = -1;
        this.f63615i = null;
    }

    /* renamed from: a */
    public final int mo44513a(byte[] bArr, int i, int i2) {
        int a = m53273a(30, bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        if (this.f63610d == -1) {
            long a2 = C26816bw.m53264a(this.f63608b, 0);
            this.f63610d = a2;
            if (a2 == 67324752) {
                this.f63614h = false;
                this.f63611e = C26816bw.m53264a(this.f63608b, 18);
                this.f63613g = C26816bw.m53269b(this.f63608b, 8);
                this.f63612f = C26816bw.m53269b(this.f63608b, 26);
                int b = this.f63612f + 30 + C26816bw.m53269b(this.f63608b, 28);
                this.f63607a = b;
                int length = this.f63608b.length;
                if (length < b) {
                    do {
                        length += length;
                    } while (length < b);
                    this.f63608b = Arrays.copyOf(this.f63608b, length);
                }
            } else {
                this.f63614h = true;
            }
        }
        int a3 = m53273a(this.f63607a, bArr, i + a, i2 - a);
        if (a3 == -1) {
            return -1;
        }
        int i3 = a + a3;
        if (!this.f63614h && this.f63615i == null) {
            this.f63615i = new String(this.f63608b, 30, this.f63612f);
        }
        return i3;
    }

    /* renamed from: a */
    public final C26839cs mo44514a() {
        int i = this.f63609c;
        int i2 = this.f63607a;
        if (i < i2) {
            return C26839cs.m53304a(this.f63615i, this.f63611e, this.f63613g, true, Arrays.copyOf(this.f63608b, i), this.f63614h);
        }
        C26839cs a = C26839cs.m53304a(this.f63615i, this.f63611e, this.f63613g, false, Arrays.copyOf(this.f63608b, i2), this.f63614h);
        m53274b();
        return a;
    }
}
