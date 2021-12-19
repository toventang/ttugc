package com.bytedance.common.utility.p907b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.b.b */
public final class ThreadFactoryC13589b implements ThreadFactory {

    /* renamed from: a */
    private String f33032a;

    /* renamed from: b */
    private AtomicInteger f33033b = new AtomicInteger();

    /* renamed from: c */
    private boolean f33034c;

    static {
        Covode.recordClassIndex(15614);
    }

    public ThreadFactoryC13589b(String str) {
        this.f33032a = str;
        this.f33034c = true;
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.m26663i(12670);
        Thread thread = new Thread(runnable, this.f33032a + "-" + this.f33033b.incrementAndGet());
        if (!this.f33034c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        MethodCollector.m26664o(12670);
        return thread;
    }
}
