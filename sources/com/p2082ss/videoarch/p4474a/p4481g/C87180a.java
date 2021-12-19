package com.p2082ss.videoarch.p4474a.p4481g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.videoarch.a.g.a */
public class C87180a {

    /* renamed from: a */
    private static volatile ThreadPoolExecutor f197411a;

    /* renamed from: b */
    private static Deque<RunnableC87181a> f197412b = new ArrayDeque();

    /* renamed from: c */
    private static Deque<RunnableC87181a> f197413c = new ArrayDeque();

    /* renamed from: com.ss.videoarch.a.g.a$a */
    public static class RunnableC87181a implements Runnable {

        /* renamed from: a */
        private Runnable f197414a;

        static {
            Covode.recordClassIndex(102982);
        }

        public final void run() {
            this.f197414a.run();
            C87180a.m151210a(this);
        }

        public RunnableC87181a(Runnable runnable) {
            this.f197414a = runnable;
        }
    }

    static {
        Covode.recordClassIndex(102981);
    }

    /* renamed from: a */
    private static ThreadPoolExecutor m151209a() {
        MethodCollector.m26663i(5361);
        if (f197411a == null) {
            synchronized (C87180a.class) {
                try {
                    if (f197411a == null) {
                        f197411a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5361);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = f197411a;
        MethodCollector.m26664o(5361);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    public static synchronized Future m151208a(Runnable runnable) {
        synchronized (C87180a.class) {
            MethodCollector.m26663i(5474);
            if (f197411a == null) {
                m151209a();
            }
            if (f197411a == null) {
                m151209a();
            }
            f197411a.getPoolSize();
            RunnableC87181a aVar = new RunnableC87181a(runnable);
            if (f197413c.size() >= 5) {
                f197412b.add(aVar);
                MethodCollector.m26664o(5474);
                return null;
            }
            f197413c.add(aVar);
            Future<?> submit = f197411a.submit(aVar);
            MethodCollector.m26664o(5474);
            return submit;
        }
    }

    /* renamed from: a */
    public static synchronized void m151210a(RunnableC87181a aVar) {
        synchronized (C87180a.class) {
            MethodCollector.m26663i(5475);
            f197413c.remove(aVar);
            if (f197412b.size() > 0) {
                Iterator<RunnableC87181a> it = f197412b.iterator();
                if (it.hasNext()) {
                    RunnableC87181a next = it.next();
                    it.remove();
                    f197413c.add(next);
                    f197411a.execute(next);
                }
            }
            MethodCollector.m26664o(5475);
        }
    }
}
