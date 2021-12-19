package com.bytedance.lottie.p1505f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lottie.f.c */
public final class C21081c {
    static {
        Covode.recordClassIndex(24697);
    }

    /* renamed from: b */
    private static float m39689b(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: a */
    private static float m39687a(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: a */
    public static int m39688a(float f, int i, int i2) {
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float b = m39689b(((float) ((i >> 16) & 255)) / 255.0f);
        float b2 = m39689b(((float) ((i >> 8) & 255)) / 255.0f);
        float b3 = m39689b(((float) (i & 255)) / 255.0f);
        float b4 = m39689b(((float) ((i2 >> 16) & 255)) / 255.0f);
        float b5 = b2 + ((m39689b(((float) ((i2 >> 8) & 255)) / 255.0f) - b2) * f);
        return (Math.round(m39687a(b + ((b4 - b) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((i2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m39687a(b5) * 255.0f) << 8) | Math.round(m39687a(b3 + (f * (m39689b(((float) (i2 & 255)) / 255.0f) - b3))) * 255.0f);
    }
}
