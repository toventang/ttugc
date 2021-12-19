package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService */
public interface ISmartFeedPreloadService {
    static {
        Covode.recordClassIndex(70439);
    }

    void checkAndInit();

    boolean enable();

    PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig();

    String getPredictLabelResult();

    List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue();

    void startSmartPreloadV2Judge(Aweme aweme);
}
