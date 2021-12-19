package com.p2082ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadHttpException */
public class DownloadHttpException extends BaseException {

    /* renamed from: a */
    private final int f72554a;

    static {
        Covode.recordClassIndex(36958);
    }

    public int getHttpStatusCode() {
        return this.f72554a;
    }

    public DownloadHttpException(int i, int i2, String str) {
        super(i, str);
        this.f72554a = i2;
    }
}
