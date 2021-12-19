package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.aj */
public final /* synthetic */ class CallableC80215aj implements Callable {

    /* renamed from: a */
    private final Runnable f179686a;

    /* renamed from: b */
    private final String f179687b;

    static {
        Covode.recordClassIndex(93483);
    }

    CallableC80215aj(Runnable runnable, String str) {
        this.f179686a = runnable;
        this.f179687b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable = this.f179686a;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
