package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AlgoFreeInfo;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39230a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.C39618a;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.AlgofreeServiceImpl */
public final class AlgofreeServiceImpl implements IAlgofreeService {
    static {
        Covode.recordClassIndex(47215);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    /* renamed from: a */
    public final AlgoFreeInfo mo68587a() {
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c != null) {
            return c.getAlgoFreeInfo();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    /* renamed from: b */
    public final boolean mo68589b() {
        Boolean algoFreeEnabled;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (algoFreeEnabled = c.getAlgoFreeEnabled()) == null) {
            return false;
        }
        return algoFreeEnabled.booleanValue();
    }

    /* renamed from: d */
    public static IAlgofreeService m80214d() {
        MethodCollector.m26663i(8700);
        Object a = C81908b.m141854a(IAlgofreeService.class, false);
        if (a != null) {
            IAlgofreeService iAlgofreeService = (IAlgofreeService) a;
            MethodCollector.m26664o(8700);
            return iAlgofreeService;
        }
        if (C81908b.f183196az == null) {
            synchronized (IAlgofreeService.class) {
                try {
                    if (C81908b.f183196az == null) {
                        C81908b.f183196az = new AlgofreeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8700);
                    throw th;
                }
            }
        }
        AlgofreeServiceImpl algofreeServiceImpl = (AlgofreeServiceImpl) C81908b.f183196az;
        MethodCollector.m26664o(8700);
        return algofreeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    /* renamed from: c */
    public final void mo68590c() {
        ComplianceSetting complianceSetting;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554047, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
        }
        C39608b.m80410a(complianceSetting);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    /* renamed from: a */
    public final void mo68588a(AbstractC39230a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        C39618a aVar2 = C39608b.f93370a;
        C89219l.m154721d(aVar, "");
        aVar2.f93402a.getAlgoFreeSettings().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C39618a.C39619a(aVar));
    }
}
