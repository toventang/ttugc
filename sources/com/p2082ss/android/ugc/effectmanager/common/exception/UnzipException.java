package com.p2082ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.exception.UnzipException */
public class UnzipException extends Exception {
    static {
        Covode.recordClassIndex(95471);
    }

    public UnzipException(Exception exc) {
        super(exc);
    }

    public UnzipException(String str) {
        super(str);
    }
}
