package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$$Lambda$0 */
public final /* synthetic */ class LiveRTCEngine$$Lambda$0 implements ThreadFactory {
    private final LiveRTCEngine arg$1;

    static {
        Covode.recordClassIndex(101083);
    }

    LiveRTCEngine$$Lambda$0(LiveRTCEngine liveRTCEngine) {
        this.arg$1 = liveRTCEngine;
    }

    public final Thread newThread(Runnable runnable) {
        return this.arg$1.lambda$new$0$LiveRTCEngine(runnable);
    }
}
