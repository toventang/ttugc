package com.bytedance.android.livesdk.p476c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.c.e */
public abstract class AbstractC7254e {

    /* renamed from: a */
    protected float[] f18055a;

    /* renamed from: b */
    private AbstractC7252c f18056b;

    static {
        Covode.recordClassIndex(8002);
    }

    /* renamed from: a */
    protected static float m15167a(float f, float f2, float f3, float f4, float f5) {
        return f3 + (((f - f2) / (f4 - f2)) * (f5 - f3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo13456a(float f);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract float[] mo13458b(AbstractC7252c cVar);

    /* renamed from: a */
    public final void mo13457a(AbstractC7252c cVar) {
        this.f18056b = cVar;
        this.f18055a = mo13458b(cVar);
    }

    /* renamed from: a */
    protected static float m15168a(float[] fArr, float f) {
        int length = fArr.length - 1;
        float f2 = (float) length;
        float f3 = 1.0f / f2;
        int i = (int) (f2 * f);
        int min = Math.min(i + 1, length);
        if (i == min) {
            return fArr[length];
        }
        float f4 = ((float) i) * f3;
        return m15167a(f, f4, fArr[i], f3 + f4, fArr[min]);
    }
}
