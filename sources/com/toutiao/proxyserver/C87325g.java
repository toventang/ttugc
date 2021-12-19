package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.toutiao.proxyserver.g */
public final class C87325g extends AbstractC87294b {

    /* renamed from: a */
    final File f197933a;

    static {
        Covode.recordClassIndex(103221);
    }

    /* renamed from: f */
    private File m151537f(String str) {
        return new File(this.f197933a, str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: a */
    public final File mo98175a(String str) {
        return m151537f(str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: e */
    public final File mo141331e(String str) {
        return m151537f(str);
    }

    /* renamed from: a */
    public static boolean m151536a(File file) {
        MethodCollector.m26663i(13700);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13700);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13700);
        return delete;
    }
}
