package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$5 */
final /* synthetic */ class LiveStream$$Lambda$5 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(100036);
    }

    LiveStream$$Lambda$5(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.lambda$stopAudioCapture$5$LiveStream();
    }
}
