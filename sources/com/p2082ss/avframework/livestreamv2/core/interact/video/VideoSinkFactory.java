package com.p2082ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory */
public interface VideoSinkFactory {
    static {
        Covode.recordClassIndex(100456);
    }

    VideoSink create(String str, boolean z, boolean z2, boolean z3);

    void destroy(VideoSink videoSink);
}
