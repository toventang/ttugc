package com.p2082ss.ugc.live.p4460a.p4461a.p4466e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.ss.ugc.live.a.a.e.b */
public final class C87037b {
    static {
        Covode.recordClassIndex(102803);
    }

    /* renamed from: a */
    public static String m150745a(String str) {
        if (C87038c.m150749a(str) || str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    /* renamed from: b */
    public static File m150747b(String str) {
        if (str != null) {
            return new File(str + ".tmp");
        }
        throw new IllegalArgumentException("file is null");
    }

    /* renamed from: a */
    public static boolean m150746a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return m150748b(file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m150746a(file2);
                } else {
                    m150748b(file2);
                }
            }
        }
        return m150748b(file);
    }

    /* renamed from: b */
    private static boolean m150748b(File file) {
        MethodCollector.m26663i(3903);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3903);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3903);
        return delete;
    }
}
