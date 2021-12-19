package com.twitter.sdk.android.core.internal;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.AbstractC87688f;
import com.twitter.sdk.android.core.C87794k;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.twitter.sdk.android.core.internal.k */
final /* synthetic */ class RunnableC87732k implements Runnable {

    /* renamed from: a */
    private final ExecutorService f199252a;

    /* renamed from: b */
    private final long f199253b = 1;

    /* renamed from: c */
    private final TimeUnit f199254c;

    /* renamed from: d */
    private final String f199255d;

    static {
        Covode.recordClassIndex(103721);
    }

    RunnableC87732k(ExecutorService executorService, TimeUnit timeUnit, String str) {
        this.f199252a = executorService;
        this.f199254c = timeUnit;
        this.f199255d = str;
    }

    public final void run() {
        ExecutorService executorService = this.f199252a;
        long j = this.f199253b;
        TimeUnit timeUnit = this.f199254c;
        String str = this.f199255d;
        try {
            executorService.shutdown();
            if (!executorService.awaitTermination(j, timeUnit)) {
                C87794k.m152811c().mo142113b();
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            AbstractC87688f c = C87794k.m152811c();
            C1764a.m5929a(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str});
            c.mo142113b();
            executorService.shutdownNow();
        }
    }
}
