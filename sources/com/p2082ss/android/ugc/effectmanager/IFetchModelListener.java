package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.IFetchModelListener */
public interface IFetchModelListener {
    static {
        Covode.recordClassIndex(95369);
    }

    void onFailed(Exception exc);

    void onSuccess(String[] strArr);
}
