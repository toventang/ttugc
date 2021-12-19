package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceImpl */
public final class SmartCommonPreloadServiceImpl extends SmartCommonPreloadService {

    /* renamed from: a */
    private boolean f136881a;

    static {
        Covode.recordClassIndex(70561);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartCommonPreloadService
    public final void checkAndInit() {
        if (!this.f136881a) {
            this.f136881a = true;
        }
    }

    /* renamed from: a */
    public static ISmartCommonPreloadService m109543a() {
        MethodCollector.m26663i(10680);
        Object a = C81908b.m141854a(ISmartCommonPreloadService.class, false);
        if (a != null) {
            ISmartCommonPreloadService iSmartCommonPreloadService = (ISmartCommonPreloadService) a;
            MethodCollector.m26664o(10680);
            return iSmartCommonPreloadService;
        }
        if (C81908b.f183259cI == null) {
            synchronized (ISmartCommonPreloadService.class) {
                try {
                    if (C81908b.f183259cI == null) {
                        C81908b.f183259cI = new SmartCommonPreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10680);
                    throw th;
                }
            }
        }
        SmartCommonPreloadService smartCommonPreloadService = (SmartCommonPreloadService) C81908b.f183259cI;
        MethodCollector.m26664o(10680);
        return smartCommonPreloadService;
    }
}
