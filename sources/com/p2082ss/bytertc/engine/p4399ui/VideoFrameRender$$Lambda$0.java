package com.p2082ss.bytertc.engine.p4399ui;

import com.bytedance.covode.number.Covode;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$0 */
public final /* synthetic */ class VideoFrameRender$$Lambda$0 implements Runnable {
    private final VideoFrameRender arg$1;
    private final EglBase.Context arg$2;

    static {
        Covode.recordClassIndex(101130);
    }

    VideoFrameRender$$Lambda$0(VideoFrameRender videoFrameRender, EglBase.Context context) {
        this.arg$1 = videoFrameRender;
        this.arg$2 = context;
    }

    public final void run() {
        this.arg$1.lambda$init$0$VideoFrameRender(this.arg$2);
    }
}
