package com.p2082ss.android.ugc.aweme.p2730de;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.de.g */
public final class C40972g {
    static {
        Covode.recordClassIndex(48824);
    }

    /* renamed from: a */
    public static void m82491a(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m82491a(file2.getPath());
                    } else {
                        m82492a(file2);
                    }
                }
                m82492a(file);
            }
        }
    }

    /* renamed from: a */
    private static boolean m82492a(File file) {
        MethodCollector.m26663i(5560);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5560);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5560);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC, Splitter:B:27:0x0050] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m82493b(java.lang.String r5) {
        /*
            r4 = 6191(0x182f, float:8.675E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003a }
            r2.<init>(r5)     // Catch:{ Exception -> 0x003a }
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            int r1 = r0 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            int r1 = r1 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            int r1 = r1 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r2.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r1
        L_0x0034:
            r1 = move-exception
            r3 = r2
            goto L_0x0040
        L_0x0037:
            r0 = move-exception
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            r0.printStackTrace()     // Catch:{ all -> 0x003f }
            goto L_0x004e
        L_0x003f:
            r1 = move-exception
        L_0x0040:
            if (r3 == 0) goto L_0x004a
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x004e:
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0058:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2730de.C40972g.m82493b(java.lang.String):java.lang.String");
    }
}
