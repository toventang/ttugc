package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener */
public interface IDownloadProviderEffectProgressListener extends IDownloadProviderEffectListener {
    static {
        Covode.recordClassIndex(95546);
    }

    void onProgress(ProviderEffect providerEffect, int i, long j);
}
