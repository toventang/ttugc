package com.facebook.common.p1830b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.f */
public final class RunnableFutureC24071f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a */
    private final Handler f57009a;

    /* renamed from: b */
    private final FutureTask<V> f57010b;

    static {
        Covode.recordClassIndex(28198);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f57010b.get();
    }

    public final boolean isCancelled() {
        return this.f57010b.isCancelled();
    }

    public final boolean isDone() {
        return this.f57010b.isDone();
    }

    public final void run() {
        this.f57010b.run();
    }

    public final boolean cancel(boolean z) {
        return this.f57010b.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.f57010b.get(j, timeUnit);
    }

    public RunnableFutureC24071f(Handler handler, Callable<V> callable) {
        this.f57009a = handler;
        this.f57010b = new FutureTask<>(callable);
    }

    public RunnableFutureC24071f(Handler handler, Runnable runnable, V v) {
        this.f57009a = handler;
        this.f57010b = new FutureTask<>(runnable, v);
    }
}
