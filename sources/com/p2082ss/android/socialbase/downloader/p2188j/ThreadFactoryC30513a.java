package com.p2082ss.android.socialbase.downloader.p2188j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.j.a */
public final class ThreadFactoryC30513a implements ThreadFactory {

    /* renamed from: a */
    private final String f72758a;

    /* renamed from: b */
    private final AtomicInteger f72759b;

    /* renamed from: c */
    private final boolean f72760c;

    static {
        Covode.recordClassIndex(37041);
    }

    public ThreadFactoryC30513a(String str) {
        this(str, false);
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.m26663i(8402);
        Thread thread = new Thread(runnable, this.f72758a + "-" + this.f72759b.incrementAndGet());
        if (!this.f72760c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        MethodCollector.m26664o(8402);
        return thread;
    }

    public ThreadFactoryC30513a(String str, boolean z) {
        this.f72759b = new AtomicInteger();
        this.f72758a = str;
        this.f72760c = z;
    }
}
