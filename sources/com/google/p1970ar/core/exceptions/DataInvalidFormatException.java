package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.DataInvalidFormatException */
public class DataInvalidFormatException extends IllegalArgumentException {
    static {
        Covode.recordClassIndex(32652);
    }

    public DataInvalidFormatException() {
    }

    public DataInvalidFormatException(String str) {
        super(str);
    }
}
