package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.p1963b.C26909b;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ca */
public final class C26821ca {

    /* renamed from: a */
    static final C26909b f63619a = new C26909b("MergeSliceTaskHandler");

    /* renamed from: b */
    final C26769ac f63620b;

    static {
        Covode.recordClassIndex(32296);
    }

    C26821ca(C26769ac acVar) {
        this.f63620b = acVar;
    }

    /* renamed from: a */
    static void m53277a(File file, File file2) {
        MethodCollector.m26663i(12131);
        if (file.isDirectory()) {
            file2.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file3 : listFiles) {
                m53277a(file3, new File(file2, file3.getName()));
            }
            if (!m53278a(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                C26787au auVar = new C26787au(sb.toString());
                MethodCollector.m26664o(12131);
                throw auVar;
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            C26787au auVar2 = new C26787au(sb2.toString());
            MethodCollector.m26664o(12131);
            throw auVar2;
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            C26787au auVar3 = new C26787au(sb3.toString());
            MethodCollector.m26664o(12131);
            throw auVar3;
        }
        MethodCollector.m26664o(12131);
    }

    /* renamed from: a */
    private static boolean m53278a(File file) {
        MethodCollector.m26663i(12269);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12269);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12269);
        return delete;
    }
}
