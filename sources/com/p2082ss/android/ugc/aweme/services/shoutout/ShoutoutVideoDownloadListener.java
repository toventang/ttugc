package com.p2082ss.android.ugc.aweme.services.shoutout;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener */
public interface ShoutoutVideoDownloadListener {
    static {
        Covode.recordClassIndex(79960);
    }

    void onFail();

    void onSuccess(String str);
}
