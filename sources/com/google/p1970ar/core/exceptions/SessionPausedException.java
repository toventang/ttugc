package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.SessionPausedException */
public class SessionPausedException extends IllegalStateException {
    static {
        Covode.recordClassIndex(32667);
    }

    public SessionPausedException() {
    }

    public SessionPausedException(String str) {
        super(str);
    }
}
