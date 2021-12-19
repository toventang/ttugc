package com.p2082ss.ttvideoengine.p4430s;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.ttvideoengine.s.b */
public class C86631b {

    /* renamed from: a */
    private static volatile ThreadPoolExecutor f195246a;

    /* renamed from: b */
    private static Deque<RunnableC86632a> f195247b = new ArrayDeque();

    /* renamed from: c */
    private static Deque<RunnableC86632a> f195248c = new ArrayDeque();

    /* renamed from: d */
    private static volatile boolean f195249d = true;

    /* renamed from: com.ss.ttvideoengine.s.b$a */
    public static class RunnableC86632a implements Runnable {

        /* renamed from: a */
        private Runnable f195250a;

        static {
            Covode.recordClassIndex(101860);
        }

        public final void run() {
            this.f195250a.run();
            C86631b.m150046a(this);
        }

        public RunnableC86632a(Runnable runnable) {
            this.f195250a = runnable;
        }
    }

    static {
        Covode.recordClassIndex(101859);
    }

    /* renamed from: a */
    private static ThreadPoolExecutor m150045a() {
        MethodCollector.m26663i(5889);
        if (f195246a == null) {
            synchronized (C86631b.class) {
                try {
                    if (f195246a == null) {
                        if (f195249d) {
                            C86641i.m150110a("EngineThreadPool", "mEnableThreadPoolOptimize true");
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
                            f195246a = threadPoolExecutor;
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } else {
                            f195246a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5889);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor2 = f195246a;
        MethodCollector.m26664o(5889);
        return threadPoolExecutor2;
    }

    /* renamed from: a */
    public static synchronized void m150046a(RunnableC86632a aVar) {
        synchronized (C86631b.class) {
            MethodCollector.m26663i(6184);
            f195248c.remove(aVar);
            if (f195247b.size() > 0) {
                Iterator<RunnableC86632a> it = f195247b.iterator();
                if (it.hasNext()) {
                    RunnableC86632a next = it.next();
                    it.remove();
                    f195248c.add(next);
                    f195246a.execute(next);
                }
            }
            MethodCollector.m26664o(6184);
        }
    }

    /* renamed from: a */
    public static synchronized Future m150044a(Runnable runnable) {
        synchronized (C86631b.class) {
            MethodCollector.m26663i(6031);
            if (f195246a == null) {
                m150045a();
            }
            try {
                StringBuilder sb = new StringBuilder("addExecuteTask,pool size:");
                if (f195246a == null) {
                    m150045a();
                }
                C86641i.m150110a("EngineThreadPool", sb.append(f195246a.getPoolSize()).append(", active:").append(f195246a.getActiveCount()).toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (f195249d) {
                Future<?> submit = f195246a.submit(runnable);
                MethodCollector.m26664o(6031);
                return submit;
            }
            C86641i.m150110a("EngineThreadPool", "running:" + f195248c.size() + ", ready:" + f195247b.size());
            RunnableC86632a aVar = new RunnableC86632a(runnable);
            if (f195248c.size() >= 5) {
                f195247b.add(aVar);
                MethodCollector.m26664o(6031);
                return null;
            }
            f195248c.add(aVar);
            Future<?> submit2 = f195246a.submit(aVar);
            MethodCollector.m26664o(6031);
            return submit2;
        }
    }
}
