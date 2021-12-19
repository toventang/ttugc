package com.facebook.imagepipeline.p1880e;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.imagepipeline.e.l */
public final class ThreadFactoryC24429l implements ThreadFactory {

    /* renamed from: a */
    public final int f58006a = 10;

    /* renamed from: b */
    private final String f58007b;

    /* renamed from: c */
    private final boolean f58008c;

    /* renamed from: d */
    private final AtomicInteger f58009d = new AtomicInteger(1);

    static {
        Covode.recordClassIndex(28572);
    }

    public ThreadFactoryC24429l(String str) {
        this.f58007b = str;
        this.f58008c = true;
    }

    public final Thread newThread(final Runnable runnable) {
        String str;
        RunnableC244301 r2 = new Runnable() {
            /* class com.facebook.imagepipeline.p1880e.ThreadFactoryC24429l.RunnableC244301 */

            static {
                Covode.recordClassIndex(28573);
            }

            public final void run() {
                try {
                    Process.setThreadPriority(ThreadFactoryC24429l.this.f58006a);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        };
        if (this.f58008c) {
            str = this.f58007b + "-" + this.f58009d.getAndIncrement();
        } else {
            str = this.f58007b;
        }
        return new Thread(r2, str);
    }
}
