package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService */
public interface ISmartMLSceneService {
    static {
        Covode.recordClassIndex(70545);
    }

    void configSceneModel(String str, SmartSceneConfig smartSceneConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    int lastRunErrorCode(String str);

    C60100k lastSuccessRunResult(String str);

    void runDelay(String str, long j, C60095h hVar, AbstractC60088b bVar, AbstractC60091e eVar);

    void setReportRunMonitorInterceptor(String str, AbstractC60089c cVar);
}
