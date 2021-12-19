package com.benchmark.tools;

import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.benchmark.tools.b */
public final class C2513b {
    static {
        Covode.recordClassIndex(2884);
    }

    /* renamed from: a */
    public static void m7385a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m7386a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m7382a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static long m7387b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m7389c(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                m7388b(file);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058 A[SYNTHETIC, Splitter:B:32:0x0058] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7383a(java.io.File r9) {
        /*
            r8 = 7275(0x1c6b, float:1.0194E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r8)
            boolean r0 = r9.isFile()
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x0011
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return r7
        L_0x0011:
            r1 = 0
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r6]
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0047 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0047 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0047 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0047 }
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
            java.lang.String r0 = m7384a(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return r0
        L_0x0041:
            r0 = move-exception
            r1 = r3
            goto L_0x004d
        L_0x0044:
            r0 = move-exception
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            r0.printStackTrace()     // Catch:{ all -> 0x004c }
            goto L_0x0056
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            throw r0
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.tools.C2513b.m7383a(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    private static boolean m7388b(File file) {
        MethodCollector.m26663i(7273);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7273);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7273);
        return delete;
    }

    /* renamed from: a */
    private static String m7384a(byte[] bArr) {
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
}
