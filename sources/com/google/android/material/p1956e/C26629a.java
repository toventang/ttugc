package com.google.android.material.p1956e;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.e.a */
public final class C26629a {
    static {
        Covode.recordClassIndex(32077);
    }

    /* renamed from: a */
    public static float m52822a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static boolean m52824a(float f, float f2) {
        return f + 1.0E-4f >= f2;
    }

    /* renamed from: c */
    private static float m52826c(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: b */
    private static float m52825b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static float m52823a(float f, float f2, float f3, float f4) {
        return m52826c(m52825b(f, f2, 0.0f, 0.0f), m52825b(f, f2, f3, 0.0f), m52825b(f, f2, f3, f4), m52825b(f, f2, 0.0f, f4));
    }
}
