package com.p2082ss.bytertc.engine.engineimpl;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$$Lambda$3 */
public final /* synthetic */ class RTCEngineImpl$$Lambda$3 implements Runnable {
    private final RTCEngineImpl arg$1;
    private final Object arg$2;

    static {
        Covode.recordClassIndex(100995);
    }

    RTCEngineImpl$$Lambda$3(RTCEngineImpl rTCEngineImpl, Object obj) {
        this.arg$1 = rTCEngineImpl;
        this.arg$2 = obj;
    }

    public final void run() {
        this.arg$1.lambda$new$2$RTCEngineImpl(this.arg$2);
    }
}
