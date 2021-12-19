package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.bytedance.common.utility.d */
public final class C13607d {

    /* renamed from: a */
    static final char[] f33084a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(15634);
    }

    /* renamed from: a */
    public static String m24439a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return m24440a(bArr, bArr.length);
    }

    /* renamed from: b */
    public static String m24443b(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr);
                    return m24439a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m24438a(File file) {
        MethodCollector.m26663i(12486);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance == null) {
                MethodCollector.m26664o(12486);
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 8192);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    String a = m24439a(instance.digest());
                    MethodCollector.m26664o(12486);
                    return a;
                }
            }
        } catch (Exception unused) {
            MethodCollector.m26664o(12486);
            return null;
        }
    }

    /* renamed from: b */
    public static String m24442b(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m24439a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m24441a(String str) {
        if (str == null || str.length() % 2 == 1) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: ".concat(String.valueOf(str)));
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(charArray[i], 16) << 4) + Character.digit(charArray[i + 1], 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m24440a(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i + 0 <= bArr.length) {
            int i2 = i * 2;
            char[] cArr = new char[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4 + 0] & 255;
                int i6 = i3 + 1;
                char[] cArr2 = f33084a;
                cArr[i3] = cArr2[i5 >> 4];
                i3 = i6 + 1;
                cArr[i6] = cArr2[i5 & 15];
            }
            return new String(cArr, 0, i2);
        }
        throw new IndexOutOfBoundsException();
    }
}
