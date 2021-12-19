package com.p2082ss.android.ugc.aweme.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.experiment.dz */
public final class C46869dz {
    static {
        Covode.recordClassIndex(55470);
    }

    /* renamed from: c */
    private static File m90183c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    public static boolean m90180a(Context context) {
        if (context == null || !C29843f.m60129a(context)) {
            return false;
        }
        try {
            return new File(m90183c(context) + "/preload.cfg").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m90181a(File file) {
        MethodCollector.m26663i(2434);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2434);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2434);
        return delete;
    }

    /* renamed from: b */
    public static void m90182b(Context context) {
        if (context != null && C29843f.m60129a(context)) {
            try {
                boolean a = C16048b.m29633a().mo25421a(true, "keva_auto_preload_ab", false);
                File file = new File(m90183c(context) + "/preload.cfg");
                if (!a) {
                    m90181a(file);
                } else if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
