package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceDefault */
public final class SmartClassifyServiceDefault extends SmartClassifyService {
    static {
        Covode.recordClassIndex(70555);
    }

    public final void classify(String str, C60095h hVar, AbstractC60088b bVar, AbstractC60080a aVar) {
    }

    public final void classifyWithAweme(String str, Aweme aweme, AbstractC60080a aVar) {
    }

    public final void classifyWithAweme(String str, Aweme aweme, AbstractC60088b bVar, AbstractC60080a aVar) {
    }

    public final void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    public final boolean enable(String str) {
        return false;
    }

    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    public final String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }
}
