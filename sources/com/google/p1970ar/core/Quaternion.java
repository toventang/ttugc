package com.google.p1970ar.core;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.Quaternion */
public class Quaternion {

    /* renamed from: a */
    public static final Quaternion f64065a = new Quaternion();

    /* renamed from: w */
    public float f64066w = 1.0f;

    /* renamed from: x */
    public float f64067x;

    /* renamed from: y */
    public float f64068y;

    /* renamed from: z */
    public float f64069z;

    /* renamed from: a */
    private void m53841a(float f, float f2, float f3, float f4) {
        this.f64067x = f;
        this.f64068y = f2;
        this.f64069z = f3;
        this.f64066w = f4;
    }

    static {
        Covode.recordClassIndex(32613);
    }

    public Quaternion() {
        m53841a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public final String toString() {
        return C1764a.m5928a("[%.3f, %.3f, %.3f, %.3f]", new Object[]{Float.valueOf(this.f64067x), Float.valueOf(this.f64068y), Float.valueOf(this.f64069z), Float.valueOf(this.f64066w)});
    }

    public Quaternion(Quaternion quaternion) {
        m53841a(quaternion.f64067x, quaternion.f64068y, quaternion.f64069z, quaternion.f64066w);
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        m53841a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public static void m53842a(Quaternion quaternion, float[] fArr, int i, float[] fArr2, int i2) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = quaternion.f64067x;
        float f5 = quaternion.f64068y;
        float f6 = quaternion.f64069z;
        float f7 = quaternion.f64066w;
        float f8 = ((f7 * f) + (f5 * f3)) - (f6 * f2);
        float f9 = ((f7 * f2) + (f6 * f)) - (f4 * f3);
        float f10 = ((f7 * f3) + (f4 * f2)) - (f5 * f);
        float f11 = -f4;
        float f12 = ((f * f11) - (f2 * f5)) - (f3 * f6);
        float f13 = -f6;
        float f14 = -f5;
        fArr2[i2] = (((f8 * f7) + (f12 * f11)) + (f9 * f13)) - (f10 * f14);
        fArr2[i2 + 1] = (((f9 * f7) + (f12 * f14)) + (f10 * f11)) - (f8 * f13);
        fArr2[i2 + 2] = (((f10 * f7) + (f12 * f13)) + (f8 * f14)) - (f9 * f11);
    }
}
