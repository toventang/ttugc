package com.bytedance.ies.xelement.bytedlottie;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.bytedlottie.a */
public final class C19045a {

    /* renamed from: a */
    public long f45119a;

    /* renamed from: b */
    public final long[] f45120b = new long[100];

    /* renamed from: c */
    public int f45121c;

    /* renamed from: d */
    public int f45122d;

    /* renamed from: e */
    public double f45123e;

    static {
        Covode.recordClassIndex(21808);
    }

    /* renamed from: a */
    public final float mo30331a() {
        double d = this.f45123e;
        if (this.f45121c > 0) {
            long[] jArr = this.f45120b;
            C89219l.m154721d(jArr, "");
            long j = 0;
            for (long j2 : jArr) {
                j += j2;
            }
            double d2 = (double) j;
            double d3 = this.f45123e;
            int i = this.f45122d;
            double d4 = (double) (i - this.f45121c);
            Double.isNaN(d4);
            Double.isNaN(d2);
            double d5 = (double) i;
            Double.isNaN(d5);
            d = (d2 + (d3 * d4)) / d5;
        }
        this.f45119a = 0;
        this.f45121c = 0;
        this.f45122d = 0;
        this.f45123e = 0.0d;
        float f = (float) d;
        if (f == 0.0f) {
            return 0.0f;
        }
        return 1.0E9f / f;
    }
}
