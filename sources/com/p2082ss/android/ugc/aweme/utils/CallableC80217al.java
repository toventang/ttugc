package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.al */
public final /* synthetic */ class CallableC80217al implements Callable {

    /* renamed from: a */
    private final Runnable f179689a;

    /* renamed from: b */
    private final String f179690b;

    static {
        Covode.recordClassIndex(93485);
    }

    CallableC80217al(Runnable runnable, String str) {
        this.f179689a = runnable;
        this.f179690b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable = this.f179689a;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
