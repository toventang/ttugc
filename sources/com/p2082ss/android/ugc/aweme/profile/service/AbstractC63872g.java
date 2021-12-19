package com.p2082ss.android.ugc.aweme.profile.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.profile.service.g */
public interface AbstractC63872g {
    static {
        Covode.recordClassIndex(75297);
    }

    boolean isDataSetChangedOnStart();

    void onVideoItemActionShow(Aweme aweme);

    void setDataSetChangedOnStart(boolean z);
}
