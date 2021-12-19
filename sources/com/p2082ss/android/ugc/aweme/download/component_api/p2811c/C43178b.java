package com.p2082ss.android.ugc.aweme.download.component_api.p2811c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.c.b */
public final class C43178b {

    /* renamed from: a */
    public static final C43178b f100660a = new C43178b();

    private C43178b() {
    }

    static {
        Covode.recordClassIndex(51358);
    }

    /* renamed from: a */
    public final void mo73419a(String str) {
        C89219l.m154721d(str, "");
        try {
            m86110b(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m86109a(File file) {
        MethodCollector.m26663i(1617);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1617);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1617);
        return delete;
    }

    /* renamed from: b */
    private void m86110b(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    C89219l.m154716b(file2, "");
                    if (file2.isDirectory()) {
                        m86110b(file2.getPath());
                    } else {
                        m86109a(file2);
                    }
                }
                m86109a(file);
            }
        }
    }
}
