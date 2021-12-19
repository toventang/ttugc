package com.bytedance.jedi.arch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.internal.a */
public final class ThreadFactoryC20481a implements ThreadFactory {

    /* renamed from: a */
    public static final C20482a f48472a = new C20482a((byte) 0);

    /* renamed from: e */
    private static final AtomicInteger f48473e = new AtomicInteger(1);

    /* renamed from: b */
    private final ThreadGroup f48474b;

    /* renamed from: c */
    private final AtomicInteger f48475c = new AtomicInteger(1);

    /* renamed from: d */
    private final String f48476d;

    /* renamed from: com.bytedance.jedi.arch.internal.a$a */
    public static final class C20482a {
        static {
            Covode.recordClassIndex(24005);
        }

        private C20482a() {
        }

        public /* synthetic */ C20482a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(24004);
    }

    public ThreadFactoryC20481a() {
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
        this.f48474b = threadGroup;
        this.f48476d = "pool-jedi-core-" + f48473e.getAndIncrement() + "-thread-";
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.m26663i(9651);
        C89219l.m154719c(runnable, "");
        Thread thread = new Thread(this.f48474b, runnable, this.f48476d + this.f48475c.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        MethodCollector.m26664o(9651);
        return thread;
    }
}
