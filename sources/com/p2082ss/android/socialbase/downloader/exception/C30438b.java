package com.p2082ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.exception.b */
public final class C30438b extends Throwable {

    /* renamed from: a */
    private String f72558a;

    static {
        Covode.recordClassIndex(36965);
    }

    public final String getErrorMsg() {
        return this.f72558a;
    }

    public final void setErrorMsg(String str) {
        this.f72558a = str;
    }

    public C30438b(String str) {
        super(str);
        this.f72558a = str;
    }
}
