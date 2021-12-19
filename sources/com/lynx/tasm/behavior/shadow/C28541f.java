package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.f */
public class C28541f {
    static {
        Covode.recordClassIndex(34542);
    }

    /* renamed from: a */
    public static long m57091a() {
        return m57092a(0.0f, 0.0f);
    }

    /* renamed from: a */
    public static long m57092a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }
}
