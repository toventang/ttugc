package com.p2082ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.Receiver;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.filter.LiveCoreKaraokFilter$$Lambda$0 */
public final /* synthetic */ class LiveCoreKaraokFilter$$Lambda$0 implements Runnable {
    private final LiveCoreKaraokFilter arg$1;
    private final Receiver arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100549);
    }

    LiveCoreKaraokFilter$$Lambda$0(LiveCoreKaraokFilter liveCoreKaraokFilter, Receiver receiver, int i) {
        this.arg$1 = liveCoreKaraokFilter;
        this.arg$2 = receiver;
        this.arg$3 = i;
    }

    public final void run() {
        this.arg$1.lambda$processInternal$0$LiveCoreKaraokFilter(this.arg$2, this.arg$3);
    }
}
