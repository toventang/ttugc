package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.y */
public final /* synthetic */ class CallableC81084y implements Callable {

    /* renamed from: a */
    private final VideoBitRateABManager f181224a;

    static {
        Covode.recordClassIndex(94406);
    }

    CallableC81084y(VideoBitRateABManager videoBitRateABManager) {
        this.f181224a = videoBitRateABManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f181224a.mo123831f();
    }
}
