package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;

/* renamed from: com.ss.android.ugc.aweme.utils.et */
public final class C80408et {

    /* renamed from: a */
    private static final char[] f179970a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(93676);
    }

    /* renamed from: a */
    public static String m139388a(String str) {
        try {
            return m139389a(str.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m139389a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                char[] cArr2 = f179970a;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
