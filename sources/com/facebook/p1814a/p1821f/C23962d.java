package com.facebook.p1814a.p1821f;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.a.f.d */
public final class C23962d {
    static {
        Covode.recordClassIndex(28083);
    }

    C23962d() {
    }

    /* renamed from: b */
    static void m45309b(C23949a aVar) {
        if (!C24677a.m47209a(C23962d.class)) {
            try {
                if (1 < aVar.f56694b.length) {
                    int i = 1;
                    for (int i2 = 1; i2 < aVar.f56694b.length; i2++) {
                        i *= aVar.f56694b[i2];
                    }
                    int[] iArr = new int[2];
                    int i3 = 0;
                    while (true) {
                        iArr[i3] = aVar.f56694b[i3];
                        i3++;
                        if (i3 > 0) {
                            iArr[1] = i;
                            aVar.mo39448a(iArr);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23962d.class);
            }
        }
    }

    /* renamed from: d */
    static C23949a m45312d(C23949a aVar) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int i = aVar.f56694b[0];
            int i2 = aVar.f56694b[1];
            C23949a aVar2 = new C23949a(new int[]{i2, i});
            float[] fArr = aVar.f56693a;
            float[] fArr2 = aVar2.f56693a;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }

    /* renamed from: e */
    static C23949a m45313e(C23949a aVar) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int i = aVar.f56694b[0];
            int i2 = aVar.f56694b[1];
            int i3 = aVar.f56694b[2];
            C23949a aVar2 = new C23949a(new int[]{i3, i2, i});
            float[] fArr = aVar.f56693a;
            float[] fArr2 = aVar2.f56693a;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[(i6 * i * i2) + (i5 * i) + i4] = fArr[(i4 * i2 * i3) + (i5 * i3) + i6];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }

