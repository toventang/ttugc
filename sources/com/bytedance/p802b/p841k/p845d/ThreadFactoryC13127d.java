package com.bytedance.p802b.p841k.p845d;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.b.k.d.d */
public final class ThreadFactoryC13127d implements ThreadFactory {

    /* renamed from: a */
    public final String f31972a;

    static {
        Covode.recordClassIndex(14963);
    }

    public ThreadFactoryC13127d(String str) {
        this.f31972a = "APM6-".concat(String.valueOf(str));
    }

    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() {
            /* class com.bytedance.p802b.p841k.p845d.ThreadFactoryC13127d.RunnableC131281 */

            static {
                Covode.recordClassIndex(14964);
            }

            public final void run() {
                Process.setThreadPriority(10);
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C13118b.m23587a("APM-AsyncTask", "SingleThreadFactory error when running in thread " + ThreadFactoryC13127d.this.f31972a, th);
                }
            }
        }, this.f31972a);
    }
}
