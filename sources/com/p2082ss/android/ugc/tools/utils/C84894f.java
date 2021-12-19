package com.p2082ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.f */
public final class C84894f extends ThreadPoolExecutor {
    static {
        Covode.recordClassIndex(98888);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        Callable<T> callable2;
        C89219l.m154721d(callable, "");
        if (!(callable instanceof Comparable)) {
            callable2 = null;
        } else {
            callable2 = callable;
        }
        return new C84893e(callable, (Comparable) callable2);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        Runnable runnable2;
        C89219l.m154721d(runnable, "");
        if (!(runnable instanceof Comparable)) {
            runnable2 = null;
        } else {
            runnable2 = runnable;
        }
        return new C84893e(runnable, t, (Comparable) runnable2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84894f(int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, 8000, timeUnit, blockingQueue);
        C89219l.m154721d(timeUnit, "");
        C89219l.m154721d(blockingQueue, "");
    }
}
