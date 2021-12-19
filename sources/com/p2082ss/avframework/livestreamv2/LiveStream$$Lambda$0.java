package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.SITICalculator;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$0 */
final /* synthetic */ class LiveStream$$Lambda$0 implements SITICalculator.ISITIEventObserver {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(100026);
    }

    LiveStream$$Lambda$0(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    @Override // com.p2082ss.avframework.engine.SITICalculator.ISITIEventObserver
    public final void onBitrateChanged(int i, String str) {
        this.arg$1.lambda$new$0$LiveStream(i, str);
    }
}
