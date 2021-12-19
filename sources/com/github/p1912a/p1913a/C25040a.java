package com.github.p1912a.p1913a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.github.a.a.a */
public final class C25040a {
    static {
        Covode.recordClassIndex(30403);
    }

    /* renamed from: a */
    public static String m48012a(char c) {
        if (19968 > c || c > 40869 || m48014b(c) <= 0) {
            if (12295 == c) {
                return "LING";
            }
            return String.valueOf(c);
        } else if (c == 12295) {
            return "LING";
        } else {
            return C25044e.f59403b[m48014b(c)];
        }
    }

    /* renamed from: b */
    private static int m48014b(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return m48013a(C25041b.f59396a, C25041b.f59397b, i);
        }
        if (7000 > i || i >= 14000) {
            return m48013a(C25043d.f59400a, C25043d.f59401b, i - 14000);
        }
        return m48013a(C25042c.f59398a, C25042c.f59399b, i - 7000);
    }

    /* renamed from: a */
    private static short m48013a(byte[] bArr, byte[] bArr2, int i) {
        short s = (short) (bArr2[i] & 255);
        if ((bArr[i / 8] & C25044e.f59402a[i % 8]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
