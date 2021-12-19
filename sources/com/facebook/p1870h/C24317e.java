package com.facebook.p1870h;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import java.io.UnsupportedEncodingException;

/* renamed from: com.facebook.h.e */
public final class C24317e {
    static {
        Covode.recordClassIndex(28458);
    }

    /* renamed from: a */
    public static byte[] m46274a(String str) {
        C24091i.m45617a(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: a */
    public static boolean m46273a(byte[] bArr, byte[] bArr2) {
        C24091i.m45617a(bArr);
        C24091i.m45617a(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
