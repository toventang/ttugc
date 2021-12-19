package com.p2082ss.android.p2160ml;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ml.b */
public final class C30073b {

    /* renamed from: a */
    private static final float f71779a = Float.intBitsToFloat(1056964608);

    static {
        Covode.recordClassIndex(36569);
    }

    /* renamed from: a */
    public static void m60831a(String str, Float[] fArr, int i) {
        int i2;
        int i3;
        float intBitsToFloat;
        int i4 = 0;
        while (i4 < str.length() / 4 && i4 < i) {
            char[] cArr = new char[4];
            int i5 = i4 * 4;
            str.getChars(i5, i5 + 4, cArr, 0);
            int parseInt = Integer.parseInt(new String(cArr), 16) & 65535;
            int i6 = 32768 & parseInt;
            int i7 = (parseInt >>> 10) & 31;
            int i8 = parseInt & 1023;
            if (i7 != 0) {
                i2 = i8 << 13;
                if (i7 == 31) {
                    i3 = 255;
                } else {
                    i3 = (i7 - 15) + 127;
                }
                intBitsToFloat = Float.intBitsToFloat(i2 | (i6 << 16) | (i3 << 23));
            } else if (i8 != 0) {
                intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - f71779a;
                if (i6 != 0) {
                    intBitsToFloat = -intBitsToFloat;
                }
            } else {
                i2 = 0;
                i3 = 0;
                intBitsToFloat = Float.intBitsToFloat(i2 | (i6 << 16) | (i3 << 23));
            }
            fArr[i4] = Float.valueOf(intBitsToFloat);
            i4++;
        }
    }
}
