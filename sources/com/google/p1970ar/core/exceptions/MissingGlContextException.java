package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.MissingGlContextException */
public class MissingGlContextException extends IllegalStateException {
    static {
        Covode.recordClassIndex(32660);
    }

    public MissingGlContextException() {
    }

    public MissingGlContextException(String str) {
        super(str);
    }
}
