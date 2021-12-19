package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.ttm.player.b */
public final class C86239b {

    /* renamed from: a */
    private static volatile ExecutorService f192643a;

    /* renamed from: b */
    private static ThreadPoolExecutor f192644b;

    static {
        Covode.recordClassIndex(101416);
    }

    /* renamed from: a */
    private static synchronized ExecutorService m148295a() {
        ExecutorService executorService;
        synchronized (C86239b.class) {
            MethodCollector.m26663i(9376);
            if (f192643a != null) {
                executorService = f192643a;
            } else {
                if (f192644b == null) {
                    f192644b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                }
                executorService = f192644b;
            }
            MethodCollector.m26664o(9376);
        }
        return executorService;
    }

    /* renamed from: a */
    public static synchronized Future<String> m148296a(Callable<String> callable) {
        Future<String> submit;
        synchronized (C86239b.class) {
            MethodCollector.m26663i(9518);
            submit = m148295a().submit(callable);
            MethodCollector.m26664o(9518);
        }
        return submit;
    }

    /* renamed from: a */
    public static synchronized void m148297a(Runnable runnable) {
        synchronized (C86239b.class) {
            MethodCollector.m26663i(9517);
            m148295a().submit(runnable);
            MethodCollector.m26664o(9517);
        }
    }

    /* renamed from: a */
    public static synchronized void m148298a(ExecutorService executorService) {
        synchronized (C86239b.class) {
            MethodCollector.m26663i(9225);
            f192643a = executorService;
            MethodCollector.m26664o(9225);
        }
    }
}
