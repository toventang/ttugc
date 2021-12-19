package com.p2082ss.android.ugc.effectmanager.common.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.MD5Utils */
public class MD5Utils {
    protected static char[] sHexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(95522);
    }

    public static String getFileMD5(File file) {
        return getFileMD5(file, null);
    }

    public static String getMD5String(String str) {
        if (str == null) {
            return null;
        }
        return getMD5String(str.getBytes());
    }

    public static String getMD5String16Bit(String str) {
        String mD5String = getMD5String(str);
        if (!TextUtils.isEmpty(mD5String)) {
            return mD5String.substring(8, 24);
        }
        return null;
    }

    public static String getMD5String(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(sHexDigits[(b & 240) >> 4]);
                stringBuffer.append(sHexDigits[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String byteArrayToHex(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[SYNTHETIC, Splitter:B:26:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d A[SYNTHETIC, Splitter:B:33:0x009d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileMD5(java.io.File r10, com.p2082ss.android.ugc.effectmanager.common.monitor.MonitorTrace r11) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils.getFileMD5(java.io.File, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace):java.lang.String");
    }
}
