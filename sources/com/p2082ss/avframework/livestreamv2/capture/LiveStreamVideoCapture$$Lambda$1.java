package com.p2082ss.avframework.livestreamv2.capture;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$$Lambda$1 */
public final /* synthetic */ class LiveStreamVideoCapture$$Lambda$1 implements Runnable {
    private final LiveStreamVideoCapture arg$1;
    private final boolean arg$2;
    private final boolean arg$3;

    static {
        Covode.recordClassIndex(100153);
    }

    LiveStreamVideoCapture$$Lambda$1(LiveStreamVideoCapture liveStreamVideoCapture, boolean z, boolean z2) {
        this.arg$1 = liveStreamVideoCapture;
        this.arg$2 = z;
        this.arg$3 = z2;
    }

    public final void run() {
        this.arg$1.lambda$enableMirror$0$LiveStreamVideoCapture(this.arg$2, this.arg$3);
    }
}
