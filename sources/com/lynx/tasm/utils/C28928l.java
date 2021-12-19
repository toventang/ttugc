package com.lynx.tasm.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;

/* renamed from: com.lynx.tasm.utils.l */
public final class C28928l {
    static {
        Covode.recordClassIndex(35056);
    }

    /* renamed from: a */
    private static File m57944a(Context context) {
        String str = ".lynx-font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = context.getCacheDir();
            }
            File file = new File(C58016d.f132221b, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m57945a(File file) {
        MethodCollector.m26663i(3919);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3919);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3919);
        return delete;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m57946a(java.io.File r4, byte[] r5) {
        /*
            r3 = 3924(0xf54, float:5.499E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001d, all -> 0x0025 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x001d, all -> 0x0025 }
            r1.write(r5)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r1.flush()     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r1.close()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r0
        L_0x0019:
            r0 = move-exception
            r2 = r1
            goto L_0x0026
        L_0x001c:
            r2 = r1
        L_0x001d:
            r2.close()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r0
        L_0x0025:
            r0 = move-exception
        L_0x0026:
            r2.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.utils.C28928l.m57946a(java.io.File, byte[]):boolean");
    }

    /* renamed from: a */
    public static Typeface m57943a(Context context, byte[] bArr) {
        Typeface typeface;
        File a = m57944a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m57946a(a, bArr)) {
                return null;
            }
            String path = a.getPath();
            if (TypeFaceOptimizer.getSwitch() && path != null) {
                if (TypeFaceLancet.cache.contains(path)) {
                    typeface = (Typeface) TypeFaceLancet.cache.get(path);
                } else {
                    typeface = Typeface.createFromFile(path);
                    if (typeface != null) {
                        TypeFaceLancet.cache.put(path, typeface);
                    }
                }
                m57945a(a);
                return typeface;
            }
            typeface = Typeface.createFromFile(path);
            m57945a(a);
            return typeface;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m57945a(a);
        }
    }
}
