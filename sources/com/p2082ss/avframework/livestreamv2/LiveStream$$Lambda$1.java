package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$1 */
final /* synthetic */ class LiveStream$$Lambda$1 implements Runnable {
    private final LiveStream arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(100027);
    }

    LiveStream$$Lambda$1(LiveStream liveStream, boolean z) {
        this.arg$1 = liveStream;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$switchVideoSinkForDualGame$1$LiveStream(this.arg$2);
    }
}
