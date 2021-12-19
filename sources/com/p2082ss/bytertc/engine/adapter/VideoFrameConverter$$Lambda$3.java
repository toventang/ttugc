package com.p2082ss.bytertc.engine.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.adapter.VideoFrameConverter;

/* renamed from: com.ss.bytertc.engine.adapter.VideoFrameConverter$$Lambda$3 */
final /* synthetic */ class VideoFrameConverter$$Lambda$3 implements Runnable {
    private final VideoFrameConverter.ByteBufferHolder arg$1;

    static {
        Covode.recordClassIndex(100954);
    }

    VideoFrameConverter$$Lambda$3(VideoFrameConverter.ByteBufferHolder byteBufferHolder) {
        this.arg$1 = byteBufferHolder;
    }

    public final void run() {
        VideoFrameConverter.lambda$convertToJavaI420Buffer$3$VideoFrameConverter(this.arg$1);
    }
}
