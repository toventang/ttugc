package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$$Lambda$1 */
public final /* synthetic */ class LiveRTCEngine$$Lambda$1 implements Runnable {
    private final LiveRTCEngine arg$1;

    static {
        Covode.recordClassIndex(101084);
    }

    LiveRTCEngine$$Lambda$1(LiveRTCEngine liveRTCEngine) {
        this.arg$1 = liveRTCEngine;
    }

    public final void run() {
        this.arg$1.lambda$enableRtcPhoneListener$1$LiveRTCEngine();
    }
}
