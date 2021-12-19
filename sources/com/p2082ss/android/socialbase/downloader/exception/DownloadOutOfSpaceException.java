package com.p2082ss.android.socialbase.downloader.exception;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException */
public class DownloadOutOfSpaceException extends BaseException {

    /* renamed from: a */
    private final long f72555a;

    /* renamed from: b */
    private final long f72556b;

    static {
        Covode.recordClassIndex(36960);
    }

    public long getAvaliableSpaceBytes() {
        return this.f72555a;
    }

    public long getRequiredSpaceBytes() {
        return this.f72556b;
    }

    public DownloadOutOfSpaceException(long j, long j2) {
        super(1006, C1764a.m5928a("space is not enough required space is : %s but available space is :%s", new Object[]{String.valueOf(j2), String.valueOf(j)}));
        this.f72555a = j;
        this.f72556b = j2;
    }
}
