package com.p2082ss.videoarch.strategy.p4484b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.videoarch.strategy.b.f */
public final class C87213f {

    /* renamed from: a */
    private final ThreadPoolExecutor f197489a = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC87214a((byte) 0));

    static {
        Covode.recordClassIndex(103016);
    }

    C87213f() {
    }

    /* renamed from: com.ss.videoarch.strategy.b.f$a */
    static class ThreadFactoryC87214a implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f197490a;

        /* renamed from: b */
        private final AtomicInteger f197491b;

        /* renamed from: c */
        private final String f197492c;

        static {
            Covode.recordClassIndex(103017);
        }

        private ThreadFactoryC87214a() {
            ThreadGroup threadGroup;
            this.f197491b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f197490a = threadGroup;
            this.f197492c = "live-strategy-network-";
        }

        /* synthetic */ ThreadFactoryC87214a(byte b) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(11122);
            Thread thread = new Thread(this.f197490a, runnable, this.f197492c + this.f197491b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.m26664o(11122);
            return thread;
        }
    }

    /* renamed from: a */
    public final void mo141080a(Runnable runnable) {
        MethodCollector.m26663i(9839);
        this.f197489a.execute(runnable);
        MethodCollector.m26664o(9839);
    }
}
