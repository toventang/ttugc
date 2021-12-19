package com.facebook.common.p1831c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.facebook.common.c.a */
public final class C24075a {
    static {
        Covode.recordClassIndex(28202);
    }

    /* renamed from: b */
    public static boolean m45590b(File file) {
        if (file.isDirectory()) {
            m45589a(file);
        }
        return m45591c(file);
    }

    /* renamed from: a */
    public static boolean m45589a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= m45590b(file2);
            }
        }
        return z;
    }

    /* renamed from: c */
    private static boolean m45591c(File file) {
        MethodCollector.m26663i(13453);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13453);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13453);
        return delete;
    }

    /* renamed from: a */
    public static void m45588a(File file, AbstractC24076b bVar) {
        bVar.mo39560a(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m45588a(file2, bVar);
                } else {
                    bVar.mo39561b(file2);
                }
            }
        }
        bVar.mo39562c(file);
    }
}
