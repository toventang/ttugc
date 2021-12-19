package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener */
public interface IIsTagNeedUpdatedListener {
    static {
        Covode.recordClassIndex(95561);
    }

    void onTagNeedNotUpdate();

    void onTagNeedUpdate();
}
