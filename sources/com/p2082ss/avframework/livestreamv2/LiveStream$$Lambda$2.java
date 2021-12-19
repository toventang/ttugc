package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$2 */
final /* synthetic */ class LiveStream$$Lambda$2 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(100033);
    }

    LiveStream$$Lambda$2(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.lambda$startVideoCapture$2$LiveStream();
    }
}
