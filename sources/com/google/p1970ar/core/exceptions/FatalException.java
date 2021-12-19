package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.FatalException */
public class FatalException extends RuntimeException {
    static {
        Covode.recordClassIndex(32655);
    }

    public FatalException() {
    }

    public FatalException(String str) {
        super(str);
    }

    public FatalException(String str, Throwable th) {
        super(str, th);
    }
}
