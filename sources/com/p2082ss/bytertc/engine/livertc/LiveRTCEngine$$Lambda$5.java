package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$$Lambda$5 */
public final /* synthetic */ class LiveRTCEngine$$Lambda$5 implements Runnable {
    private final LiveRTCEngine arg$1;

    static {
        Covode.recordClassIndex(101088);
    }

    LiveRTCEngine$$Lambda$5(LiveRTCEngine liveRTCEngine) {
        this.arg$1 = liveRTCEngine;
    }

    public final void run() {
        this.arg$1.lambda$parseRTCExtInfo$5$LiveRTCEngine();
    }
}
