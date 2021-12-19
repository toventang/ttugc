package com.p2082ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.mediaio.IVideoFrameConsumer */
public interface IVideoFrameConsumer {
    static {
        Covode.recordClassIndex(101112);
    }

    void consumeVideoFrame(RTCVideoFrame rTCVideoFrame);
}
