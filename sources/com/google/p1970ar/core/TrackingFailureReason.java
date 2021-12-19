package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.TrackingFailureReason */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(32624);
    }

    static TrackingFailureReason forNumber(int i) {
        TrackingFailureReason[] values = values();
        for (TrackingFailureReason trackingFailureReason : values) {
            if (trackingFailureReason.nativeCode == i) {
                return trackingFailureReason;
            }
        }
        StringBuilder sb = new StringBuilder(68);
        sb.append("Unexpected value for native TrackingFailureReason, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    private TrackingFailureReason(int i) {
        this.nativeCode = i;
    }
}
