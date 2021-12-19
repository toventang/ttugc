package com.p2082ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadFileExistException */
public class DownloadFileExistException extends BaseException {

    /* renamed from: a */
    private String f72552a;

    /* renamed from: b */
    private String f72553b;

    static {
        Covode.recordClassIndex(36957);
    }

    public String getExistTargetFileName() {
        return this.f72553b;
    }

    public String getExistTargetFilePath() {
        return this.f72552a;
    }

    public DownloadFileExistException(String str, String str2) {
        this.f72552a = str;
        this.f72553b = str2;
    }
}
