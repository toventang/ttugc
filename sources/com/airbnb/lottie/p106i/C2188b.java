package com.airbnb.lottie.p106i;

import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.i.b */
public final class C2188b {
    static {
        Covode.recordClassIndex(2383);
    }

    /* renamed from: b */
    private static float m6767b(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: a */
    private static float m6765a(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: a */
    public static int m6766a(float f, int i, int i2) {
        if (C2144d.C2145a.f6479a && i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float b = m6767b(((float) ((i >> 16) & 255)) / 255.0f);
        float b2 = m6767b(((float) ((i >> 8) & 255)) / 255.0f);
        float b3 = m6767b(((float) (i & 255)) / 255.0f);
        float b4 = m6767b(((float) ((i2 >> 16) & 255)) / 255.0f);
        float b5 = b2 + ((m6767b(((float) ((i2 >> 8) & 255)) / 255.0f) - b2) * f);
        return (Math.round(m6765a(b + ((b4 - b) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((i2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m6765a(b5) * 255.0f) << 8) | Math.round(m6765a(b3 + (f * (m6767b(((float) (i2 & 255)) / 255.0f) - b3))) * 255.0f);
    }
}
