package com.p2082ss.bytertc.engine.p4399ui;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$4 */
public final /* synthetic */ class VideoFrameRender$$Lambda$4 implements Runnable {
    private final ByteBuffer arg$1;
    private final ByteBuffer arg$2;
    private final ByteBuffer arg$3;

    static {
        Covode.recordClassIndex(101134);
    }

    VideoFrameRender$$Lambda$4(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        this.arg$1 = byteBuffer;
        this.arg$2 = byteBuffer2;
        this.arg$3 = byteBuffer3;
    }

    public final void run() {
        VideoFrameRender.lambda$createYUV$4$VideoFrameRender(this.arg$1, this.arg$2, this.arg$3);
    }
}
