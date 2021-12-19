package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.TrackingState */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(32625);
    }

    static TrackingState forNumber(int i) {
        TrackingState[] values = values();
        for (TrackingState trackingState : values) {
            if (trackingState.nativeCode == i) {
                return trackingState;
            }
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Unexpected value for native TrackingState, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    private TrackingState(int i) {
        this.nativeCode = i;
    }
}
