package com.benchmark.tools;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.benchmark.tools.h */
public final class C2525h {

    /* renamed from: a */
    private static List<String> f7640a = new ArrayList();

    static {
        Covode.recordClassIndex(2896);
    }

    /* renamed from: a */
    private static File m7398a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    private static boolean m7400a(File file) {
        MethodCollector.m26663i(7267);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7267);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7267);
        return delete;
    }

    /* renamed from: a */
    public static synchronized boolean m7401a(String str, Context context) {
        synchronized (C2525h.class) {
            MethodCollector.m26663i(7265);
            if (f7640a.contains(str)) {
                MethodCollector.m26664o(7265);
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38965b(str, false, null);
                C58032m.m104852a(uptimeMillis, str);
                f7640a.add(str);
            } catch (UnsatisfiedLinkError e) {
                String mapLibraryName = System.mapLibraryName(str);
                if (context == null || m7398a(context) == null) {
                    MethodCollector.m26664o(7265);
                    return false;
                }
                File file = new File(m7398a(context), "libso");
                if (!file.exists()) {
                    new File(file.getAbsolutePath()).mkdirs();
                }
                File file2 = new File(file, mapLibraryName);
                if (file2.exists()) {
                    m7400a(file2);
                }
                if (m7399a(context, str, file2) != null) {
                    e.getMessage();
                    MethodCollector.m26664o(7265);
                    return false;
                }
                String absolutePath = file2.getAbsolutePath();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                System.load(absolutePath);
                C58032m.m104852a(uptimeMillis2, absolutePath);
                f7640a.add(str);
            } catch (Throwable unused) {
                MethodCollector.m26664o(7265);
                return false;
            }
            MethodCollector.m26664o(7265);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m7399a(android.content.Context r12, java.lang.String r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.tools.C2525h.m7399a(android.content.Context, java.lang.String, java.io.File):java.lang.String");
    }
}
