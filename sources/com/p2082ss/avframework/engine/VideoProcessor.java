package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;

/* renamed from: com.ss.avframework.engine.VideoProcessor */
public abstract class VideoProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(99989);
    }

    /* access modifiers changed from: protected */
    public abstract VideoFrame process(VideoFrame videoFrame);
}
