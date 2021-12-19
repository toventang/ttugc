package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.DeadlineExceededException */
public class DeadlineExceededException extends IllegalStateException {
    static {
        Covode.recordClassIndex(32654);
    }

    public DeadlineExceededException() {
    }

    public DeadlineExceededException(String str) {
        super(str);
    }
}
