package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.utils.VideoFrameConverter$$Lambda$0 */
public final /* synthetic */ class VideoFrameConverter$$Lambda$0 implements Runnable {
    private final RTCVideoFrame arg$1;

    static {
        Covode.recordClassIndex(101177);
    }

    private VideoFrameConverter$$Lambda$0(RTCVideoFrame rTCVideoFrame) {
        this.arg$1 = rTCVideoFrame;
    }

    static Runnable get$Lambda(RTCVideoFrame rTCVideoFrame) {
        return new VideoFrameConverter$$Lambda$0(rTCVideoFrame);
    }

    public final void run() {
        this.arg$1.release();
    }
}
