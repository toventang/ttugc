package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.appsflyer.internal.aj */
public class C2307aj {
    static {
        Covode.recordClassIndex(2559);
    }

    /* renamed from: ı */
    private static void m7087(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* renamed from: ı */
    public static void m7086(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            m7087(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            int[] iArr4 = iArr2[0];
            int i6 = iArr4[i5 >>> 24] + iArr2[1][(i5 >>> 16) & 255];
            int i7 = i2 ^ ((iArr2[2][(i5 >>> 8) & 255] ^ i6) + iArr2[3][i5 & 255]);
            i4++;
            i2 = i5;
            i = i7;
        }
        int i8 = i ^ iArr[iArr.length - 2];
        int i9 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            m7087(iArr);
        }
        iArr3[0] = i9;
        iArr3[1] = i8;
    }
}
