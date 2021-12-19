package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class RXScreenCaptureService$$Lambda$0 implements Runnable {
    private final int arg$1;
    private final int arg$2;
    private final int arg$3;
    private final int arg$4;

    static {
        Covode.recordClassIndex(106683);
    }

    RXScreenCaptureService$$Lambda$0(int i, int i2, int i3, int i4) {
        this.arg$1 = i;
        this.arg$2 = i2;
        this.arg$3 = i3;
        this.arg$4 = i4;
    }

    public final void run() {
        RXScreenCaptureService.lambda$startCapture$0$RXScreenCaptureService(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
    }
}
