package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class SurfaceTextureHelper$$Lambda$3 implements Runnable {
    private final SurfaceTextureHelper arg$1;
    private final int arg$2;

    static {
        Covode.recordClassIndex(106714);
    }

    SurfaceTextureHelper$$Lambda$3(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.arg$1 = surfaceTextureHelper;
        this.arg$2 = i;
    }

    public final void run() {
        this.arg$1.lambda$setFrameRotation$3$SurfaceTextureHelper(this.arg$2);
    }
}
