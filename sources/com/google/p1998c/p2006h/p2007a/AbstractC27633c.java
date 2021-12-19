package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.c.h.a.c */
public abstract class AbstractC27633c extends AbstractExecutorService implements AbstractExecutorServiceC27657s {
    static {
        Covode.recordClassIndex(33213);
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractExecutorServiceC27657s
    /* renamed from: a */
    public final <T> AbstractFutureC27655q<T> submit(Callable<T> callable) {
        return (AbstractFutureC27655q) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return RunnableFutureC27668w.m55312a((Callable) callable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return RunnableFutureC27668w.m55311a(runnable, (Object) t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }
}
