package com.p2082ss.android.ugc.effectmanager.common.download;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.download.DownloadListener */
public interface DownloadListener {
    static {
        Covode.recordClassIndex(95464);
    }

    void onFinish(DownloadResult downloadResult);

    void onProgress(int i, long j);

    void onStart();
}
