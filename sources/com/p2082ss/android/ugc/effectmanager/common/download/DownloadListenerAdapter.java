package com.p2082ss.android.ugc.effectmanager.common.download;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter */
public class DownloadListenerAdapter implements DownloadListener {
    static {
        Covode.recordClassIndex(95465);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onFinish(DownloadResult downloadResult) {
        C89219l.m154719c(downloadResult, "");
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onProgress(int i, long j) {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onStart() {
    }
}
