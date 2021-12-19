package com.bytedance.common.utility.p907b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.common.utility.b.d */
public final class C13595d extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final RejectedExecutionHandler f33066a = new ThreadPoolExecutor.AbortPolicy();

    public final void shutdown() {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    static {
        Covode.recordClassIndex(15620);
    }

    public C13595d(int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30, timeUnit, blockingQueue, threadFactory, f33066a);
    }

    public C13595d(int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, 30, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }
}
