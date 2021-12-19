package com.bytedance.geckox.p1017e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1603q.AbstractC21935d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.m */
public class C14925m extends AbstractC21935d<UpdatePackage, UpdatePackage> {

    /* renamed from: a */
    private AbstractC14933a f36471a;

    static {
        Covode.recordClassIndex(17038);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        this.f36471a = (AbstractC14933a) objArr[0];
    }

    /* renamed from: a */
    private static boolean m27462a(File file) {
        MethodCollector.m26663i(5522);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5522);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5522);
        return delete;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0206  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo24020a(com.bytedance.p1603q.AbstractC21931b<com.bytedance.geckox.model.UpdatePackage> r21, com.bytedance.geckox.model.UpdatePackage r22) {
        /*
        // Method dump skipped, instructions count: 555
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p1017e.C14925m.mo24020a(com.bytedance.q.b, com.bytedance.geckox.model.UpdatePackage):java.lang.Object");
    }
}
