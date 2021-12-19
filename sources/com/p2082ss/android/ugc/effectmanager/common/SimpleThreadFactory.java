package com.p2082ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.effectmanager.common.SimpleThreadFactory */
public class SimpleThreadFactory implements ThreadFactory {
    private boolean ignoreStatusCheck;
    private String threadName;
    private AtomicInteger threadSeq;

    static {
        Covode.recordClassIndex(95432);
    }

    public SimpleThreadFactory(String str) {
        this(str, false);
    }

    public Thread newThread(Runnable runnable) {
        MethodCollector.m26663i(4775);
        Thread thread = new Thread(runnable, this.threadName + "-" + this.threadSeq.incrementAndGet());
        if (!this.ignoreStatusCheck) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        MethodCollector.m26664o(4775);
        return thread;
    }

    public SimpleThreadFactory(String str, boolean z) {
        this.threadSeq = new AtomicInteger();
        this.threadName = str;
        this.ignoreStatusCheck = z;
    }
}
