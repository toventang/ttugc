package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceDefault */
public final class SmartMLSceneServiceDefault extends SmartMLSceneService {
    static {
        Covode.recordClassIndex(70570);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final int lastRunErrorCode(String str) {
        return -100;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final C60100k lastSuccessRunResult(String str) {
        return null;
    }

    public final void run(String str, C60095h hVar, AbstractC60088b bVar, AbstractC60091e eVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void runDelay(String str, long j, C60095h hVar, AbstractC60088b bVar, AbstractC60091e eVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void setReportRunMonitorInterceptor(String str, AbstractC60089c cVar) {
    }
}
