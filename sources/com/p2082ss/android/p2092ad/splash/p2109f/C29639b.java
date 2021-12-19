package com.p2082ss.android.p2092ad.splash.p2109f;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.android.ad.splash.f.b */
public final class C29639b {

    /* renamed from: a */
    static final char[] f70696a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(36035);
    }

    /* renamed from: a */
    public static String m59664a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return m59665a(digest, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m59665a(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i + 0 <= bArr.length) {
            int i2 = i * 2;
            char[] cArr = new char[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4 + 0] & 255;
                int i6 = i3 + 1;
                char[] cArr2 = f70696a;
                cArr[i3] = cArr2[i5 >> 4];
                i3 = i6 + 1;
                cArr[i6] = cArr2[i5 & 15];
            }
            return new String(cArr, 0, i2);
        }
        throw new IndexOutOfBoundsException();
    }
}
