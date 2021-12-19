package com.lynx.fresco;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.lynx.fresco.a */
class C28342a {

    /* renamed from: a */
    private static volatile Executor f66561a;

    static {
        Covode.recordClassIndex(34304);
    }

    C28342a() {
    }

    /* renamed from: a */
    public static Executor m56646a() {
        MethodCollector.m26663i(8536);
        if (f66561a == null) {
            synchronized (C28342a.class) {
                try {
                    if (f66561a == null) {
                        f66561a = m56647b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8536);
                    throw th;
                }
            }
        }
        Executor executor = f66561a;
        MethodCollector.m26664o(8536);
        return executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.util.concurrent.ThreadPoolExecutor */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static Executor m56647b() {
        ExecutorC283442 r2;
        MethodCollector.m26663i(8674);
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
                /* class com.lynx.fresco.C28342a.ThreadFactoryC283431 */

                static {
                    Covode.recordClassIndex(34305);
                }

                public final Thread newThread(Runnable runnable) {
                    MethodCollector.m26663i(8311);
                    Thread thread = new Thread(runnable, "lynx-fresco-dispatch-thread");
                    thread.setPriority(3);
                    MethodCollector.m26664o(8311);
                    return thread;
                }
            }, new ThreadPoolExecutor.AbortPolicy());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            r2 = threadPoolExecutor;
        } catch (Throwable unused) {
            r2 = new Executor() {
                /* class com.lynx.fresco.C28342a.ExecutorC283442 */

                static {
                    Covode.recordClassIndex(34306);
                }

                public final void execute(Runnable runnable) {
                    if ("can not execute: ".concat(String.valueOf(runnable)) != null) {
                        runnable.getClass().getName();
                    }
                }
            };
        }
        MethodCollector.m26664o(8674);
        return r2;
    }
}
