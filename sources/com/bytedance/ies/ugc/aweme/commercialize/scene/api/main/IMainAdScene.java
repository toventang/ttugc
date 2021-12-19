package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17888a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

public interface IMainAdScene extends AbstractC17888a {
    static {
        Covode.recordClassIndex(20506);
    }

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void onVideoPageChangeEvent(Aweme aweme, boolean z);
}
