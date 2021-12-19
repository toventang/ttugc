package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileNotFoundException;

public class BsPatch {
    private static native int patch(String str, String str2, String str3);

    static {
        Covode.recordClassIndex(17210);
        C15057h.m27722a("geckox_bspatch");
    }

    /* renamed from: a */
    private static boolean m27694a(File file) {
        MethodCollector.m26663i(3970);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3970);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3970);
        return delete;
    }

    /* renamed from: a */
    public static void m27693a(File file, File file2, File file3, String str) {
        MethodCollector.m26663i(3964);
        if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
            MethodCollector.m26664o(3964);
            throw fileNotFoundException;
        } else if (file2.exists()) {
            C15052e.m27716e(file3);
            File file4 = new File(file3, str);
            m27694a(file4);
            int patch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
            if (patch == 0) {
                MethodCollector.m26664o(3964);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("patch merged failed, code：" + patch + " full:" + file.getAbsolutePath() + " patch:" + file2.getAbsolutePath() + " dest:" + file4.getAbsolutePath());
            MethodCollector.m26664o(3964);
            throw runtimeException;
        } else {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
            MethodCollector.m26664o(3964);
            throw fileNotFoundException2;
        }
    }
}
