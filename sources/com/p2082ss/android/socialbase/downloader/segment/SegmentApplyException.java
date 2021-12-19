package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;

/* renamed from: com.ss.android.socialbase.downloader.segment.SegmentApplyException */
class SegmentApplyException extends BaseException {

    /* renamed from: a */
    private int f73031a;

    static {
        Covode.recordClassIndex(37132);
    }

    SegmentApplyException(int i, String str) {
        super(1072, "applyCode=" + i + ", " + str);
        this.f73031a = i;
    }
}
