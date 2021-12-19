package com.p2082ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.exception.NetException */
public class NetException extends Exception {
    private int status_code;

    static {
        Covode.recordClassIndex(95469);
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public NetException(int i, String str) {
        super(str);
        this.status_code = i;
    }
}
