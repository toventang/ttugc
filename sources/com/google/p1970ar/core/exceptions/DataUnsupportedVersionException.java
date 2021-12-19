package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.DataUnsupportedVersionException */
public class DataUnsupportedVersionException extends IllegalArgumentException {
    static {
        Covode.recordClassIndex(32653);
    }

    public DataUnsupportedVersionException() {
    }

    public DataUnsupportedVersionException(String str) {
        super(str);
    }
}
