package com.p2082ss.android.ugc.aweme.compliance.common.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceMonitorServiceImpl */
public final class ComplianceMonitorServiceImpl implements IComplianceMonitorService {
    static {
        Covode.recordClassIndex(47346);
    }

    /* renamed from: a */
    public static IComplianceMonitorService m80475a() {
        MethodCollector.m26663i(4962);
        Object a = C81908b.m141854a(IComplianceMonitorService.class, false);
        if (a != null) {
            IComplianceMonitorService iComplianceMonitorService = (IComplianceMonitorService) a;
            MethodCollector.m26664o(4962);
            return iComplianceMonitorService;
        }
        if (C81908b.f183156aL == null) {
            synchronized (IComplianceMonitorService.class) {
                try {
                    if (C81908b.f183156aL == null) {
                        C81908b.f183156aL = new ComplianceMonitorServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4962);
                    throw th;
                }
            }
        }
        ComplianceMonitorServiceImpl complianceMonitorServiceImpl = (ComplianceMonitorServiceImpl) C81908b.f183156aL;
        MethodCollector.m26664o(4962);
        return complianceMonitorServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    /* renamed from: a */
    public final void mo68665a(String str, boolean z, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C39617a.m80458a(str, z, map);
    }
}
