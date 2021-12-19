package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.ImageInsufficientQualityException */
public class ImageInsufficientQualityException extends IllegalArgumentException {
    static {
        Covode.recordClassIndex(32657);
    }

    public ImageInsufficientQualityException() {
    }

    public ImageInsufficientQualityException(String str) {
        super(str);
    }
}
