package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service */
public interface ISmartPreloadCommentV2Service {
    static {
        Covode.recordClassIndex(70440);
    }

    boolean ensureEvaluatorAvailable();

    float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2);
}
