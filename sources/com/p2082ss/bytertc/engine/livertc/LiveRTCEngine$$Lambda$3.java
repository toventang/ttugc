package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.live.LiveTranscoding;

/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$$Lambda$3 */
final /* synthetic */ class LiveRTCEngine$$Lambda$3 implements Runnable {
    private final LiveRTCEngine arg$1;
    private final LiveTranscoding arg$2;

    static {
        Covode.recordClassIndex(101086);
    }

    LiveRTCEngine$$Lambda$3(LiveRTCEngine liveRTCEngine, LiveTranscoding liveTranscoding) {
        this.arg$1 = liveRTCEngine;
        this.arg$2 = liveTranscoding;
    }

    public final void run() {
        this.arg$1.lambda$startLiveTranscoding$3$LiveRTCEngine(this.arg$2);
    }
}
