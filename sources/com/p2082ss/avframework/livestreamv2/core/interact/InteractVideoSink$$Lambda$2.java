package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink$$Lambda$2 */
public final /* synthetic */ class InteractVideoSink$$Lambda$2 implements Runnable {
    private final InteractVideoSink arg$1;
    private final ByteBuffer arg$2;
    private final int arg$3;
    private final int arg$4;
    private final Config.VideoOutputFormat arg$5;
    private final int arg$6;
    private final AtomicBoolean arg$7;

    static {
        Covode.recordClassIndex(100378);
    }

    InteractVideoSink$$Lambda$2(InteractVideoSink interactVideoSink, ByteBuffer byteBuffer, int i, int i2, Config.VideoOutputFormat videoOutputFormat, int i3, AtomicBoolean atomicBoolean) {
        this.arg$1 = interactVideoSink;
        this.arg$2 = byteBuffer;
        this.arg$3 = i;
        this.arg$4 = i2;
        this.arg$5 = videoOutputFormat;
        this.arg$6 = i3;
        this.arg$7 = atomicBoolean;
    }

    public final void run() {
        this.arg$1.lambda$loadYuvAndDraw$3$InteractVideoSink(this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6, this.arg$7);
    }
}
