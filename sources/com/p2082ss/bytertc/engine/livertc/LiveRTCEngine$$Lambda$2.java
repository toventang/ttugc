package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$$Lambda$2 */
public final /* synthetic */ class LiveRTCEngine$$Lambda$2 implements Runnable {
    private final LiveRTCEngine arg$1;

    static {
        Covode.recordClassIndex(101085);
    }

    LiveRTCEngine$$Lambda$2(LiveRTCEngine liveRTCEngine) {
        this.arg$1 = liveRTCEngine;
    }

    public final void run() {
        this.arg$1.lambda$disableRtcPhoneListener$2$LiveRTCEngine();
    }
}
