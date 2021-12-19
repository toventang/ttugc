package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.TextureNotSetException */
public class TextureNotSetException extends IllegalStateException {
    static {
        Covode.recordClassIndex(32669);
    }

    public TextureNotSetException() {
    }

    public TextureNotSetException(String str) {
        super(str);
    }
}
