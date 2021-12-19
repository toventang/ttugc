package com.p2082ss.android.ugc.aweme.services.ttep;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.ttep.IDownloadCallback */
public interface IDownloadCallback {
    static {
        Covode.recordClassIndex(80000);
    }

    void onFail(int i, Exception exc);

    void onSuccess(Effect effect);
}
