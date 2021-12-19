package com.bytedance.webx.p1769i.p1775e;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;

/* renamed from: com.bytedance.webx.i.e.b */
public final class C23652b {

    /* renamed from: a */
    private static char[] f55975a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(27751);
    }

    /* renamed from: a */
    public static String m44727a(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length * 2);
            int i = length + 0;
            for (int i2 = 0; i2 < i; i2++) {
                byte b = digest[i2];
                char[] cArr = f55975a;
                char c = cArr[(b & 240) >> 4];
                char c2 = cArr[b & 15];
                sb.append(c);
                sb.append(c2);
            }
            return sb.toString();
        } catch (Exception unused) {
            C23651a.m44726d("MD5Util");
            return "";
        }
    }
}
