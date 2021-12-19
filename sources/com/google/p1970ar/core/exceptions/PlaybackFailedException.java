package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.google.ar.core.exceptions.PlaybackFailedException */
public class PlaybackFailedException extends IOException {
    static {
        Covode.recordClassIndex(32663);
    }

    public PlaybackFailedException() {
    }

    public PlaybackFailedException(String str) {
        super(str);
    }
}
