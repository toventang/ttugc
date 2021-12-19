package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$4 */
final /* synthetic */ class LiveStream$$Lambda$4 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(100035);
    }

    LiveStream$$Lambda$4(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.lambda$stopVideoCapture$4$LiveStream();
    }
}
