package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLDataCenterService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiServiceImpl */
public final class SmartDataCenterApiServiceImpl extends SmartDataCenterApiService {
    static {
        Covode.recordClassIndex(70566);
    }

    /* renamed from: a */
    public static ISmartDataCenterApiService m109544a() {
        MethodCollector.m26663i(10709);
        Object a = C81908b.m141854a(ISmartDataCenterApiService.class, false);
        if (a != null) {
            ISmartDataCenterApiService iSmartDataCenterApiService = (ISmartDataCenterApiService) a;
            MethodCollector.m26664o(10709);
            return iSmartDataCenterApiService;
        }
        if (C81908b.f183260cJ == null) {
            synchronized (ISmartDataCenterApiService.class) {
                try {
                    if (C81908b.f183260cJ == null) {
                        C81908b.f183260cJ = new SmartDataCenterApiServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10709);
                    throw th;
                }
            }
        }
        SmartDataCenterApiService smartDataCenterApiService = (SmartDataCenterApiService) C81908b.f183260cJ;
        MethodCollector.m26664o(10709);
        return smartDataCenterApiService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartDataCenterApiService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
        MLDataCenterService.C59999b.f136655a.addSceneModelConfig(inputFeaturesConfig);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartDataCenterApiService
    public final boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, C60095h hVar) {
        return MLDataCenterService.C59999b.f136655a.fillInputFeatures(map, inputFeaturesConfig, hVar);
    }
}
