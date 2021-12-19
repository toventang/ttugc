package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.CameraNotAvailableException */
public class CameraNotAvailableException extends Exception {
    static {
        Covode.recordClassIndex(32650);
    }

    public CameraNotAvailableException() {
    }

    public CameraNotAvailableException(String str) {
        super(str);
    }
}
