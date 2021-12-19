package com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.deviceregister.b.a.a.c */
public final class C29879c {
    static {
        Covode.recordClassIndex(36289);
    }

    /* renamed from: a */
    public static String[] m60225a() {
        String[] strArr = new String[2];
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            instance.init(128, secureRandom);
            strArr[0] = m60226b(instance.generateKey().getEncoded());
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            strArr[1] = m60226b(bArr);
            if (TextUtils.isEmpty(strArr[0]) || strArr[0].length() != 32 || TextUtils.isEmpty(strArr[1]) || strArr[1].length() != 16) {
                return null;
            }
            return strArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m60222a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static byte[] m60227b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: b */
    private static String m60226b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null) {
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|43|44|45|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x004f, code lost:
        if (r4 == null) goto L_0x0054;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0051 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003d A[SYNTHETIC, Splitter:B:26:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0042 A[SYNTHETIC, Splitter:B:30:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004c A[SYNTHETIC, Splitter:B:39:0x004c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m60223a(byte[] r7) {
        /*
            r6 = 309(0x135, float:4.33E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            r1 = 0
            if (r7 == 0) goto L_0x000b
            int r0 = r7.length
            if (r0 > 0) goto L_0x000f
        L_0x000b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r1
        L_0x000f:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0049, all -> 0x0035 }
            r4.<init>(r7)     // Catch:{ IOException -> 0x0049, all -> 0x0035 }
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x004a, all -> 0x0039 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x004a, all -> 0x0039 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
        L_0x0022:
            int r1 = r3.read(r2)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            if (r1 < 0) goto L_0x002d
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            goto L_0x0022
        L_0x002d:
            r3.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x0031:
            r0 = move-exception
            goto L_0x003b
        L_0x0033:
            r1 = r3
            goto L_0x004a
        L_0x0035:
            r0 = move-exception
            r4 = r1
            r3 = r4
            goto L_0x003b
        L_0x0039:
            r0 = move-exception
            r3 = r1
        L_0x003b:
            if (r3 == 0) goto L_0x0040
            r3.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            if (r4 == 0) goto L_0x0045
            r4.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        L_0x0049:
            r4 = r1
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            if (r4 == 0) goto L_0x0054
        L_0x0051:
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            byte[] r0 = r5.toByteArray()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.C29879c.m60223a(byte[]):byte[]");
    }

    /* renamed from: a */
    public static byte[] m60224a(byte[] bArr, String str, String str2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            instance.init(2, new SecretKeySpec(m60227b(str), "AES"), new IvParameterSpec(m60227b(str2)));
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
