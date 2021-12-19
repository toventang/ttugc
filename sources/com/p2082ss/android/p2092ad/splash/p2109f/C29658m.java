package com.p2082ss.android.p2092ad.splash.p2109f;

import com.bytedance.covode.number.Covode;
import java.util.Random;

/* renamed from: com.ss.android.ad.splash.f.m */
public final class C29658m {

    /* renamed from: a */
    private static final char[] f70735a = "0123456789ABCDEF".toCharArray();

    static {
        Covode.recordClassIndex(36054);
    }

    /* renamed from: a */
    public static long m59762a(Random random) {
        long nextLong;
        long j;
        do {
            nextLong = (random.nextLong() << 1) >>> 1;
            j = nextLong % 8999999999L;
        } while ((nextLong - j) + 8999999998L < 0);
        return j;
    }

    /* renamed from: a */
    public static String m59763a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f70735a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m59764a(long j) {
        byte[] bArr = new byte[8];
        int i = 7;
        do {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
            i--;
        } while (i >= 0);
        return bArr;
    }

    /* renamed from: a */
    public static int m59761a(long j, long j2) {
        int i;
        if (j2 > 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = (double) j2;
            Double.isNaN(d2);
            i = (int) (((d * 1.0d) / d2) * 100.0d);
        } else {
            i = 0;
        }
        return Math.min(Math.max(0, i), 100);
    }
}
