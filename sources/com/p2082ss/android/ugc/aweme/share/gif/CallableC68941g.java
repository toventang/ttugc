package com.p2082ss.android.ugc.aweme.share.gif;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.gif.g */
public final /* synthetic */ class CallableC68941g implements Callable {

    /* renamed from: a */
    private final Runnable f154239a;

    static {
        Covode.recordClassIndex(81251);
    }

    CallableC68941g(Runnable runnable) {
        this.f154239a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f154239a.run();
        return null;
    }
}
