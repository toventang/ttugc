package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink$$Lambda$0 */
public final /* synthetic */ class InteractVideoSink$$Lambda$0 implements Runnable {
    private final InteractVideoSink arg$1;

    static {
        Covode.recordClassIndex(100376);
    }

    InteractVideoSink$$Lambda$0(InteractVideoSink interactVideoSink) {
        this.arg$1 = interactVideoSink;
    }

    public final void run() {
        this.arg$1.lambda$release$0$InteractVideoSink();
    }
}