    /* renamed from: a */
    static C23949a m45304a(C23949a[] aVarArr) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int i = aVarArr[0].f56694b[0];
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                i2 += aVarArr[i3].f56694b[1];
            }
            C23949a aVar = new C23949a(new int[]{i, i2});
            float[] fArr = aVar.f56693a;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * i2;
                int i6 = 0;
                while (true) {
                    float[] fArr2 = aVarArr[i6].f56693a;
                    int i7 = aVarArr[i6].f56694b[1];
                    System.arraycopy(fArr2, i4 * i7, fArr, i5, i7);
                    i5 += i7;
                    i6++;
                    if (i6 >= 4) {
                        break;
                    }
                }
            }
            return aVar;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }

    /* renamed from: c */
    static void m45311c(C23949a aVar) {
        if (!C24677a.m47209a(C23962d.class)) {
            try {
                int i = aVar.f56694b[0];
                int i2 = aVar.f56694b[1];
                float[] fArr = aVar.f56693a;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i3 * i2;
                    int i5 = i4 + i2;
                    float f = Float.MIN_VALUE;
                    float f2 = 0.0f;
                    for (int i6 = i4; i6 < i5; i6++) {
                        if (fArr[i6] > f) {
                            f = fArr[i6];
                        }
                    }
                    for (int i7 = i4; i7 < i5; i7++) {
                        fArr[i7] = (float) Math.exp((double) (fArr[i7] - f));
                    }
                    for (int i8 = i4; i8 < i5; i8++) {
                        f2 += fArr[i8];
                    }
                    while (i4 < i5) {
                        fArr[i4] = fArr[i4] / f2;
                        i4++;
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23962d.class);
            }
        }
    }

    /* renamed from: a */
    static void m45306a(C23949a aVar) {
        if (!C24677a.m47209a(C23962d.class)) {
            try {
                float[] fArr = aVar.f56693a;
                for (int i = 0; i < fArr.length; i++) {
                    if (fArr[i] < 0.0f) {
                        fArr[i] = 0.0f;
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23962d.class);
            }
        }
    }

    /* renamed from: a */
    static C23949a m45302a(C23949a aVar, int i) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int i2 = aVar.f56694b[0];
            int i3 = aVar.f56694b[1];
            int i4 = aVar.f56694b[2];
            int i5 = (i3 - i) + 1;
            C23949a aVar2 = new C23949a(new int[]{i2, i5, i4});
            float[] fArr = aVar.f56693a;
            float[] fArr2 = aVar2.f56693a;
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i4; i7++) {
                    for (int i8 = 0; i8 < i5; i8++) {
                        int i9 = i8 * i4;
                        int i10 = (i6 * i5 * i4) + i9 + i7;
                        int i11 = (i6 * i3 * i4) + i9 + i7;
                        fArr2[i10] = Float.MIN_VALUE;
                        for (int i12 = 0; i12 < i; i12++) {
                            fArr2[i10] = Math.max(fArr2[i10], fArr[(i12 * i4) + i11]);
                        }
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }

    /* renamed from: c */
    private static C23949a m45310c(C23949a aVar, C23949a aVar2) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int i = aVar.f56694b[0];
            int i2 = aVar2.f56694b[0];
            int i3 = aVar2.f56694b[1];
            C23949a aVar3 = new C23949a(new int[]{i, i3});
            float[] fArr = aVar.f56693a;
            float[] fArr2 = aVar2.f56693a;
            float[] fArr3 = aVar3.f56693a;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = fArr3[i6] + (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]);
                    }
                }
            }
            return aVar3;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }

    /* renamed from: b */
    static C23949a m45308b(C23949a aVar, C23949a aVar2) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int i = 0;
            int i2 = aVar.f56694b[0];
            int i3 = aVar.f56694b[1];
            int i4 = aVar.f56694b[2];
            int i5 = aVar2.f56694b[0];
            int i6 = (i3 - i5) + 1;
            int i7 = aVar2.f56694b[2];
            C23949a aVar3 = new C23949a(new int[]{i2, i6, i7});
            float[] fArr = aVar.f56693a;
            float[] fArr2 = aVar3.f56693a;
            float[] fArr3 = aVar2.f56693a;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = 0;
                while (i9 < i7) {
                    int i10 = 0;
                    while (i10 < i6) {
                        float f = 0.0f;
                        while (i < i5) {
                            for (int i11 = 0; i11 < i4; i11++) {
                                f += fArr[(i3 * i4 * i8) + ((i + i10) * i4) + i11] * fArr3[(((i * i4) + i11) * i7) + i9];
                            }
                            i++;
                        }
                        fArr2[(i6 * i7 * i8) + (i10 * i7) + i9] = f;
                        i10++;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }

    /* renamed from: a */
    static C23949a m45305a(String[] strArr, C23949a aVar) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int length = strArr.length;
            int i = aVar.f56694b[1];
            C23949a aVar2 = new C23949a(new int[]{length, 128, i});
            float[] fArr = aVar2.f56693a;
            float[] fArr2 = aVar.f56693a;
            for (int i2 = 0; i2 < length; i2++) {
                int[] a = C23963e.m45315a(strArr[i2]);
                int i3 = 0;
                while (true) {
                    System.arraycopy(fArr2, a[i3] * i, fArr, (i * 128 * i2) + (i * i3), i);
                    i3++;
                    if (i3 >= 128) {
                        break;
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }

    /* renamed from: a */
    static void m45307a(C23949a aVar, C23949a aVar2) {
        if (!C24677a.m47209a(C23962d.class)) {
            try {
                int i = aVar.f56694b[0];
                int i2 = aVar.f56694b[1];
                int i3 = aVar.f56694b[2];
                float[] fArr = aVar.f56693a;
                float[] fArr2 = aVar2.f56693a;
                for (int i4 = 0; i4 < i; i4++) {
                    for (int i5 = 0; i5 < i2; i5++) {
                        for (int i6 = 0; i6 < i3; i6++) {
                            int i7 = (i4 * i2 * i3) + (i5 * i3) + i6;
                            fArr[i7] = fArr[i7] + fArr2[i6];
                        }
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23962d.class);
            }
        }
    }

    /* renamed from: a */
    static C23949a m45303a(C23949a aVar, C23949a aVar2, C23949a aVar3) {
        if (C24677a.m47209a(C23962d.class)) {
            return null;
        }
        try {
            int i = aVar.f56694b[0];
            int i2 = aVar3.f56694b[0];
            C23949a c = m45310c(aVar, aVar2);
            float[] fArr = aVar3.f56693a;
            float[] fArr2 = c.f56693a;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return c;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23962d.class);
            return null;
        }
    }
}
