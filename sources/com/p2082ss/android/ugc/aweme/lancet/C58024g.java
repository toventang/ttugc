package com.p2082ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.lancet.g */
public final class C58024g {

    /* renamed from: a */
    public static final Executor f132236a;

    /* renamed from: b */
    public static AtomicBoolean f132237b = new AtomicBoolean();

    /* renamed from: c */
    private static final int f132238c;

    /* renamed from: d */
    private static final int f132239d;

    /* renamed from: e */
    private static final int f132240e;

    /* renamed from: f */
    private static final ThreadFactory f132241f;

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f132242g;

    static {
        MethodCollector.m26663i(12826);
        Covode.recordClassIndex(68059);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f132238c = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        f132239d = max;
        int i = (max * 2) + 1;
        f132240e = i;
        ThreadFactoryC580251 r11 = new ThreadFactory() {
            /* class com.p2082ss.android.ugc.aweme.lancet.C58024g.ThreadFactoryC580251 */

            /* renamed from: a */
            private final AtomicInteger f132243a = new AtomicInteger(1);

            /* renamed from: b */
            private Thread.UncaughtExceptionHandler f132244b = C58026h.f132245a;

            static {
                Covode.recordClassIndex(68060);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Facebook-SDK #" + this.f132243a.getAndIncrement());
                thread.setUncaughtExceptionHandler(this.f132244b);
                return thread;
            }
        };
        f132241f = r11;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f132242g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i, 10, TimeUnit.SECONDS, linkedBlockingQueue, r11);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f132236a = threadPoolExecutor;
        MethodCollector.m26664o(12826);
    }
}
