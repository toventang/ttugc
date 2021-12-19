package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

/* renamed from: com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService */
public interface ISmartFeedAdUIService {
    static {
        Covode.recordClassIndex(70435);
    }

    void checkAndInit();

    boolean enable();

    String getPredictLabelResult();

    CommerceSmartUITasks getPredictTaskIndex();

    CommerceSmartUIModel getSmartAdUIExperimentValue();

    void startSmartAdUIJudge(Aweme aweme);
}
