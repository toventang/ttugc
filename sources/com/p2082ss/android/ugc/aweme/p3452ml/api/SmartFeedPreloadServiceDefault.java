package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60017d;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadServiceDefault */
public final class SmartFeedPreloadServiceDefault extends SmartFeedPreloadService {
    static {
        Covode.recordClassIndex(70466);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final void checkAndInit() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final boolean enable() {
        return false;
    }

    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final String getPredictLabelResult() {
        return null;
    }

    public final float getPredictProbabilityResult() {
        return -1.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        return null;
    }

    public final C60017d getSmartPreloadStrategyV2ExperimentValue() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final void startSmartPreloadV2Judge(Aweme aweme) {
    }
}
