package com.p2082ss.bytertc.engine.engineimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.utils.AppMonitor;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$$Lambda$1 */
public final /* synthetic */ class RTCEngineImpl$$Lambda$1 implements AppMonitor.Callback {
    private final RTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100993);
    }

    RTCEngineImpl$$Lambda$1(RTCEngineImpl rTCEngineImpl) {
        this.arg$1 = rTCEngineImpl;
    }

    @Override // com.p2082ss.bytertc.engine.utils.AppMonitor.Callback
    public final void callback(int i) {
        this.arg$1.lambda$new$1$RTCEngineImpl(i);
    }
}
