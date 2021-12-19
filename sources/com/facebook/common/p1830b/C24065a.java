package com.facebook.common.p1830b;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.a */
public final class C24065a extends AbstractExecutorService {

    /* renamed from: a */
    public static final C24065a f56998a = new C24065a();

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    private C24065a() {
    }

    /* renamed from: a */
    public static C24065a m45575a() {
        return f56998a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    static {
        Covode.recordClassIndex(28192);
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
