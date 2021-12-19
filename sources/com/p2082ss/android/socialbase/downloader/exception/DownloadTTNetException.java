package com.p2082ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadTTNetException */
public class DownloadTTNetException extends BaseException {
    static {
        Covode.recordClassIndex(36963);
    }

    public String getRequestLog() {
        return getExtraInfo();
    }

    public DownloadTTNetException setRequestLog(String str) {
        setExtraInfo(str);
        return this;
    }

    public DownloadTTNetException(int i, String str) {
        super(i, str);
    }

    public DownloadTTNetException(int i, Throwable th) {
        super(i, th);
    }
}
