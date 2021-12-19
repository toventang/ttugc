package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;

/* renamed from: com.bytedance.android.livesdk.utils.e */
public final class C11263e {
    static {
        Covode.recordClassIndex(12895);
    }

    /* renamed from: a */
    public static void m19955a(Bitmap bitmap, Bitmap bitmap2, int i) {
        if (i > 0) {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i2 = width * height;
            int[] iArr = new int[i2];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i3 = width - 1;
            int i4 = height - 1;
            int i5 = i + i + 1;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[Math.max(width, height)];
            int i6 = (i5 + 1) >> 1;
            int i7 = i6 * i6;
            int i8 = i7 * 256;
            int[] iArr6 = new int[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                iArr6[i9] = i9 / i7;
            }
            int[] iArr7 = new int[2];
            iArr7[1] = 3;
            iArr7[0] = i5;
            int[][] iArr8 = (int[][]) Array.newInstance(int.class, iArr7);
            int i10 = i + 1;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < height; i13++) {
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                for (int i23 = -i; i23 <= i; i23++) {
                    int i24 = iArr[i11 + Math.min(i3, Math.max(i23, 0))];
                    int[] iArr9 = iArr8[i23 + i];
                    iArr9[0] = (i24 & 16711680) >> 16;
                    iArr9[1] = (i24 & 65280) >> 8;
                    iArr9[2] = i24 & 255;
                    int abs = i10 - Math.abs(i23);
                    i22 += iArr9[0] * abs;
                    i14 += iArr9[1] * abs;
                    i15 += iArr9[2] * abs;
                    if (i23 > 0) {
                        i19 += iArr9[0];
                        i20 += iArr9[1];
                        i21 += iArr9[2];
                    } else {
                        i16 += iArr9[0];
                        i17 += iArr9[1];
                        i18 += iArr9[2];
                    }
                }
                int i25 = i;
                for (int i26 = 0; i26 < width; i26++) {
                    iArr2[i11] = iArr6[i22];
                    iArr3[i11] = iArr6[i14];
                    iArr4[i11] = iArr6[i15];
                    int i27 = i22 - i16;
                    int i28 = i14 - i17;
                    int i29 = i15 - i18;
                    int[] iArr10 = iArr8[((i25 - i) + i5) % i5];
                    int i30 = i16 - iArr10[0];
                    int i31 = i17 - iArr10[1];
                    int i32 = i18 - iArr10[2];
                    if (i13 == 0) {
                        iArr5[i26] = Math.min(i26 + i + 1, i3);
                    }
                    int i33 = iArr[i12 + iArr5[i26]];
                    iArr10[0] = (i33 & 16711680) >> 16;
                    iArr10[1] = (i33 & 65280) >> 8;
                    iArr10[2] = i33 & 255;
                    int i34 = i19 + iArr10[0];
                    int i35 = i20 + iArr10[1];
                    int i36 = i21 + iArr10[2];
                    i22 = i27 + i34;
                    i14 = i28 + i35;
                    i15 = i29 + i36;
                    i25 = (i25 + 1) % i5;
                    int[] iArr11 = iArr8[i25 % i5];
                    i16 = i30 + iArr11[0];
                    i17 = i31 + iArr11[1];
                    i18 = i32 + iArr11[2];
                    i19 = i34 - iArr11[0];
                    i20 = i35 - iArr11[1];
                    i21 = i36 - iArr11[2];
                    i11++;
                }
                i12 += width;
            }
            for (int i37 = 0; i37 < width; i37++) {
                int i38 = -i;
                int i39 = i38 * width;
                int i40 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                while (i38 <= i) {
                    int max = Math.max(0, i39) + i37;
                    int[] iArr12 = iArr8[i38 + i];
                    iArr12[0] = iArr2[max];
                    iArr12[1] = iArr3[max];
                    iArr12[2] = iArr4[max];
                    int abs2 = i10 - Math.abs(i38);
                    i47 += iArr2[max] * abs2;
                    i48 += iArr3[max] * abs2;
                    i40 += iArr4[max] * abs2;
                    if (i38 > 0) {
                        i44 += iArr12[0];
                        i45 += iArr12[1];
                        i46 += iArr12[2];
                    } else {
                        i41 += iArr12[0];
                        i42 += iArr12[1];
                        i43 += iArr12[2];
                    }
                    if (i38 < i4) {
                        i39 += width;
                    }
                    i38++;
                }
                int i49 = i;
                int i50 = i37;
                for (int i51 = 0; i51 < height; i51++) {
                    iArr[i50] = (iArr[i50] & -16777216) | (iArr6[i47] << 16) | (iArr6[i48] << 8) | iArr6[i40];
                    int i52 = i47 - i41;
                    int i53 = i48 - i42;
                    int i54 = i40 - i43;
                    int[] iArr13 = iArr8[((i49 - i) + i5) % i5];
                    int i55 = i41 - iArr13[0];
                    int i56 = i42 - iArr13[1];
                    int i57 = i43 - iArr13[2];
                    if (i37 == 0) {
                        iArr5[i51] = Math.min(i51 + i10, i4) * width;
                    }
                    int i58 = iArr5[i51] + i37;
                    iArr13[0] = iArr2[i58];
                    iArr13[1] = iArr3[i58];
                    iArr13[2] = iArr4[i58];
                    int i59 = i44 + iArr13[0];
                    int i60 = i45 + iArr13[1];
                    int i61 = i46 + iArr13[2];
                    i47 = i52 + i59;
                    i48 = i53 + i60;
                    i40 = i54 + i61;
                    i49 = (i49 + 1) % i5;
                    int[] iArr14 = iArr8[i49];
                    i41 = i55 + iArr14[0];
                    i42 = i56 + iArr14[1];
                    i43 = i57 + iArr14[2];
                    i44 = i59 - iArr14[0];
                    i45 = i60 - iArr14[1];
                    i46 = i61 - iArr14[2];
                    i50 += width;
                }
            }
            bitmap2.setPixels(iArr, 0, width, 0, 0, width, height);
        }
    }
}
