package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.SessionUnsupportedException */
public class SessionUnsupportedException extends IllegalStateException {
    static {
        Covode.recordClassIndex(32668);
    }

    public SessionUnsupportedException() {
    }

    public SessionUnsupportedException(String str) {
        super(str);
    }
}
