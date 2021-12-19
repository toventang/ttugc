package com.bytedance.android.ecommerce.ocr.p167b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.b.a */
public final class C2872a {

    /* renamed from: a */
    private float[] f8537a;

    /* renamed from: b */
    private int[] f8538b;

    static {
        Covode.recordClassIndex(3298);
    }

    /* renamed from: a */
    public final int mo7469a(int i, int i2) {
        if (i < 0 || i > 3) {
            return 0;
        }
        int i3 = (int) (this.f8537a[i] * ((float) i2));
        int i4 = i % 2;
        int[] iArr = this.f8538b;
        if (i3 > iArr[i4]) {
            i3 = iArr[i4];
        }
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public C2872a(float f, float f2, float f3, float f4, int i, int i2) {
        float[] fArr = new float[4];
        this.f8537a = fArr;
        int[] iArr = new int[2];
        this.f8538b = iArr;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        iArr[0] = i;
        iArr[1] = i2;
    }
}
