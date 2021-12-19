package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.NotTrackingException */
public class NotTrackingException extends RuntimeException {
    static {
        Covode.recordClassIndex(32661);
    }

    public NotTrackingException() {
    }

    public NotTrackingException(String str) {
        super(str);
    }
}
