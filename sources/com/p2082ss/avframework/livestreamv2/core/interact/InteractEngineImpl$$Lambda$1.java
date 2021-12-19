package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl$$Lambda$1 */
public final /* synthetic */ class InteractEngineImpl$$Lambda$1 implements Runnable {
    private final InteractEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100360);
    }

    InteractEngineImpl$$Lambda$1(InteractEngineImpl interactEngineImpl) {
        this.arg$1 = interactEngineImpl;
    }

    public final void run() {
        this.arg$1.lambda$checkReleaseRtcEngine$1$InteractEngineImpl();
    }
}
