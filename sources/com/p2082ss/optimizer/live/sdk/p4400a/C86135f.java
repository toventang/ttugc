package com.p2082ss.optimizer.live.sdk.p4400a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.optimizer.live.sdk.a.f */
public final class C86135f {

    /* renamed from: a */
    private final ThreadPoolExecutor f192078a = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC86136a((byte) 0));

    static {
        Covode.recordClassIndex(101276);
    }

    C86135f() {
    }

    /* renamed from: com.ss.optimizer.live.sdk.a.f$a */
    static class ThreadFactoryC86136a implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f192079a;

        /* renamed from: b */
        private final AtomicInteger f192080b;

        /* renamed from: c */
        private final String f192081c;

        static {
            Covode.recordClassIndex(101277);
        }

        private ThreadFactoryC86136a() {
            ThreadGroup threadGroup;
            this.f192080b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f192079a = threadGroup;
            this.f192081c = "live-sdk-";
        }

        /* synthetic */ ThreadFactoryC86136a(byte b) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(5615);
            Thread thread = new Thread(this.f192079a, runnable, this.f192081c + this.f192080b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.m26664o(5615);
            return thread;
        }
    }

    /* renamed from: a */
    public final void mo136409a(Runnable runnable) {
        MethodCollector.m26663i(6027);
        this.f192078a.execute(runnable);
        MethodCollector.m26664o(6027);
    }
}
