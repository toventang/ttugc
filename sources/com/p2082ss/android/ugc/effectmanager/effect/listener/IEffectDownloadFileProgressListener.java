package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadFileProgressListener */
public interface IEffectDownloadFileProgressListener {
    static {
        Covode.recordClassIndex(95547);
    }

    void onProgress(int i, long j);
}
