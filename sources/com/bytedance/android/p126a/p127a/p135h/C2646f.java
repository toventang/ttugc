package com.bytedance.android.p126a.p127a.p135h;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bytedance.android.a.a.h.f */
public final class C2646f {
    static {
        Covode.recordClassIndex(3034);
    }

    /* renamed from: b */
    public static String m7660b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: c */
    public static String m7661c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt > 31) {
                    if (charAt < 127) {
                        sb.append(charAt);
                    }
                }
                sb.append(C1764a.m5928a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m7662d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (c >= ' ' && c != 127) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m7659a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toString(i, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
