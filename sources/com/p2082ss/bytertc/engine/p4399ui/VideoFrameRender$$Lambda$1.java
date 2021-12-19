package com.p2082ss.bytertc.engine.p4399ui;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$1 */
final /* synthetic */ class VideoFrameRender$$Lambda$1 implements Runnable {
    private final VideoFrameRender arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(101131);
    }

    VideoFrameRender$$Lambda$1(VideoFrameRender videoFrameRender, int i, int i2) {
        this.arg$1 = videoFrameRender;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$onFrameResolutionChanged$1$VideoFrameRender(this.arg$2, this.arg$3);
    }
}
