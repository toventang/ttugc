package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;

/* renamed from: com.ss.avframework.engine.VideoSink */
public abstract class VideoSink extends NativeObject {
    static {
        Covode.recordClassIndex(99990);
    }

    /* access modifiers changed from: protected */
    public abstract void OnDiscardedFrame();

    /* access modifiers changed from: protected */
    public abstract void onFrame(VideoFrame videoFrame);

    public void onFrameOnJava(VideoFrame videoFrame) {
        onFrame(videoFrame);
    }
}
