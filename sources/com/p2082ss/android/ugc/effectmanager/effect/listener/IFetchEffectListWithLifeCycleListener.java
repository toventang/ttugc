package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListWithLifeCycleListener */
public interface IFetchEffectListWithLifeCycleListener extends IFetchEffectListListener {
    static {
        Covode.recordClassIndex(95554);
    }

    void onFinally();

    void onStart();
}
