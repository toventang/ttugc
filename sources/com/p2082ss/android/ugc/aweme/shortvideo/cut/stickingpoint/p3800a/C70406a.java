package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a */
public class C70406a implements IDownloadListener {
    static {
        Covode.recordClassIndex(82849);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        C89219l.m154721d(downloadInfo, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
        C89219l.m154721d(downloadInfo, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
        C89219l.m154721d(downloadInfo, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        C89219l.m154721d(downloadInfo, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        C89219l.m154721d(downloadInfo, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        C89219l.m154721d(downloadInfo, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        C89219l.m154721d(downloadInfo, "");
        C89219l.m154721d(baseException, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        C89219l.m154721d(downloadInfo, "");
        C89219l.m154721d(baseException, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        C89219l.m154721d(downloadInfo, "");
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
    }
}
