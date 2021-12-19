package com.facebook.p1814a.p1821f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.a.f.a */
public final class C23949a {

    /* renamed from: a */
    public float[] f56693a;

    /* renamed from: b */
    int[] f56694b;

    /* renamed from: c */
    private int f56695c;

    static {
        Covode.recordClassIndex(28070);
    }

    public C23949a(int[] iArr) {
        this.f56694b = iArr;
        int b = m45276b(iArr);
        this.f56695c = b;
        this.f56693a = new float[b];
    }

    /* renamed from: b */
    private static int m45276b(int[] iArr) {
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo39448a(int[] iArr) {
        this.f56694b = iArr;
        int b = m45276b(iArr);
        float[] fArr = new float[b];
        System.arraycopy(this.f56693a, 0, fArr, 0, Math.min(this.f56695c, b));
        this.f56693a = fArr;
        this.f56695c = b;
    }
}
