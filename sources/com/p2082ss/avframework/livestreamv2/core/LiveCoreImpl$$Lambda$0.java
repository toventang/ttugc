package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$$Lambda$0 */
final /* synthetic */ class LiveCoreImpl$$Lambda$0 implements Runnable {
    private final LiveCoreImpl arg$1;
    private final ByteBuffer arg$2;
    private final String arg$3;

    static {
        Covode.recordClassIndex(100246);
    }

    LiveCoreImpl$$Lambda$0(LiveCoreImpl liveCoreImpl, ByteBuffer byteBuffer, String str) {
        this.arg$1 = liveCoreImpl;
        this.arg$2 = byteBuffer;
        this.arg$3 = str;
    }

    public final void run() {
        this.arg$1.lambda$pushSeiData$0$LiveCoreImpl(this.arg$2, this.arg$3);
    }
}
