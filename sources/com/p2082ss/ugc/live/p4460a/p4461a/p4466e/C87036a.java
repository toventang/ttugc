package com.p2082ss.ugc.live.p4460a.p4461a.p4466e;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.ugc.live.a.a.e.a */
public final class C87036a {

    /* renamed from: a */
    static final char[] f196229a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(102802);
    }

    /* renamed from: a */
    private static String m150743a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return m150744a(bArr, bArr.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m150741a(java.io.File r7) {
        /*
            r6 = 2744(0xab8, float:3.845E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r0)
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0032 }
            r4.<init>(r7)     // Catch:{ all -> 0x0032 }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x002f }
        L_0x0015:
            r1 = 0
            int r0 = r4.read(r2, r1, r3)     // Catch:{ all -> 0x002f }
            if (r0 <= 0) goto L_0x0020
            r5.update(r2, r1, r0)     // Catch:{ all -> 0x002f }
            goto L_0x0015
        L_0x0020:
            byte[] r0 = r5.digest()     // Catch:{ all -> 0x002f }
            java.lang.String r0 = m150743a(r0)     // Catch:{ all -> 0x002f }
            r4.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        L_0x002f:
            r0 = move-exception
            r1 = r4
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87036a.m150741a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static String m150742a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("str is null");
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes("UTF-8"));
        return m150743a(instance.digest());
    }

    /* renamed from: a */
    private static String m150744a(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i + 0 <= bArr.length) {
            int i2 = i * 2;
            char[] cArr = new char[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4 + 0] & 255;
                int i6 = i3 + 1;
                char[] cArr2 = f196229a;
                cArr[i3] = cArr2[i5 >> 4];
                i3 = i6 + 1;
                cArr[i6] = cArr2[i5 & 15];
            }
            return new String(cArr, 0, i2);
        }
        throw new IndexOutOfBoundsException();
    }
}
