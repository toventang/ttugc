package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$$Lambda$4 */
public final /* synthetic */ class LiveRTCEngine$$Lambda$4 implements Runnable {
    private final IRTCEngineEventHandler arg$1;

    static {
        Covode.recordClassIndex(101087);
    }

    LiveRTCEngine$$Lambda$4(IRTCEngineEventHandler iRTCEngineEventHandler) {
        this.arg$1 = iRTCEngineEventHandler;
    }

    public final void run() {
        this.arg$1.onError(1214);
    }
}
