package com.p2082ss.android.socialbase.downloader.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.IDownloadDepend */
public interface IDownloadDepend {
    static {
        Covode.recordClassIndex(36845);
    }

    void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i);
}
