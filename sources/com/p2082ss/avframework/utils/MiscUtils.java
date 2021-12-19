package com.p2082ss.avframework.utils;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.utils.MiscUtils */
public class MiscUtils {
    private static AtomicInteger mUUIDSuffix = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(100733);
    }

    public static String getUUID(String str) {
        String str2 = System.currentTimeMillis() + "-" + mUUIDSuffix.incrementAndGet();
        if (str != null) {
            return str + "-" + str2;
        }
        return str2;
    }

    public static boolean chooseBestResolution(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        char c;
        int i6;
        int i7;
        boolean z2;
        char c2;
        int i8 = iArr[0];
        int i9 = iArr[1];
        if (iArr.length < 2) {
            return false;
        }
        if (i9 <= 1 || i8 <= 1) {
            if (i > 0 && i2 > 0) {
                if (i3 <= 0) {
                    z2 = true;
                    c2 = 0;
                } else if (i4 <= 0) {
                    c2 = 0;
                    z2 = true;
                }
                iArr[c2] = i;
                char c3 = z2 ? 1 : 0;
                char c4 = z2 ? 1 : 0;
                char c5 = z2 ? 1 : 0;
                iArr[c3] = i2;
                AVLog.iod("MiscUtils", "Using source resolution as adapted resolution(" + i + "x" + i2 + ")");
                return z2;
            } else if (i3 <= 0 || i4 <= 0) {
                return false;
            }
            if (i <= 0 || i2 <= 0) {
                iArr[0] = i3;
                iArr[1] = i4;
                AVLog.iod("MiscUtils", "Using reference resolution as adapted resolution(" + i3 + "x" + i4 + ")");
                return true;
            }
            int max = Math.max(i, i2);
            int min = Math.min(i, i2);
            while (true) {
                max = min;
                if (max == 0) {
                    break;
                }
                min = max % max;
            }
            int i10 = i / max;
            int i11 = i2 / max;
            int i12 = i4 * i3;
            float f = ((((float) i3) * 1.0f) / ((float) i4)) / ((((float) i) * 1.0f) / ((float) i2));
            if (f >= 1.0f) {
                i5 = i3 / i10;
            } else {
                i5 = i4 / i11;
            }
            while (true) {
                if (i5 <= max) {
                    i6 = i10 * i5;
                    i7 = i11 * i5;
                    if (i6 * i7 < i12 || ((f < 1.0f || i6 < i3) && (f > 1.0f || i7 < i4))) {
                        i5++;
                    }
                } else {
                    z = false;
                    if (i5 >= max) {
                        i6 = i;
                        i7 = i2;
                        z = true;
                    } else {
                        c = 2;
                    }
                }
            }
            z = true;
            c = 2;
            i8 = ((i6 + 1) / 2) * 2;
            i9 = ((i7 + 1) / 2) * 2;
            Object[] objArr = new Object[8];
            objArr[0] = Integer.valueOf(i8);
            objArr[1] = Integer.valueOf(i9);
            objArr[c] = Integer.valueOf(i10);
            objArr[3] = Integer.valueOf(i11);
            objArr[4] = Integer.valueOf(i);
            objArr[5] = Integer.valueOf(i2);
            objArr[6] = Integer.valueOf(i3);
            objArr[7] = Integer.valueOf(i4);
            String a = C1764a.m5928a("adapted resolution(%dx%d) aspect(%dx%d) cap(%dx%d) ref(%dx%d)", objArr);
            if (!z) {
                return z;
            }
            iArr[0] = i8;
            iArr[1] = i9;
            AVLog.iod("MiscUtils", "Find best ".concat(String.valueOf(a)));
            return true;
        }
        AVLog.iod("MiscUtils", "Using default adapted resolution(" + i8 + "x" + i9 + ")");
        return true;
    }

    public static boolean cropAndScaleResolution(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3) {
        if (i <= 0 || i2 <= 0 || i4 <= 0 || i3 <= 0) {
            return false;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (f * 1.0f) / f2;
        float f4 = (((float) i3) * 1.0f) / ((float) i4);
        iArr3[0] = i3;
        iArr3[1] = i4;
        if (f3 == f4) {
            iArr[1] = 0;
            iArr[0] = 0;
            iArr2[0] = i;
            iArr2[1] = i2;
            return true;
        }
        if (f3 > f4) {
            iArr2[0] = (int) (f4 * f2);
            iArr2[1] = i2;
            iArr[0] = (i - iArr2[0]) / 2;
            iArr[1] = 0;
        } else {
            iArr2[0] = i;
            iArr2[1] = (int) (f / f4);
            iArr[0] = 0;
            iArr[1] = (i2 - iArr2[1]) / 2;
        }
        return true;
    }
}
