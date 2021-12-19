package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.ResourceExhaustedException */
public class ResourceExhaustedException extends RuntimeException {
    static {
        Covode.recordClassIndex(32665);
    }

    public ResourceExhaustedException() {
    }

    public ResourceExhaustedException(String str) {
        super(str);
    }
}
