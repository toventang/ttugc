package com.bytedance.geckox.policy.p1029c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.geckox.policy.c.a */
public final class ExecutorC14982a implements Executor {

    /* renamed from: a */
    private ExecutorService f36598a = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, this.f36599b.f36601a, new ThreadFactory() {
        /* class com.bytedance.geckox.policy.p1029c.ExecutorC14982a.ThreadFactoryC149831 */

        static {
            Covode.recordClassIndex(17120);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(4614);
            Thread thread = new Thread(runnable);
            thread.setName("gecko-update-thread");
            thread.setPriority(3);
            MethodCollector.m26664o(4614);
            return thread;
        }
    });

    /* renamed from: b */
    private C14984b f36599b = new C14984b();

    static {
        Covode.recordClassIndex(17119);
    }

    public final void execute(Runnable runnable) {
        this.f36598a.execute(runnable);
    }
}
