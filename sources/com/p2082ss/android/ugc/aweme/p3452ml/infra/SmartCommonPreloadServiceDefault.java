package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceDefault */
public final class SmartCommonPreloadServiceDefault extends SmartCommonPreloadService {
    static {
        Covode.recordClassIndex(70560);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartCommonPreloadService
    public final void checkAndInit() {
    }

    public final void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    public final boolean enable(String str) {
        return false;
    }

    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    public final boolean lastResult(String str, boolean z) {
        return z;
    }

    public final float lastResultScore(String str, float f) {
        return f;
    }

    public final void smartJudge(String str, C60095h hVar, AbstractC60088b bVar, AbstractC60090d dVar) {
    }

    public final void smartJudgeWithAweme(String str, Aweme aweme, AbstractC60088b bVar, AbstractC60090d dVar) {
    }

    public final void smartJudgeWithAweme(String str, Aweme aweme, AbstractC60090d dVar) {
    }
}
