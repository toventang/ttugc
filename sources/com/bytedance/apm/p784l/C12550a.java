package com.bytedance.apm.p784l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.bytedance.apm.l.a */
public final class C12550a {

    /* renamed from: a */
    public static String f30525a;

    /* renamed from: b */
    public static String f30526b;

    /* renamed from: c */
    public static String f30527c;

    static {
        Covode.recordClassIndex(14366);
    }

    /* renamed from: a */
    public static void m22565a(String str) {
        f30526b = "https://" + str + "/monitor/collect/c/code_coverage";
    }

    /* renamed from: a */
    public static boolean m22566a(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }
}
