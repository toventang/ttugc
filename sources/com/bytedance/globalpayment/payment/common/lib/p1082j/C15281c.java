package com.bytedance.globalpayment.payment.common.lib.p1082j;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.j.c */
public final class C15281c {

    /* renamed from: a */
    private static final char[] f37289a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(17481);
    }

    /* renamed from: a */
    public static String m28154a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return m28155a(m28156a(str.getBytes(), "MD5"));
    }

    /* renamed from: a */
    private static String m28155a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return "";
        }
        char[] cArr = new char[(length << 1)];
        int i = 0;
        int i2 = 0;
        do {
            int i3 = i2 + 1;
            char[] cArr2 = f37289a;
            cArr[i2] = cArr2[(bArr[i] >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[bArr[i] & 15];
            i++;
        } while (i < length);
        return new String(cArr);
    }

    /* renamed from: a */
    private static byte[] m28156a(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                instance.update(bArr);
                return instance.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
