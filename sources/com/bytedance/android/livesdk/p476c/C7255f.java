package com.bytedance.android.livesdk.p476c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.c.f */
public final class C7255f extends AbstractC7254e {
    static {
        Covode.recordClassIndex(8003);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.p476c.AbstractC7254e
    /* renamed from: a */
    public final float mo13456a(float f) {
        if (f >= 0.0f && f > 1.0f) {
            f = 1.0f;
        }
        return m15168a(this.f18055a, f);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.p476c.AbstractC7254e
    /* renamed from: b */
    public final float[] mo13458b(AbstractC7252c cVar) {
        float[] fArr = new float[100];
        C7256g[] gVarArr = new C7256g[400];
        int i = 0;
        int i2 = 0;
        do {
            C7256g a = cVar.mo13454a(((float) i2) / 399.0f);
            gVarArr[i2] = new C7256g(a.f18057a, a.f18058b);
            i2++;
        } while (i2 < 400);
        int i3 = 0;
        do {
            float f = ((float) i) / 99.0f;
            int i4 = i3;
            int i5 = 399;
            while (i3 <= i5 && gVarArr[i3].f18057a <= f) {
                i4 = (i3 + i5) >>> 1;
                float f2 = gVarArr[i4].f18057a;
                if (f2 >= f) {
                    if (f2 <= f) {
                        break;
                    }
                    i5 = i4 - 1;
                } else {
                    i3 = i4 + 1;
                }
            }
            i3 = i4;
            int min = Math.min(i3 + 1, 399);
            float f3 = gVarArr[i3].f18057a;
            float f4 = gVarArr[min].f18057a;
            float f5 = gVarArr[i3].f18058b;
            float f6 = gVarArr[min].f18058b;
            if (i3 == min || f3 == f4) {
                fArr[i] = f5;
            } else {
                fArr[i] = m15167a(f, f3, f5, f4, f6);
            }
            i++;
        } while (i < 100);
        return fArr;
    }
}
