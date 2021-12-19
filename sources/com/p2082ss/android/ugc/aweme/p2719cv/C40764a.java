package com.p2082ss.android.ugc.aweme.p2719cv;

import android.os.Build;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.cv.a */
public class C40764a extends ThreadPoolExecutor {

    /* renamed from: b */
    private static volatile Field f95427b;

    /* renamed from: a */
    public EnumC40793o f95428a;

    static {
        Covode.recordClassIndex(48616);
    }

    public void shutdown() {
        MethodCollector.m26663i(5874);
        if (C40780g.m82244a(this)) {
            MethodCollector.m26664o(5874);
            return;
        }
        super.shutdown();
        MethodCollector.m26664o(5874);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        MethodCollector.m26663i(6018);
        if (C40780g.m82244a(this)) {
            List<Runnable> emptyList = Collections.emptyList();
            MethodCollector.m26664o(6018);
            return emptyList;
        }
        List<Runnable> shutdownNow = super.shutdownNow();
        MethodCollector.m26664o(6018);
        return shutdownNow;
    }

    /* renamed from: a */
    private static void m82224a() {
        MethodCollector.m26663i(6329);
        try {
            if (f95427b == null) {
                synchronized (C40764a.class) {
                    try {
                        if (f95427b == null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                f95427b = Thread.class.getDeclaredField("threadLocals");
                            } else {
                                f95427b = Thread.class.getDeclaredField("localValues");
                            }
                            f95427b.setAccessible(true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(6329);
                        throw th;
                    }
                }
            }
            f95427b.set(Thread.currentThread(), null);
            MethodCollector.m26664o(6329);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(6329);
        }
    }

    public void execute(Runnable runnable) {
        MethodCollector.m26663i(5872);
        if (C40780g.f95475a.f95483b.contains(this.f95428a)) {
            super.execute(new RunnableC40765b(runnable, this));
            MethodCollector.m26664o(5872);
            return;
        }
        super.execute(runnable);
        MethodCollector.m26664o(5872);
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        try {
            if (Looper.myLooper() != null) {
                m82224a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    C40764a(EnumC40793o oVar, int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30, timeUnit, blockingQueue, threadFactory);
        this.f95428a = oVar;
    }

    C40764a(EnumC40793o oVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f95428a = oVar;
    }
}
