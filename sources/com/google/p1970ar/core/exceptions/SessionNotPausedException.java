package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.SessionNotPausedException */
public class SessionNotPausedException extends IllegalStateException {
    static {
        Covode.recordClassIndex(32666);
    }

    public SessionNotPausedException() {
    }

    public SessionNotPausedException(String str) {
        super(str);
    }
}
