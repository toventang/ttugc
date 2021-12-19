package com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.ugc.aweme.kids.a.c.a */
public abstract class AbstractC57085a extends AbsDownloadListener {
    static {
        Covode.recordClassIndex(66979);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(C17867d.m33078a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(C17867d.m33078a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        if (downloadInfo != null) {
            Downloader.getInstance(C17867d.m33078a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }
}
