package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.PlaybackStatus */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(32607);
    }

    static PlaybackStatus forNumber(int i) {
        PlaybackStatus[] values = values();
        for (PlaybackStatus playbackStatus : values) {
            if (playbackStatus.nativeCode == i) {
                return playbackStatus;
            }
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("Unexpected value for native PlaybackStatus, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    private PlaybackStatus(int i) {
        this.nativeCode = i;
    }
}
