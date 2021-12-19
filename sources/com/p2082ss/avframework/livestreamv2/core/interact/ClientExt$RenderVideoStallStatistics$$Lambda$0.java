package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.ClientExt;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$RenderVideoStallStatistics$$Lambda$0 */
final /* synthetic */ class ClientExt$RenderVideoStallStatistics$$Lambda$0 implements Runnable {
    private final ClientExt.RenderVideoStallStatistics arg$1;

    static {
        Covode.recordClassIndex(100316);
    }

    ClientExt$RenderVideoStallStatistics$$Lambda$0(ClientExt.RenderVideoStallStatistics renderVideoStallStatistics) {
        this.arg$1 = renderVideoStallStatistics;
    }

    public final void run() {
        this.arg$1.lambda$startStatistics$0$ClientExt$RenderVideoStallStatistics();
    }
}
