package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$13 */
final /* synthetic */ class LiveStream$$Lambda$13 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(100031);
    }

    LiveStream$$Lambda$13(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.bridge$lambda$2$LiveStream();
    }
}
