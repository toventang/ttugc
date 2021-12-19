package com.facebook.common.p1839k;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.common.k.c */
public final class C24129c {

    /* renamed from: a */
    private static final char[] f57073a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f57074b = new char[256];

    /* renamed from: c */
    private static final char[] f57075c = new char[256];

    /* renamed from: d */
    private static final byte[] f57076d = new byte[103];

    static {
        Covode.recordClassIndex(28257);
        byte b = 0;
        int i = 0;
        do {
            char[] cArr = f57074b;
            char[] cArr2 = f57073a;
            cArr[i] = cArr2[(i >> 4) & 15];
            f57075c[i] = cArr2[i & 15];
            i++;
        } while (i < 256);
        int i2 = 0;
        do {
            f57076d[i2] = -1;
            i2++;
        } while (i2 <= 70);
        byte b2 = 0;
        do {
            f57076d[b2 + 48] = b2;
            b2 = (byte) (b2 + 1);
        } while (b2 < 10);
        do {
            byte[] bArr = f57076d;
            byte b3 = (byte) (b + 10);
            bArr[b + 65] = b3;
            bArr[b + 97] = b3;
            b = (byte) (b + 1);
        } while (b < 6);
    }

    /* renamed from: a */
    public static byte[] m45731a(String str) {
        byte[] bArr;
        byte b;
        byte b2;
        int length = str.length();
        if ((length & 1) == 0) {
            byte[] bArr2 = new byte[(length >> 1)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                char charAt = str.charAt(i);
                if (charAt <= 'f' && (b = (bArr = f57076d)[charAt]) != -1) {
                    i = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    if (charAt2 <= 'f' && (b2 = bArr[charAt2]) != -1) {
                        bArr2[i2] = (byte) ((b << 4) | b2);
                        i2++;
                    }
                }
                throw new IllegalArgumentException("Invalid hexadecimal digit: ".concat(String.valueOf(str)));
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }
}
