package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.PerformanceMainService;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3742e.C68802a;
import com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity;

/* renamed from: com.ss.android.ugc.aweme.services.PerformanceMainServiceImpl */
public final class PerformanceMainServiceImpl implements PerformanceMainService {
    static {
        Covode.recordClassIndex(79699);
    }

    private final void preloadInstance(Object obj) {
    }

    @Override // com.p2082ss.android.ugc.aweme.PerformanceMainService
    public final Activity newAddWikiActivity() {
        return new AddWikiActivity();
    }

    @Override // com.p2082ss.android.ugc.aweme.PerformanceMainService
    public final void preloadPushSettingsManager() {
        preloadInstance(C68802a.f153878a);
    }

    public static PerformanceMainService createPerformanceMainServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(9442);
        Object a = C81908b.m141854a(PerformanceMainService.class, z);
        if (a != null) {
            PerformanceMainService performanceMainService = (PerformanceMainService) a;
            MethodCollector.m26664o(9442);
            return performanceMainService;
        }
        if (C81908b.f183352dw == null) {
            synchronized (PerformanceMainService.class) {
                try {
                    if (C81908b.f183352dw == null) {
                        C81908b.f183352dw = new PerformanceMainServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9442);
                    throw th;
                }
            }
        }
        PerformanceMainServiceImpl performanceMainServiceImpl = (PerformanceMainServiceImpl) C81908b.f183352dw;
        MethodCollector.m26664o(9442);
        return performanceMainServiceImpl;
    }
}
