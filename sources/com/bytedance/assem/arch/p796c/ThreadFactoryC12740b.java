package com.bytedance.assem.arch.p796c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.c.b */
public final class ThreadFactoryC12740b implements ThreadFactory {

    /* renamed from: a */
    public static final C12741a f30967a = new C12741a((byte) 0);

    /* renamed from: e */
    private static final AtomicInteger f30968e = new AtomicInteger(1);

    /* renamed from: b */
    private final ThreadGroup f30969b;

    /* renamed from: c */
    private final AtomicInteger f30970c = new AtomicInteger(1);

    /* renamed from: d */
    private final String f30971d;

    /* renamed from: com.bytedance.assem.arch.c.b$a */
    public static final class C12741a {
        static {
            Covode.recordClassIndex(14561);
        }

        private C12741a() {
        }

        public /* synthetic */ C12741a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(14560);
    }

    public ThreadFactoryC12740b() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            Thread currentThread = Thread.currentThread();
            C89219l.m154709a((Object) currentThread, "");
            threadGroup = currentThread.getThreadGroup();
        }
        C89219l.m154709a((Object) threadGroup, "");
        this.f30969b = threadGroup;
        this.f30971d = "pool-assem-core-" + f30968e.getAndIncrement() + "-thread-";
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.m26663i(2578);
        C89219l.m154719c(runnable, "");
        Thread thread = new Thread(this.f30969b, runnable, this.f30971d + this.f30970c.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        MethodCollector.m26664o(2578);
        return thread;
    }
}
