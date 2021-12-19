package com.p2082ss.android.vesdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.android.vesdk.utils.DigestUtils */
public class DigestUtils {
    static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(99759);
    }

    public static String toHexString(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return toHexString(bArr, 0, bArr.length);
    }

    public static String md5Hex(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr);
                    return toHexString(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String md5Hex(File file) {
        MethodCollector.m26663i(3063);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance == null) {
                MethodCollector.m26664o(3063);
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
                    String hexString = toHexString(instance.digest());
                    MethodCollector.m26664o(3063);
                    return hexString;
                }
            }
        } catch (Exception unused) {
            MethodCollector.m26664o(3063);
            return null;
        }
    }

    public static String generateMd5Checkcode(String str) {
        String md5Hex = md5Hex(new StringBuilder().append(System.currentTimeMillis()).toString());
        return md5Hex.substring(0, 12) + md5Hex(md5Hex.substring(0, 12) + str).substring(12, 32);
    }

    public static byte[] hexStringToBytes(String str) {
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

    public static String md5Hex(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return toHexString(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean checkInfoByMd5(String str, String str2) {
        if (str2.equals("")) {
            return false;
        }
        return (str2.substring(0, 12) + md5Hex(str2.substring(0, 12) + str).substring(12, 32)).equals(str2);
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5 + i] & 255;
            int i7 = i4 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr, 0, i3);
    }

    public static String md5Hex(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 > 0) {
            try {
                if (i + i2 <= bArr.length) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr, i, i2);
                    return toHexString(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
