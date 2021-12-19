package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.z */
public final /* synthetic */ class CallableC81085z implements Callable {

    /* renamed from: a */
    private final VideoBitRateABManager f181225a;

    static {
        Covode.recordClassIndex(94407);
    }

    CallableC81085z(VideoBitRateABManager videoBitRateABManager) {
        this.f181225a = videoBitRateABManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f181225a.mo123830e();
    }
}
