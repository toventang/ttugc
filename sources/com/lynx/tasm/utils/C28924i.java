package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.utils.i */
public class C28924i {
    static {
        Covode.recordClassIndex(35052);
    }

    /* renamed from: com.lynx.tasm.utils.i$a */
    public static class C28925a {

        /* renamed from: a */
        public double[] f68353a = new double[4];

        /* renamed from: b */
        public double[] f68354b = new double[3];

        /* renamed from: c */
        public double[] f68355c = new double[3];

        /* renamed from: d */
        public double[] f68356d = new double[3];

        /* renamed from: e */
        public double[] f68357e = new double[3];

        static {
            Covode.recordClassIndex(35053);
        }

        /* renamed from: a */
        public static void m57937a(double[] dArr) {
            for (int i = 0; i < dArr.length; i++) {
                dArr[i] = 0.0d;
            }
        }
    }

    /* renamed from: b */
    public static double m57933b(double d) {
        double round = (double) Math.round(d * 1000.0d);
        Double.isNaN(round);
        return round * 0.001d;
    }

    /* renamed from: c */
    public static double m57935c(double[] dArr) {
        return Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1]) + (dArr[2] * dArr[2]));
    }

    /* renamed from: a */
    public static boolean m57929a(double d) {
        if (!Double.isNaN(d) && Math.abs(d) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m57930a(double[] dArr) {
        if (dArr.length < 16) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static void m57936d(double[] dArr) {
        if (m57930a(dArr)) {
            dArr[14] = 0.0d;
            dArr[13] = 0.0d;
            dArr[12] = 0.0d;
            dArr[11] = 0.0d;
            dArr[9] = 0.0d;
            dArr[8] = 0.0d;
            dArr[7] = 0.0d;
            dArr[6] = 0.0d;
            dArr[4] = 0.0d;
            dArr[3] = 0.0d;
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[15] = 1.0d;
            dArr[10] = 1.0d;
            dArr[5] = 1.0d;
            dArr[0] = 1.0d;
        }
    }

    /* renamed from: b */
    public static double m57934b(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double d21 = d3 * d6;
        double d22 = d2 * d7;
        double d23 = d4 * d5;
        double d24 = d8 * d;
        double d25 = d3 * d5;
        double d26 = d7 * d;
        double d27 = d2 * d5;
        double d28 = d * d6;
        return ((((((((((((((((((((((((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13)) + ((d20 * d11) * d13)) + ((d21 * d12) * d13)) - ((d22 * d12) * d13)) - ((d17 * d9) * d14)) + ((d18 * d9) * d14)) + ((d23 * d11) * d14)) - ((d24 * d11) * d14)) - ((d25 * d12) * d14)) + ((d26 * d12) * d14)) + ((d19 * d9) * d15)) - ((d20 * d9) * d15)) - ((d23 * d10) * d15)) + ((d24 * d10) * d15)) + ((d27 * d12) * d15)) - ((d12 * d28) * d15)) - ((d21 * d9) * d16)) + ((d22 * d9) * d16)) + ((d25 * d10) * d16)) - ((d26 * d10) * d16)) - ((d27 * d11) * d16)) + (d28 * d11 * d16);
    }

    /* renamed from: a */
    public static double m57927a(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    /* renamed from: a */
    public static double[] m57931a(double[] dArr, double d) {
        if (m57929a(d)) {
            d = m57935c(dArr);
        }
        double d2 = 1.0d / d;
        return new double[]{dArr[0] * d2, dArr[1] * d2, dArr[2] * d2};
    }

    /* renamed from: a */
    public static void m57928a(double[] dArr, double d, double d2) {
        dArr[12] = d;
        dArr[13] = d2;
    }

    /* renamed from: a */
    public static double[] m57932a(double[] dArr, double[] dArr2, double d) {
        return new double[]{(dArr[0] * 1.0d) + (dArr2[0] * d), (dArr[1] * 1.0d) + (dArr2[1] * d), (dArr[2] * 1.0d) + (d * dArr2[2])};
    }
}
