package com.p2082ss.android.ugc.aweme.compliance;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.p2082ss.android.ugc.aweme.login.C58958d;
import com.p2082ss.android.ugc.aweme.main.p3430d.C59068a;
import com.p2082ss.android.ugc.aweme.p2690cr.C40333c;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl */
public final class ComplianceDependServiceImpl implements IComplianceDependService {
    static {
        Covode.recordClassIndex(46857);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService
    /* renamed from: a */
    public final boolean mo68103a() {
        return C58958d.f134197a;
    }

    /* renamed from: d */
    public static IComplianceDependService m79583d() {
        MethodCollector.m26663i(6554);
        Object a = C81908b.m141854a(IComplianceDependService.class, false);
        if (a != null) {
            IComplianceDependService iComplianceDependService = (IComplianceDependService) a;
            MethodCollector.m26664o(6554);
            return iComplianceDependService;
        }
        if (C81908b.f183194ax == null) {
            synchronized (IComplianceDependService.class) {
                try {
                    if (C81908b.f183194ax == null) {
                        C81908b.f183194ax = new ComplianceDependServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6554);
                    throw th;
                }
            }
        }
        ComplianceDependServiceImpl complianceDependServiceImpl = (ComplianceDependServiceImpl) C81908b.f183194ax;
        MethodCollector.m26664o(6554);
        return complianceDependServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService
    /* renamed from: b */
    public final boolean mo68104b() {
        if (System.currentTimeMillis() - C40333c.m81488a().getLong("last_check_storage_time", 0) <= 604800000) {
            return false;
        }
        if (!C40333c.m81489b() || !C40333c.m81491d()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService
    /* renamed from: c */
    public final void mo68105c() {
        Activity j = C17873f.m33102j();
        C59068a aVar = new C59068a();
        if (j != null) {
            C89219l.m154721d(j, "");
            AbstractC88979t.m154294a(new C59068a.C59070b(j)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C59068a.C59071c(aVar, j), C59068a.C59072d.f134467a);
        }
    }
}
