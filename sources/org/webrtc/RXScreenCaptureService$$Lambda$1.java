package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class RXScreenCaptureService$$Lambda$1 implements Runnable {
    private final RXScreenCaptureService arg$1;
    private final int arg$2;

    static {
        Covode.recordClassIndex(106684);
    }

    RXScreenCaptureService$$Lambda$1(RXScreenCaptureService rXScreenCaptureService, int i) {
        this.arg$1 = rXScreenCaptureService;
        this.arg$2 = i;
    }

    public final void run() {
        this.arg$1.lambda$stopCapture$1$RXScreenCaptureService(this.arg$2);
    }
}
