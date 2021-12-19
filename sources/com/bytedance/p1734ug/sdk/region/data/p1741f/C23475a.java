package com.bytedance.p1734ug.sdk.region.data.p1741f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ug.sdk.region.data.f.a */
public final class C23475a {

    /* renamed from: a */
    public static final int f55659a;

    /* renamed from: b */
    public static final int f55660b;

    /* renamed from: c */
    public static final int f55661c;

    /* renamed from: d */
    public static final int f55662d;

    /* renamed from: e */
    private static ExecutorService f55663e;

    /* renamed from: f */
    private static final BlockingQueue<Runnable> f55664f;

    /* renamed from: g */
    private static final ThreadFactoryC23477a f55665g;

    /* renamed from: h */
    private static final RejectedExecutionHandler f55666h;

    /* renamed from: com.bytedance.ug.sdk.region.data.f.a$a */
    static class ThreadFactoryC23477a implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f55667a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f55668b;

        /* renamed from: c */
        private final AtomicInteger f55669c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f55670d;

        static {
            Covode.recordClassIndex(27478);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(10459);
            Thread thread = new Thread(this.f55668b, runnable, this.f55670d + this.f55669c.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.m26664o(10459);
            return thread;
        }

        ThreadFactoryC23477a(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f55668b = threadGroup;
            this.f55670d = str + "-" + f55667a.getAndIncrement() + "-Thread-";
        }
    }

    static {
        MethodCollector.m26663i(10456);
        Covode.recordClassIndex(27476);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f55659a = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f55660b = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f55661c = max;
        int i = (max * 2) + 1;
        f55662d = i;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f55664f = linkedBlockingQueue;
        ThreadFactoryC23477a aVar = new ThreadFactoryC23477a("TTDefaultExecutors");
        f55665g = aVar;
        RejectedExecutionHandlerC234761 r12 = new RejectedExecutionHandler() {
            /* class com.bytedance.p1734ug.sdk.region.data.p1741f.C23475a.RejectedExecutionHandlerC234761 */

            static {
                Covode.recordClassIndex(27477);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Executors.newCachedThreadPool().execute(runnable);
            }
        };
        f55666h = r12;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i, 30, TimeUnit.SECONDS, linkedBlockingQueue, aVar, r12);
        f55663e = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        MethodCollector.m26664o(10456);
    }

    /* renamed from: a */
    public static void m44167a(Runnable runnable) {
        if (runnable != null) {
            f55663e.submit(runnable);
        }
    }
}
