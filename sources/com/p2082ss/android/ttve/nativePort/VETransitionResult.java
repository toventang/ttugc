package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.nativePort.VETransitionResult */
public class VETransitionResult {
    public int duration;
    public int transitionsType;

    static {
        Covode.recordClassIndex(37327);
    }

    public String toString() {
        return "TransitionResult{transitionsType=" + this.transitionsType + ", duration=" + this.duration + '}';
    }
}
