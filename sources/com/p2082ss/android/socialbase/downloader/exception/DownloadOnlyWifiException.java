package com.p2082ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException */
public class DownloadOnlyWifiException extends DownloadRetryNeedlessException {
    static {
        Covode.recordClassIndex(36959);
    }

    public DownloadOnlyWifiException() {
        super(1013, "download only wifi");
    }
}
