package androidx.core.graphics;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.core.graphics.d */
public final class C0702d {
    static {
        Covode.recordClassIndex(781);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.d$a */
    public static class C0703a {

        /* renamed from: a */
        int f2764a;

        /* renamed from: b */
        boolean f2765b;

        static {
            Covode.recordClassIndex(782);
        }

        C0703a() {
        }
    }

    /* renamed from: androidx.core.graphics.d$b */
    public static class C0704b {

        /* renamed from: a */
        public char f2766a;

        /* renamed from: b */
        public float[] f2767b;

        static {
            Covode.recordClassIndex(783);
        }

        C0704b(C0704b bVar) {
            this.f2766a = bVar.f2766a;
            float[] fArr = bVar.f2767b;
            this.f2767b = C0702d.m2474a(fArr, fArr.length);
        }

        C0704b(char c, float[] fArr) {
            this.f2766a = c;
            this.f2767b = fArr;
        }

        /* renamed from: a */
        public static void m2480a(C0704b[] bVarArr, Path path) {
            int i;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float[] fArr = new float[6];
            char c = 'm';
            char c2 = 0;
            char c3 = 'm';
            int i2 = 0;
            while (i2 < bVarArr.length) {
                char c4 = bVarArr[i2].f2766a;
                float[] fArr2 = bVarArr[i2].f2767b;
                float f9 = fArr[c2];
                float f10 = fArr[1];
                float f11 = fArr[2];
                float f12 = fArr[3];
                float f13 = fArr[4];
                float f14 = fArr[5];
                switch (c4) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f13, f14);
                        f9 = f13;
                        f11 = f9;
                        f10 = f14;
                        f12 = f10;
                    default:
                        i = 2;
                        break;
                }
                int i3 = 0;
                while (i3 < fArr2.length) {
                    if (c4 == 'A') {
                        c4 = 'A';
                        int i4 = i3 + 5;
                        float f15 = fArr2[i4];
                        int i5 = i3 + 6;
                        float f16 = fArr2[i5];
                        float f17 = fArr2[i3 + 0];
                        float f18 = fArr2[i3 + 1];
                        float f19 = fArr2[i3 + 2];
                        if (fArr2[i3 + 3] != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr2[i3 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m2479a(path, f9, f10, f15, f16, f17, f18, f19, z, z2);
                        f9 = fArr2[i4];
                        f10 = fArr2[i5];
                        f12 = f10;
                        f11 = f9;
                    } else if (c4 == 'C') {
                        c4 = 'C';
                        int i6 = i3 + 2;
                        int i7 = i3 + 3;
                        int i8 = i3 + 4;
                        int i9 = i3 + 5;
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                        f9 = fArr2[i8];
                        f10 = fArr2[i9];
                        f11 = fArr2[i6];
                        f12 = fArr2[i7];
                    } else if (c4 == 'H') {
                        c4 = 'H';
                        int i10 = i3 + 0;
                        path.lineTo(fArr2[i10], f10);
                        f9 = fArr2[i10];
                    } else if (c4 == 'Q') {
                        c4 = 'Q';
                        int i11 = i3 + 0;
                        int i12 = i3 + 1;
                        int i13 = i3 + 2;
                        int i14 = i3 + 3;
                        path.quadTo(fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        f11 = fArr2[i11];
                        f12 = fArr2[i12];
                        f9 = fArr2[i13];
                        f10 = fArr2[i14];
                    } else if (c4 == 'V') {
                        c4 = 'V';
                        int i15 = i3 + 0;
                        path.lineTo(f9, fArr2[i15]);
                        f10 = fArr2[i15];
                    } else if (c4 != 'a') {
                        if (c4 == 'c') {
                            f3 = f10;
                            int i16 = i3 + 2;
                            int i17 = i3 + 3;
                            int i18 = i3 + 4;
                            int i19 = i3 + 5;
                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                            f9 = fArr2[i16] + f9;
                            f10 = fArr2[i17] + f3;
                            f = f9 + fArr2[i18];
                            f4 = fArr2[i19];
                        } else if (c4 == 'h') {
                            int i20 = i3 + 0;
                            path.rLineTo(fArr2[i20], 0.0f);
                            f9 += fArr2[i20];
                        } else if (c4 == 'q') {
                            int i21 = i3 + 0;
                            int i22 = i3 + 1;
                            int i23 = i3 + 2;
                            int i24 = i3 + 3;
                            path.rQuadTo(fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                            f11 = fArr2[i21] + f9;
                            f12 = f10 + fArr2[i22];
                            f9 += fArr2[i23];
                            c4 = 'q';
                            f10 = fArr2[i24] + f10;
                        } else if (c4 == 'v') {
                            int i25 = i3 + 0;
                            path.rLineTo(0.0f, fArr2[i25]);
                            f10 += fArr2[i25];
                        } else if (c4 != 'L') {
                            if (c4 == 'M') {
                                int i26 = i3 + 0;
                                f9 = fArr2[i26];
                                int i27 = i3 + 1;
                                f10 = fArr2[i27];
                                if (i3 > 0) {
                                    path.lineTo(fArr2[i26], fArr2[i27]);
                                } else {
                                    path.moveTo(fArr2[i26], fArr2[i27]);
                                }
                            } else if (c4 == 'S') {
                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                    f9 = (f9 * 2.0f) - f11;
                                    f10 = (f10 * 2.0f) - f12;
                                }
                                int i28 = i3 + 0;
                                int i29 = i3 + 1;
                                int i30 = i3 + 2;
                                int i31 = i3 + 3;
                                path.cubicTo(f9, f10, fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                                f11 = fArr2[i28];
                                f12 = fArr2[i29];
                                f9 = fArr2[i30];
                                f10 = fArr2[i31];
                            } else if (c4 == 'T') {
                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                    f9 = (f9 * 2.0f) - f11;
                                    f10 = (f10 * 2.0f) - f12;
                                }
                                int i32 = i3 + 0;
                                int i33 = i3 + 1;
                                path.quadTo(f9, f10, fArr2[i32], fArr2[i33]);
                                f = fArr2[i32];
                                f2 = fArr2[i33];
                                f12 = f10;
                                f11 = f9;
                                f9 = f;
                                f10 = f2;
                            } else if (c4 == 'l') {
                                int i34 = i3 + 0;
                                int i35 = i3 + 1;
                                path.rLineTo(fArr2[i34], fArr2[i35]);
                                f9 += fArr2[i34];
                                f10 += fArr2[i35];
                            } else if (c4 == c) {
                                int i36 = i3 + 0;
                                f9 += fArr2[i36];
                                int i37 = i3 + 1;
                                f10 += fArr2[i37];
                                if (i3 > 0) {
                                    path.rLineTo(fArr2[i36], fArr2[i37]);
                                } else {
                                    path.rMoveTo(fArr2[i36], fArr2[i37]);
                                }
                            } else if (c4 == 's') {
                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                    f6 = f9 - f11;
                                    f5 = f10 - f12;
                                } else {
                                    f6 = 0.0f;
                                    f5 = 0.0f;
                                }
                                int i38 = i3 + 0;
                                int i39 = i3 + 1;
                                int i40 = i3 + 2;
                                int i41 = i3 + 3;
                                f3 = f10;
                                path.rCubicTo(f6, f5, fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                                f9 = fArr2[i38] + f9;
                                f10 = fArr2[i39] + f3;
                                f = f9 + fArr2[i40];
                                f4 = fArr2[i41];
                            } else if (c4 == 't') {
                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                    f8 = f9 - f11;
                                    f7 = f10 - f12;
                                } else {
                                    f7 = 0.0f;
                                    f8 = 0.0f;
                                }
                                int i42 = i3 + 0;
                                int i43 = i3 + 1;
                                path.rQuadTo(f8, f7, fArr2[i42], fArr2[i43]);
                                f11 = f8 + f9;
                                f12 = f7 + f10;
                                f9 += fArr2[i42];
                                f10 += fArr2[i43];
                                c4 = 't';
                            }
                            f14 = f10;
                            f13 = f9;
                        } else {
                            int i44 = i3 + 0;
                            int i45 = i3 + 1;
                            path.lineTo(fArr2[i44], fArr2[i45]);
                            f9 = fArr2[i44];
                            f10 = fArr2[i45];
                        }
                        f2 = f4 + f3;
                        f12 = f10;
                        f11 = f9;
                        f9 = f;
                        f10 = f2;
                    } else {
                        int i46 = i3 + 5;
                        float f20 = fArr2[i46] + f9;
                        int i47 = i3 + 6;
                        float f21 = fArr2[i47] + f10;
                        float f22 = fArr2[i3 + 0];
                        float f23 = fArr2[i3 + 1];
                        float f24 = fArr2[i3 + 2];
                        if (fArr2[i3 + 3] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fArr2[i3 + 4] != 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c4 = 'a';
                        m2479a(path, f9, f10, f20, f21, f22, f23, f24, z3, z4);
                        f9 += fArr2[i46];
                        f10 += fArr2[i47];
                        f12 = f10;
                        f11 = f9;
                    }
                    i3 += i;
                    c3 = c4;
                    c4 = c3;
                    c = 'm';
                }
                fArr[0] = f9;
                fArr[1] = f10;
                fArr[2] = f11;
                fArr[3] = f12;
                fArr[4] = f13;
                fArr[5] = f14;
                c3 = bVarArr[i2].f2766a;
                i2++;
                c = 'm';
                c2 = 0;
            }
        }

        /* renamed from: a */
        public final void mo2732a(C0704b bVar, C0704b bVar2, float f) {
            this.f2766a = bVar.f2766a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.f2767b;
                if (i < fArr.length) {
                    this.f2767b[i] = (fArr[i] * (1.0f - f)) + (bVar2.f2767b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private static void m2478a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d6;
            double d11 = d5;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d12 = -d3;
            double d13 = d12 * cos;
            double d14 = d4 * sin;
            double d15 = (d13 * sin2) - (d14 * cos2);
            double d16 = d12 * sin;
            double d17 = d4 * cos;
            double d18 = (sin2 * d16) + (cos2 * d17);
            double d19 = (double) ceil;
            Double.isNaN(d19);
            double d20 = d9 / d19;
            int i = 0;
            while (i < ceil) {
                double d21 = d8 + d20;
                double sin3 = Math.sin(d21);
                double cos3 = Math.cos(d21);
                double d22 = (d + ((d3 * cos) * cos3)) - (d14 * sin3);
                double d23 = d2 + (d3 * sin * cos3) + (d17 * sin3);
                double d24 = (d13 * sin3) - (d14 * cos3);
                double d25 = (sin3 * d16) + (cos3 * d17);
                double d26 = d21 - d8;
                double tan = Math.tan(d26 / 2.0d);
                double sin4 = (Math.sin(d26) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d11 + (d15 * sin4)), (float) (d10 + (d18 * sin4)), (float) (d22 - (sin4 * d24)), (float) (d23 - (sin4 * d25)), (float) d22, (float) d23);
                i++;
                d11 = d22;
                d8 = d21;
                d18 = d25;
                d15 = d24;
                d10 = d23;
            }
        }

        /* renamed from: a */
        private static void m2479a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            boolean z3;
            float f8 = f5;
            float f9 = f6;
            while (true) {
                double radians = Math.toRadians((double) f7);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = (double) f;
                Double.isNaN(d3);
                double d4 = (double) f2;
                Double.isNaN(d4);
                double d5 = (double) f8;
                Double.isNaN(d5);
                double d6 = ((d3 * cos) + (d4 * sin)) / d5;
                double d7 = (double) (-f);
                Double.isNaN(d7);
                Double.isNaN(d4);
                double d8 = (double) f9;
                Double.isNaN(d8);
                double d9 = ((d7 * sin) + (d4 * cos)) / d8;
                double d10 = (double) f3;
                Double.isNaN(d10);
                double d11 = (double) f4;
                Double.isNaN(d11);
                Double.isNaN(d5);
                double d12 = ((d10 * cos) + (d11 * sin)) / d5;
                double d13 = (double) (-f3);
                Double.isNaN(d13);
                Double.isNaN(d11);
                Double.isNaN(d8);
                double d14 = ((d13 * sin) + (d11 * cos)) / d8;
                double d15 = d6 - d12;
                double d16 = d9 - d14;
                double d17 = (d6 + d12) / 2.0d;
                double d18 = (d9 + d14) / 2.0d;
                double d19 = (d15 * d15) + (d16 * d16);
                if (d19 != 0.0d) {
                    double d20 = (1.0d / d19) - 0.25d;
                    if (d20 < 0.0d) {
                        float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
                        f8 *= sqrt;
                        f9 *= sqrt;
                    } else {
                        double sqrt2 = Math.sqrt(d20);
                        double d21 = d15 * sqrt2;
                        double d22 = sqrt2 * d16;
                        if (z == z2) {
                            d = d17 - d22;
                            d2 = d18 + d21;
                        } else {
                            d = d17 + d22;
                            d2 = d18 - d21;
                        }
                        double atan2 = Math.atan2(d9 - d2, d6 - d);
                        double atan22 = Math.atan2(d14 - d2, d12 - d) - atan2;
                        if (atan22 >= 0.0d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 != z3) {
                            if (atan22 > 0.0d) {
                                atan22 -= 6.283185307179586d;
                            } else {
                                atan22 += 6.283185307179586d;
                            }
                        }
                        Double.isNaN(d5);
                        double d23 = d * d5;
                        Double.isNaN(d8);
                        double d24 = d2 * d8;
                        m2478a(path, (d23 * cos) - (d24 * sin), (d23 * sin) + (d24 * cos), d5, d8, d3, d4, radians, atan2, atan22);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static Path m2471a(String str) {
        Path path = new Path();
        C0704b[] b = m2476b(str);
        if (b == null) {
            return null;
        }
        try {
            C0704b.m2480a(b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: b */
    public static C0704b[] m2476b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = m2470a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                m2472a(arrayList, trim.charAt(0), m2477c(trim));
            }
            i = a + 1;
            i2 = a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m2472a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0704b[]) arrayList.toArray(new C0704b[arrayList.size()]);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e A[Catch:{ NumberFormatException -> 0x0082 }, LOOP:1: B:10:0x002e->B:29:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0061 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] m2477c(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0702d.m2477c(java.lang.String):float[]");
    }

    /* renamed from: a */
    public static C0704b[] m2475a(C0704b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0704b[] bVarArr2 = new C0704b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0704b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* renamed from: a */
    static float[] m2474a(float[] fArr, int i) {
        if (i >= 0) {
            int i2 = i - 0;
            float[] fArr2 = new float[i2];
            System.arraycopy(fArr, 0, fArr2, 0, Math.min(i2, fArr.length - 0));
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static int m2470a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m2473a(C0704b[] bVarArr, C0704b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (!(bVarArr[i].f2766a == bVarArr2[i].f2766a && bVarArr[i].f2767b.length == bVarArr2[i].f2767b.length)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m2472a(ArrayList<C0704b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0704b(c, fArr));
    }
}
