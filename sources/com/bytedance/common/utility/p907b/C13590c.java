package com.bytedance.common.utility.p907b;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.b.c */
public final class C13590c {

    /* renamed from: a */
    public static ExecutorService f33035a;

    /* renamed from: b */
    public static ExecutorService f33036b;

    /* renamed from: c */
    public static ScheduledExecutorService f33037c;

    /* renamed from: d */
    public static ExecutorService f33038d;

    /* renamed from: e */
    public static final int f33039e;

    /* renamed from: f */
    public static final int f33040f;

    /* renamed from: g */
    public static final int f33041g;

    /* renamed from: h */
    public static final int f33042h;

    /* renamed from: i */
    public static final int f33043i;

    /* renamed from: j */
    public static final int f33044j;

    /* renamed from: k */
    private static ExecutorService f33045k;

    /* renamed from: l */
    private static ExecutorService f33046l;

    /* renamed from: m */
    private static final ThreadFactoryC13594b f33047m;

    /* renamed from: n */
    private static final ThreadFactoryC13594b f33048n;

    /* renamed from: o */
    private static final ThreadFactoryC13594b f33049o;

    /* renamed from: p */
    private static final ThreadFactoryC13594b f33050p;

    /* renamed from: q */
    private static final ThreadFactoryC13594b f33051q;

    /* renamed from: r */
    private static final ThreadFactoryC13592a f33052r;

    /* renamed from: s */
    private static final BlockingQueue<Runnable> f33053s;

    /* renamed from: t */
    private static final BlockingQueue<Runnable> f33054t;

    /* renamed from: u */
    private static final BlockingQueue<Runnable> f33055u;

    /* renamed from: v */
    private static final RejectedExecutionHandler f33056v;

    /* renamed from: a */
    public static ExecutorService m24421a() {
        return f33035a;
    }

    /* renamed from: b */
    public static ExecutorService m24422b() {
        return f33036b;
    }

    /* renamed from: com.bytedance.common.utility.b.c$a */
    static class ThreadFactoryC13592a implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f33057a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f33058b;

        /* renamed from: c */
        private final AtomicInteger f33059c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f33060d;

        static {
            Covode.recordClassIndex(15617);
        }

        public final Thread newThread(Runnable runnable) {
            C135931 r3 = new Thread(this.f33058b, runnable, this.f33060d + this.f33059c.getAndIncrement()) {
                /* class com.bytedance.common.utility.p907b.C13590c.ThreadFactoryC13592a.C135931 */

                static {
                    Covode.recordClassIndex(15618);
                }

                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            if (r3.isDaemon()) {
                r3.setDaemon(false);
            }
            return r3;
        }

        ThreadFactoryC13592a(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f33058b = threadGroup;
            this.f33060d = str + "-" + f33057a.getAndIncrement() + "-Thread-";
        }
    }

    /* renamed from: com.bytedance.common.utility.b.c$b */
    static class ThreadFactoryC13594b implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f33062a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f33063b;

        /* renamed from: c */
        private final AtomicInteger f33064c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f33065d;

        static {
            Covode.recordClassIndex(15619);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(14244);
            Thread thread = new Thread(this.f33063b, runnable, this.f33065d + this.f33064c.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.m26664o(14244);
            return thread;
        }

        ThreadFactoryC13594b(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                this.f33063b = securityManager.getThreadGroup();
            } else {
                this.f33063b = Thread.currentThread().getThreadGroup();
            }
            this.f33065d = str + "-" + f33062a.getAndIncrement() + "-Thread-";
        }
    }

    static {
        Covode.recordClassIndex(15615);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f33039e = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f33040f = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f33041g = max;
        int i = (max * 2) + 1;
        f33042h = i;
        int max2 = Math.max(2, Math.min(availableProcessors - 1, 3));
        f33043i = max2;
        int i2 = (availableProcessors * 2) + 1;
        f33044j = i2;
        ThreadFactoryC13594b bVar = new ThreadFactoryC13594b("TTDefaultExecutors");
        f33047m = bVar;
        ThreadFactoryC13594b bVar2 = new ThreadFactoryC13594b("TTCpuExecutors");
        f33048n = bVar2;
        ThreadFactoryC13594b bVar3 = new ThreadFactoryC13594b("TTScheduledExecutors");
        f33049o = bVar3;
        ThreadFactoryC13594b bVar4 = new ThreadFactoryC13594b("TTDownLoadExecutors");
        f33050p = bVar4;
        ThreadFactoryC13594b bVar5 = new ThreadFactoryC13594b("TTSerialExecutors");
        f33051q = bVar5;
        ThreadFactoryC13592a aVar = new ThreadFactoryC13592a("TTBackgroundExecutors");
        f33052r = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f33053s = linkedBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        f33054t = linkedBlockingQueue2;
        LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        f33055u = linkedBlockingQueue3;
        RejectedExecutionHandlerC135911 r13 = new RejectedExecutionHandler() {
            /* class com.bytedance.common.utility.p907b.C13590c.RejectedExecutionHandlerC135911 */

            static {
                Covode.recordClassIndex(15616);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Executors.newCachedThreadPool().execute(runnable);
            }
        };
        f33056v = r13;
        C13595d dVar = new C13595d(max, i, TimeUnit.SECONDS, linkedBlockingQueue, bVar, r13);
        f33035a = dVar;
        dVar.allowCoreThreadTimeOut(true);
        C13595d dVar2 = new C13595d(max2, i2, TimeUnit.SECONDS, linkedBlockingQueue2, bVar2, r13);
        f33045k = dVar2;
        dVar2.allowCoreThreadTimeOut(true);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 3;
        a.f95509g = bVar3;
        f33037c = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
        C13595d dVar3 = new C13595d(2, 2, TimeUnit.SECONDS, linkedBlockingQueue3, bVar4, r13);
        f33036b = dVar3;
        dVar3.allowCoreThreadTimeOut(true);
        C13595d dVar4 = new C13595d(1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), bVar5);
        f33046l = dVar4;
        dVar4.allowCoreThreadTimeOut(true);
        C13595d dVar5 = new C13595d(0, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        f33038d = dVar5;
        dVar5.allowCoreThreadTimeOut(true);
    }
}
