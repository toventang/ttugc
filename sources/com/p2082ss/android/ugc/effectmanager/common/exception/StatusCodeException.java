package com.p2082ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.exception.StatusCodeException */
public class StatusCodeException extends Exception {
    private int mStatusCode;

    static {
        Covode.recordClassIndex(95470);
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }

    public StatusCodeException(int i, String str) {
        super(str);
        this.mStatusCode = i;
    }
}
