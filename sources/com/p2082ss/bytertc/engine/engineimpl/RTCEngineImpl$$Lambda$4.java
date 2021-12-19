package com.p2082ss.bytertc.engine.engineimpl;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$$Lambda$4 */
public final /* synthetic */ class RTCEngineImpl$$Lambda$4 implements Runnable {
    private final RTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100996);
    }

    RTCEngineImpl$$Lambda$4(RTCEngineImpl rTCEngineImpl) {
        this.arg$1 = rTCEngineImpl;
    }

    public final void run() {
        this.arg$1.lambda$doDestroy$3$RTCEngineImpl();
    }
}
