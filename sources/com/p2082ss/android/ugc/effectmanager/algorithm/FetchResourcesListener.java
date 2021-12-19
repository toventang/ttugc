package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener */
public interface FetchResourcesListener {
    static {
        Covode.recordClassIndex(95390);
    }

    void onFailed(Exception exc);

    void onSuccess();
}
