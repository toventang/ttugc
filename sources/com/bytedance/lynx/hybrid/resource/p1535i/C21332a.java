package com.bytedance.lynx.hybrid.resource.p1535i;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.i.a */
public final class C21332a {

    /* renamed from: a */
    public static final C21332a f50653a = new C21332a();

    /* renamed from: b */
    private static final char[] f50654b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private C21332a() {
    }

    static {
        Covode.recordClassIndex(24950);
    }

    /* renamed from: a */
    public static String m40073a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("UTF-8");
            C89219l.m154709a((Object) forName, "");
            byte[] bytes = str.getBytes(forName);
            C89219l.m154709a((Object) bytes, "");
            instance.update(bytes);
            byte[] digest = instance.digest();
            if (digest != null) {
                return m40074a(digest, digest.length);
            }
            throw new NullPointerException("bytes is null");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m40074a(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i + 0 <= bArr.length) {
            int i2 = i * 2;
            char[] cArr = new char[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4 + 0] & 255;
                int i6 = i3 + 1;
                char[] cArr2 = f50654b;
                cArr[i3] = cArr2[i5 >> 4];
                i3 = i6 + 1;
                cArr[i6] = cArr2[i5 & 15];
            }
            return new String(cArr, 0, i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
