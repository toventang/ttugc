package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl$$Lambda$0 */
final /* synthetic */ class InteractEngineImpl$$Lambda$0 implements Runnable {
    private final InteractEngineImpl arg$1;
    private final Client[] arg$2;
    private final LiveCore.InteractConfig arg$3;

    static {
        Covode.recordClassIndex(100359);
    }

    InteractEngineImpl$$Lambda$0(InteractEngineImpl interactEngineImpl, Client[] clientArr, LiveCore.InteractConfig interactConfig) {
        this.arg$1 = interactEngineImpl;
        this.arg$2 = clientArr;
        this.arg$3 = interactConfig;
    }

    public final void run() {
        this.arg$1.lambda$create$0$InteractEngineImpl(this.arg$2, this.arg$3);
    }
}
