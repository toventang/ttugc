package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceImpl */
public final class SmartClassifyServiceImpl extends SmartClassifyService {
    static {
        Covode.recordClassIndex(70556);
    }

    /* renamed from: a */
    public static ISmartClassifyService m109542a() {
        MethodCollector.m26663i(10817);
        Object a = C81908b.m141854a(ISmartClassifyService.class, false);
        if (a != null) {
            ISmartClassifyService iSmartClassifyService = (ISmartClassifyService) a;
            MethodCollector.m26664o(10817);
            return iSmartClassifyService;
        }
        if (C81908b.f183258cH == null) {
            synchronized (ISmartClassifyService.class) {
                try {
                    if (C81908b.f183258cH == null) {
                        C81908b.f183258cH = new SmartClassifyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10817);
                    throw th;
                }
            }
        }
        SmartClassifyService smartClassifyService = (SmartClassifyService) C81908b.f183258cH;
        MethodCollector.m26664o(10817);
        return smartClassifyService;
    }
}
