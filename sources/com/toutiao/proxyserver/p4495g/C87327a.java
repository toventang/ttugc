package com.toutiao.proxyserver.p4495g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.toutiao.proxyserver.g.a */
public class C87327a {

    /* renamed from: a */
    private static final MessageDigest f197935a = m151541a();

    /* renamed from: b */
    private static final char[] f197936b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C87327a() {
    }

    /* renamed from: a */
    private static MessageDigest m151541a() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(103223);
    }

    /* renamed from: a */
    public static String m151540a(String str) {
        byte[] digest;
        MethodCollector.m26663i(8214);
        MessageDigest messageDigest = f197935a;
        if (messageDigest == null) {
            MethodCollector.m26664o(8214);
            return "";
        }
        byte[] bytes = str.getBytes(C87328b.f197937a);
        synchronized (C87327a.class) {
            try {
                digest = messageDigest.digest(bytes);
            } catch (Throwable th) {
                MethodCollector.m26664o(8214);
                throw th;
            }
        }
        if (digest == null || digest.length == 0) {
            MethodCollector.m26664o(8214);
            return null;
        }
        char[] cArr = new char[(digest.length << 1)];
        int i = 0;
        for (byte b : digest) {
            int i2 = i + 1;
            char[] cArr2 = f197936b;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        String str2 = new String(cArr);
        MethodCollector.m26664o(8214);
        return str2;
    }
}
