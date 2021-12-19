package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$$Lambda$6 */
public final /* synthetic */ class LiveRTCEngine$$Lambda$6 implements Runnable {
    private final LiveRTCEngine arg$1;
    private final int arg$2;

    static {
        Covode.recordClassIndex(101089);
    }

    LiveRTCEngine$$Lambda$6(LiveRTCEngine liveRTCEngine, int i) {
        this.arg$1 = liveRTCEngine;
        this.arg$2 = i;
    }

    public final void run() {
        this.arg$1.lambda$handleTransCodeError$6$LiveRTCEngine(this.arg$2);
    }
}
