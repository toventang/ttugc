package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateListener */
public interface SearchStateListener {
    static {
        Covode.recordClassIndex(50514);
    }

    void onContentVisible(boolean z);

    void onPageHidden();

    void onPageResume();
}
