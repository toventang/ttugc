package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIServiceDefault */
public final class SmartFeedAdUIServiceDefault extends SmartFeedAdUIService {
    static {
        Covode.recordClassIndex(70458);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final void checkAndInit() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final boolean enable() {
        return false;
    }

    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final String getPredictLabelResult() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final CommerceSmartUITasks getPredictTaskIndex() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final CommerceSmartUIModel getSmartAdUIExperimentValue() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final void startSmartAdUIJudge(Aweme aweme) {
    }
}
