package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.n */
public final /* synthetic */ class CallableC49743n implements Callable {

    /* renamed from: a */
    private final Runnable f114490a;

    static {
        Covode.recordClassIndex(58847);
    }

    CallableC49743n(Runnable runnable) {
        this.f114490a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f114490a.run();
        return null;
    }
}
