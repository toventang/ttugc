package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.UnavailableSdkTooOldException */
public class UnavailableSdkTooOldException extends UnavailableException {
    static {
        Covode.recordClassIndex(32674);
    }

    public UnavailableSdkTooOldException() {
    }

    public UnavailableSdkTooOldException(String str) {
        super(str);
    }
}
