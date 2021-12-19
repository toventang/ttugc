package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.IDualGameEngine;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream$$Lambda$14 */
final /* synthetic */ class LiveStream$$Lambda$14 implements IDualGameEngine.IDualGameNotifierToLiveCore {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(100032);
    }

    LiveStream$$Lambda$14(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine.IDualGameNotifierToLiveCore
    public final void onDualGameStatusChange(boolean z) {
        this.arg$1.switchVideoSinkForDualGame(z);
    }
}
