package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.base.utils.NetworkConnectChangeReceiver;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.GameRTCEngineImpl$$Lambda$1 */
public final /* synthetic */ class GameRTCEngineImpl$$Lambda$1 implements NetworkConnectChangeReceiver.Callback {
    private final GameRTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100882);
    }

    GameRTCEngineImpl$$Lambda$1(GameRTCEngineImpl gameRTCEngineImpl) {
        this.arg$1 = gameRTCEngineImpl;
    }

    @Override // com.p2082ss.bytertc.base.utils.NetworkConnectChangeReceiver.Callback
    public final void call(int i) {
        this.arg$1.lambda$new$3$GameRTCEngineImpl(i);
    }
}
