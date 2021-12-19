package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink$$Lambda$3 */
public final /* synthetic */ class InteractVideoSink$$Lambda$3 implements Runnable {
    private final InteractVideoSink arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100379);
    }

    InteractVideoSink$$Lambda$3(InteractVideoSink interactVideoSink, int i, int i2) {
        this.arg$1 = interactVideoSink;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$createTexture$4$InteractVideoSink(this.arg$2, this.arg$3);
    }
}
