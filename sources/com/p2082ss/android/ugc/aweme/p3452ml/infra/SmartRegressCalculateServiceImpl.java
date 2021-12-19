package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateServiceImpl */
public final class SmartRegressCalculateServiceImpl extends SmartRegressCalculateService {
    static {
        Covode.recordClassIndex(70584);
    }

    /* renamed from: a */
    public static ISmartRegressCalculateService m109553a() {
        MethodCollector.m26663i(10502);
        Object a = C81908b.m141854a(ISmartRegressCalculateService.class, false);
        if (a != null) {
            ISmartRegressCalculateService iSmartRegressCalculateService = (ISmartRegressCalculateService) a;
            MethodCollector.m26664o(10502);
            return iSmartRegressCalculateService;
        }
        if (C81908b.f183263cM == null) {
            synchronized (ISmartRegressCalculateService.class) {
                try {
                    if (C81908b.f183263cM == null) {
                        C81908b.f183263cM = new SmartRegressCalculateServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10502);
                    throw th;
                }
            }
        }
        SmartRegressCalculateService smartRegressCalculateService = (SmartRegressCalculateService) C81908b.f183263cM;
        MethodCollector.m26664o(10502);
        return smartRegressCalculateService;
    }
}
