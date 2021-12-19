package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$9 */
final /* synthetic */ class LiveStream$$Lambda$9 implements Runnable {
    private final LiveStream arg$1;
    private final int arg$2;

    static {
        Covode.recordClassIndex(100040);
    }

    LiveStream$$Lambda$9(LiveStream liveStream, int i) {
        this.arg$1 = liveStream;
        this.arg$2 = i;
    }

    public final void run() {
        this.arg$1.lambda$switchVideoCapture$7$LiveStream(this.arg$2);
    }
}
