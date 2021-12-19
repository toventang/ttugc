package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreServiceDefault */
public final class SmartFeedLoadMoreServiceDefault extends SmartFeedLoadMoreService {
    static {
        Covode.recordClassIndex(70462);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num) {
        C89219l.m154721d(jSONObject, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final void checkAndInit() {
    }

    public final boolean enable() {
        return false;
    }

    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final boolean isSmartFeedLoadMoreScene(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final boolean needCheckLoadMore(int i, int i2, Aweme aweme) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final void startSmartFeedLoadMoreJudge(Aweme aweme, ISmartFeedLoadMoreService.AbstractC59994a aVar) {
        C89219l.m154721d(aVar, "");
    }
}
