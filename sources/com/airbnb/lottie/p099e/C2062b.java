package com.airbnb.lottie.p099e;

import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.b */
public final class C2062b {

    /* renamed from: a */
    public final String f6170a;

    /* renamed from: b */
    public final String f6171b;

    /* renamed from: c */
    public final double f6172c;

    /* renamed from: d */
    final int f6173d;

    /* renamed from: e */
    public final int f6174e;

    /* renamed from: f */
    final double f6175f;

    /* renamed from: g */
    public final double f6176g;

    /* renamed from: h */
    public final int f6177h;

    /* renamed from: i */
    public final int f6178i;

    /* renamed from: j */
    public final int f6179j;

    /* renamed from: k */
    public final boolean f6180k;

    static {
        Covode.recordClassIndex(2257);
    }

    public final int hashCode() {
        double hashCode = (double) (((this.f6170a.hashCode() * 31) + this.f6171b.hashCode()) * 31);
        double d = this.f6172c;
        Double.isNaN(hashCode);
        int i = (((((int) (hashCode + d)) * 31) + this.f6173d) * 31) + this.f6174e;
        long doubleToLongBits = Double.doubleToLongBits(this.f6175f);
        return (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f6177h;
    }

    public C2062b(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, int i5, boolean z) {
        this.f6170a = str;
        this.f6171b = str2;
        this.f6172c = d;
        this.f6173d = i;
        this.f6174e = i2;
        this.f6175f = d2;
        this.f6176g = d3;
        this.f6177h = i3;
        this.f6178i = i4;
        this.f6179j = i5;
        this.f6180k = z;
    }
}
