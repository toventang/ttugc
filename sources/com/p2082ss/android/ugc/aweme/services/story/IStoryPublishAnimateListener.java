package com.p2082ss.android.ugc.aweme.services.story;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener */
public interface IStoryPublishAnimateListener {
    static {
        Covode.recordClassIndex(79985);
    }

    void onAnimateFinish();

    void onAnimateStart();

    void onAnimateUpdate(float f);
}
