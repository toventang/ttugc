package com.p2082ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.kids.common.response.KMReportReason;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.p2082ss.android.ugc.aweme.kids.compliance.IKidsComplianceService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.KidsComplianceServiceImpl */
public final class KidsComplianceServiceImpl implements IKidsComplianceService {
    static {
        Covode.recordClassIndex(67597);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.compliance.IKidsComplianceService
    /* renamed from: b */
    public final KMReportReason mo94886b() {
        return C57635a.m104364b();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.compliance.IKidsComplianceService
    /* renamed from: a */
    public final List<String> mo94885a() {
        List<String> blackSetting;
        KidsComplianceSettings a = C57635a.f131548a.mo94945a();
        if (a == null || (blackSetting = a.getBlackSetting()) == null) {
            return new ArrayList();
        }
        return blackSetting;
    }

    /* renamed from: c */
    public static IKidsComplianceService m104360c() {
        MethodCollector.m26663i(2993);
        Object a = C81908b.m141854a(IKidsComplianceService.class, false);
        if (a != null) {
            IKidsComplianceService iKidsComplianceService = (IKidsComplianceService) a;
            MethodCollector.m26664o(2993);
            return iKidsComplianceService;
        }
        if (C81908b.f183213bP == null) {
            synchronized (IKidsComplianceService.class) {
                try {
                    if (C81908b.f183213bP == null) {
                        C81908b.f183213bP = new KidsComplianceServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2993);
                    throw th;
                }
            }
        }
        KidsComplianceServiceImpl kidsComplianceServiceImpl = (KidsComplianceServiceImpl) C81908b.f183213bP;
        MethodCollector.m26664o(2993);
        return kidsComplianceServiceImpl;
    }
}
