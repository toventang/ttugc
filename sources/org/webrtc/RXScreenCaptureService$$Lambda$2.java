package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class RXScreenCaptureService$$Lambda$2 implements Runnable {
    private final int arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(106685);
    }

    RXScreenCaptureService$$Lambda$2(int i, int i2, int i3) {
        this.arg$1 = i;
        this.arg$2 = i2;
        this.arg$3 = i3;
    }

    public final void run() {
        RXScreenCaptureService.lambda$changeCaptureFormat$2$RXScreenCaptureService(this.arg$1, this.arg$2, this.arg$3);
    }
}
