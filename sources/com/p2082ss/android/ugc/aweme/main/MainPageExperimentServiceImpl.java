package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl */
public class MainPageExperimentServiceImpl implements IMainPageExperimentService {
    static {
        Covode.recordClassIndex(69317);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageExperimentService
    /* renamed from: a */
    public final boolean mo96454a() {
        return C59036av.m108454a();
    }

    /* renamed from: b */
    public static IMainPageExperimentService m108379b() {
        MethodCollector.m26663i(8273);
        Object a = C81908b.m141854a(IMainPageExperimentService.class, false);
        if (a != null) {
            IMainPageExperimentService iMainPageExperimentService = (IMainPageExperimentService) a;
            MethodCollector.m26664o(8273);
            return iMainPageExperimentService;
        }
        if (C81908b.f183297cu == null) {
            synchronized (IMainPageExperimentService.class) {
                try {
                    if (C81908b.f183297cu == null) {
                        C81908b.f183297cu = new MainPageExperimentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8273);
                    throw th;
                }
            }
        }
        MainPageExperimentServiceImpl mainPageExperimentServiceImpl = (MainPageExperimentServiceImpl) C81908b.f183297cu;
        MethodCollector.m26664o(8273);
        return mainPageExperimentServiceImpl;
    }
}
