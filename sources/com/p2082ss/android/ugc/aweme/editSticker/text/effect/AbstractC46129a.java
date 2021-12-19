package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.a */
public abstract class AbstractC46129a extends AbsDownloadListener {
    static {
        Covode.recordClassIndex(54688);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(C45866d.m88488a()).removeMainThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(C45866d.m88488a()).removeMainThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        if (downloadInfo != null) {
            Downloader.getInstance(C45866d.m88488a()).removeMainThreadListener(downloadInfo.getId(), this);
        }
    }
}
