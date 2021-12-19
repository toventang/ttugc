package com.p2082ss.avframework.livestreamv2.capture;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$$Lambda$0 */
final /* synthetic */ class LiveStreamVideoCapture$$Lambda$0 implements Runnable {
    private final LiveStreamVideoCapture arg$1;

    static {
        Covode.recordClassIndex(100152);
    }

    LiveStreamVideoCapture$$Lambda$0(LiveStreamVideoCapture liveStreamVideoCapture) {
        this.arg$1 = liveStreamVideoCapture;
    }

    public final void run() {
        this.arg$1.bridge$lambda$0$LiveStreamVideoCapture();
    }
}
