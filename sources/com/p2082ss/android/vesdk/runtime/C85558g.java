package com.p2082ss.android.vesdk.runtime;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ttve.log.C30653a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.vesdk.C85616y;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.runtime.g */
public final class C85558g {

    /* renamed from: a */
    private static List<String> f191709a = new ArrayList();

    static {
        Covode.recordClassIndex(99733);
    }

    /* renamed from: a */
    private static File m147460a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    private static boolean m147462a(File file) {
        MethodCollector.m26663i(3124);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3124);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3124);
        return delete;
    }

    /* renamed from: a */
    public static synchronized boolean m147463a(String str, Context context) {
        synchronized (C85558g.class) {
            MethodCollector.m26663i(3113);
            if (f191709a.contains(str)) {
                MethodCollector.m26664o(3113);
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38962a(str);
                C58032m.m104852a(uptimeMillis, str);
                f191709a.add(str);
            } catch (UnsatisfiedLinkError e) {
                StringBuilder append = new StringBuilder("loadLibrary ").append(str).append(" error.");
                StringWriter stringWriter = new StringWriter();
                e.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                C30653a.m63007a(4, append.append(stringWriter.getBuffer().toString()).toString());
                String mapLibraryName = System.mapLibraryName(str);
                if (context == null || m147460a(context) == null) {
                    MethodCollector.m26664o(3113);
                    return false;
                }
                File file = new File(m147460a(context), "libso");
                if (!file.exists()) {
                    C85616y.m147706c(file.getAbsolutePath());
                }
                File file2 = new File(file, mapLibraryName);
                if (file2.exists()) {
                    m147462a(file2);
                }
                String a = m147461a(context, str, file2);
                if (a != null) {
                    e.getMessage();
                    C30653a.m63007a(4, e.getMessage() + "[" + a + "]");
                    MethodCollector.m26664o(3113);
                    return false;
                }
                String absolutePath = file2.getAbsolutePath();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                System.load(absolutePath);
                C58032m.m104852a(uptimeMillis2, absolutePath);
                f191709a.add(str);
            } catch (Throwable unused) {
                MethodCollector.m26664o(3113);
                return false;
            }
            MethodCollector.m26664o(3113);
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
    private static java.lang.String m147461a(android.content.Context r12, java.lang.String r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.runtime.C85558g.m147461a(android.content.Context, java.lang.String, java.io.File):java.lang.String");
    }
}
