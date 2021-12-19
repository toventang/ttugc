package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2ServiceDefault */
public final class SmartPreloadCommentV2ServiceDefault extends SmartPreloadCommentV2Service {
    static {
        Covode.recordClassIndex(70470);
    }

    public final boolean enable() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadCommentV2Service
    public final boolean ensureEvaluatorAvailable() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadCommentV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        return -1.0f;
    }
}
