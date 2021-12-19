package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.MetadataNotFoundException */
public class MetadataNotFoundException extends Exception {
    static {
        Covode.recordClassIndex(32659);
    }

    public MetadataNotFoundException() {
    }

    public MetadataNotFoundException(String str) {
        super(str);
    }
}
