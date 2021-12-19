package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.af */
public final class RunnableC2226af implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Future f6673a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f6674b;

    static {
        Covode.recordClassIndex(2431);
    }

    public final void run() {
        if (!this.f6673a.isDone() && !this.f6673a.isCancelled()) {
            this.f6673a.cancel(true);
            Runnable runnable = this.f6674b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    RunnableC2226af(Future future, Runnable runnable) {
        this.f6673a = future;
        this.f6674b = runnable;
    }
}
