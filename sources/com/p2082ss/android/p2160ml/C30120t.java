package com.p2082ss.android.p2160ml;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ml.t */
public final class C30120t {

    /* renamed from: a */
    public static boolean f71860a;

    /* renamed from: b */
    private static char[] f71861b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(36619);
    }

    /* renamed from: a */
    public static void m60920a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m60918a(String str) {
        int indexOf;
        String b = m60922b(str);
        if (!TextUtils.isEmpty(b) && (indexOf = b.indexOf(".")) != -1) {
            return b.substring(0, indexOf);
        }
        return "";
    }

    /* renamed from: a */
    public static String m60919a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(f71861b[(b & 240) >> 4]);
                sb.append(f71861b[b & 15]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m60922b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            int lastIndexOf = path.lastIndexOf(47);
            if (lastIndexOf == -1) {
                return "";
            }
            return path.substring(lastIndexOf + 1);
        } catch (MalformedURLException e) {
            C30088k.m60845a("ml#evaluator", "Utils getName error!", e);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051 A[SYNTHETIC, Splitter:B:26:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b A[SYNTHETIC, Splitter:B:33:0x005b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m60916a(java.io.File r10) {
        /*
            r9 = 8657(0x21d1, float:1.2131E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r9)
            boolean r0 = r10.isFile()
            java.lang.String r8 = ""
            if (r0 != 0) goto L_0x0011
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r9)
            return r8
        L_0x0011:
            r7 = 0
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r6]
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0047 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0047 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0047 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0047 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0047 }
        L_0x0026:
            r2 = 0
            int r1 = r3.read(r5, r2, r6)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            r0 = -1
            if (r1 == r0) goto L_0x0032
            r4.update(r5, r2, r1)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            goto L_0x0026
        L_0x0032:
            r3.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            byte[] r0 = r4.digest()
            java.lang.String r0 = m60923b(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r9)
            return r0
        L_0x0041:
            r0 = move-exception
            r7 = r3
            goto L_0x0059
        L_0x0044:
            r2 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x0047:
            r2 = move-exception
        L_0x0048:
            java.lang.String r1 = "ml#evaluator"
            java.lang.String r0 = "Utils getFileMD5 error!"
            com.p2082ss.android.p2160ml.C30088k.m60845a(r1, r0, r2)     // Catch:{ all -> 0x0058 }
            if (r7 == 0) goto L_0x0054
            r7.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r9)
            return r8
        L_0x0058:
            r0 = move-exception
        L_0x0059:
            if (r7 == 0) goto L_0x005e
            r7.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2160ml.C30120t.m60916a(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    private static String m60923b(byte[] bArr) {
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

    /* renamed from: c */
    private static boolean m60925c(File file) {
        MethodCollector.m26663i(8655);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8655);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8655);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[SYNTHETIC, Splitter:B:18:0x0036] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m60924b(java.io.File r5) {
        /*
            r4 = 8813(0x226d, float:1.235E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            long r1 = r5.length()
            int r0 = (int) r1
            byte[] r3 = new byte[r0]
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r2.<init>(r5)     // Catch:{ all -> 0x0033 }
            int r1 = r2.read(r3)     // Catch:{ all -> 0x0030 }
            r0 = -1
            if (r1 == r0) goto L_0x0025
            r2.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0021
        L_0x001d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0021:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        L_0x0025:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "EOF reached while trying to read the whole file"
            r1.<init>(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x0030:
            r1 = move-exception
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r1 = move-exception
        L_0x0034:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2160ml.C30120t.m60924b(java.io.File):byte[]");
    }

    /* renamed from: a */
    public static void m60921a(Throwable th) {
        AbstractC30081h hVar = C30082i.m60841a().f71787b.f71793f;
        if (hVar != null) {
            hVar.mo53449a(th);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x0017 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0017 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r10v12, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r10v13, resolved type: java.io.BufferedOutputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m60917a(java.io.File r12, java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2160ml.C30120t.m60917a(java.io.File, java.io.File):java.lang.String");
    }
}
