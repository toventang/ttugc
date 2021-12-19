package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictConfig;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceDefault */
public final class SmartPlaytimePredictServiceDefault extends SmartPlaytimePredictService {
    static {
        Covode.recordClassIndex(70578);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void checkAndInit() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    public final float lastPredictFloatResult(String str, float f) {
        return f;
    }

    public final String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void predict(String str, C60095h hVar, AbstractC60088b bVar, AbstractC60091e eVar) {
    }

    public final void predictWithAweme(String str, Aweme aweme, AbstractC60088b bVar, AbstractC60091e eVar) {
    }

    public final void predictWithAweme(String str, Aweme aweme, AbstractC60091e eVar) {
    }
}
