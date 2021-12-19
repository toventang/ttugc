package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$12 */
public final /* synthetic */ class LiveStream$$Lambda$12 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(100030);
    }

    LiveStream$$Lambda$12(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.requestKeyFrame();
    }
}
