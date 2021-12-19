package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.x */
public interface AbstractC74304x<T extends C69831ai> {
    static {
        Covode.recordClassIndex(87076);
    }

    void onError(C71818ev evVar);

    void onParallelPublishCancel();

    void onParallelPublishPause();

    void onParallelPublishResume();

    void onProgressUpdate(int i, boolean z);

    void onSuccess(T t, boolean z);

    void onSynthetiseSuccess(String str);
}
