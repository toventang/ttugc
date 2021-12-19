package com.p2082ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException */
public class DownloadPauseReserveWifiException extends DownloadRetryNeedlessException {
    static {
        Covode.recordClassIndex(36961);
    }

    public DownloadPauseReserveWifiException() {
        super(1013, "download reserve wifi");
    }
}
