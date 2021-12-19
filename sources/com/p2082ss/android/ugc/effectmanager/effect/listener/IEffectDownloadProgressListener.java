package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener */
public interface IEffectDownloadProgressListener extends IFetchEffectListener {
    static {
        Covode.recordClassIndex(95548);
    }

    void onProgress(Effect effect, int i, long j);
}
