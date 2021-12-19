package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.utils.VideoFrameConverter$$Lambda$1 */
public final /* synthetic */ class VideoFrameConverter$$Lambda$1 implements Runnable {
    private final VideoFrameConverter arg$1;
    private final RTCVideoFrame arg$2;

    static {
        Covode.recordClassIndex(101178);
    }

    VideoFrameConverter$$Lambda$1(VideoFrameConverter videoFrameConverter, RTCVideoFrame rTCVideoFrame) {
        this.arg$1 = videoFrameConverter;
        this.arg$2 = rTCVideoFrame;
    }

    public final void run() {
        this.arg$1.lambda$convert2VideoFrame$0$VideoFrameConverter(this.arg$2);
    }
}
