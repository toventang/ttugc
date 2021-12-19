package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.utils.AppMonitor;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.GameRTCEngineImpl$$Lambda$0 */
public final /* synthetic */ class GameRTCEngineImpl$$Lambda$0 implements AppMonitor.Callback {
    private final GameRTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100881);
    }

    GameRTCEngineImpl$$Lambda$0(GameRTCEngineImpl gameRTCEngineImpl) {
        this.arg$1 = gameRTCEngineImpl;
    }

    @Override // com.p2082ss.bytertc.engine.utils.AppMonitor.Callback
    public final void callback(int i) {
        this.arg$1.lambda$new$0$GameRTCEngineImpl(i);
    }
}
