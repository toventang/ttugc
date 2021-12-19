package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.google.ar.core.exceptions.RecordingFailedException */
public class RecordingFailedException extends IOException {
    static {
        Covode.recordClassIndex(32664);
    }

    public RecordingFailedException() {
    }

    public RecordingFailedException(String str) {
        super(str);
    }
}
