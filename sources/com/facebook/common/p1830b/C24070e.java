package com.facebook.common.p1830b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.e */
public class C24070e extends AbstractExecutorService implements AbstractScheduledExecutorServiceC24069d {

    /* renamed from: a */
    private final Handler f57008a;

    static {
        Covode.recordClassIndex(28197);
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo39612a() {
        if (Thread.currentThread() == this.f57008a.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public C24070e(Handler handler) {
        this.f57008a = handler;
    }

    public void execute(Runnable runnable) {
        this.f57008a.post(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable) {
        return submit(runnable, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> RunnableFutureC24071f<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC24071f<>(this.f57008a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Callable callable) {
        Objects.requireNonNull(callable);
        RunnableFutureC24071f a = newTaskFor(callable);
        execute(a);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> RunnableFutureC24071f<T> newTaskFor(Runnable runnable, T t) {
        return new RunnableFutureC24071f<>(this.f57008a, runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        Objects.requireNonNull(runnable);
        RunnableFutureC24071f<T> a = newTaskFor(runnable, t);
        execute(a);
        return a;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC24071f a = newTaskFor(runnable, null);
        this.f57008a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        RunnableFutureC24071f a = newTaskFor(callable);
        this.f57008a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
