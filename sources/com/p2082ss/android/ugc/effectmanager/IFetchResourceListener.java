package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.IFetchResourceListener */
public interface IFetchResourceListener {
    static {
        Covode.recordClassIndex(95370);
    }

    void onFailure(Exception exc);

    void onSuccess(long j);
}
