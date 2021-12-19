package com.p2082ss.android.ugc.aweme.services.download;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.common.p2631c.C39089a;

/* renamed from: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl$downloadFile$1 */
public final class AVDownloadServiceImpl$downloadFile$1 extends AbsDownloadListener {
    final /* synthetic */ C39089a $listener;
    final /* synthetic */ AVDownloadServiceImpl this$0;

    static {
        Covode.recordClassIndex(79761);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            downloadInfo.getCurBytes();
            downloadInfo.getTotalBytes();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        C39089a aVar = this.$listener;
        if (aVar != null) {
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = "";
            }
            aVar.mo67844a(str, this.this$0.getFullFilePath(downloadInfo));
        }
    }

    AVDownloadServiceImpl$downloadFile$1(AVDownloadServiceImpl aVDownloadServiceImpl, C39089a aVar) {
        this.this$0 = aVDownloadServiceImpl;
        this.$listener = aVar;
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        C39089a aVar = this.$listener;
        if (aVar != null) {
            if (baseException != null) {
                baseException.getErrorMessage();
                Integer.valueOf(baseException.getErrorCode());
            }
            aVar.mo67843a();
        }
    }
}
