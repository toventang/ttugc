package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.util.Formatter;

/* renamed from: com.appsflyer.internal.z */
public final class C2346z {
    static {
        Covode.recordClassIndex(2618);
    }

    C2346z() {
    }

    /* renamed from: ι */
    public static String m7162(long j) {
        return m7161(new StringBuilder().append(AppsFlyerProperties.getInstance().getString("AppsFlyerKey")).append(j).toString());
    }

    /* renamed from: ı */
    private static String m7158(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", Byte.valueOf(bArr[i]));
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    /* renamed from: ǃ */
    public static String m7159(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m7158(instance.digest());
        } catch (Exception e) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to MD5").toString(), e);
            return null;
        }
    }

    /* renamed from: Ι */
    public static String m7161(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m7158(instance.digest());
        } catch (Exception e) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to SHA1").toString(), e);
            return null;
        }
    }

    /* renamed from: ɩ */
    public static String m7160(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception e) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to SHA-256").toString(), e);
            return null;
        }
    }
}
