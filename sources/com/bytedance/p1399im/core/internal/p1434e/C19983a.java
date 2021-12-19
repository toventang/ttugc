package com.bytedance.p1399im.core.internal.p1434e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.im.core.internal.e.a */
public final class C19983a {

    /* renamed from: a */
    public static volatile ExecutorService f47500a;

    /* renamed from: b */
    public static volatile ExecutorService f47501b;

    /* renamed from: c */
    public static volatile ExecutorService f47502c;

    /* renamed from: d */
    public static volatile ExecutorService f47503d;

    /* renamed from: e */
    public static boolean f47504e;

    /* renamed from: f */
    private static final Object f47505f = new Object();

    /* renamed from: g */
    private static final Object f47506g = new Object();

    /* renamed from: h */
    private static final Object f47507h = new Object();

    /* renamed from: i */
    private static final Object f47508i = new Object();

    /* renamed from: j */
    private static ThreadFactory f47509j = new ThreadFactory() {
        /* class com.bytedance.p1399im.core.internal.p1434e.C19983a.ThreadFactoryC199841 */

        static {
            Covode.recordClassIndex(22828);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(8511);
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            MethodCollector.m26664o(8511);
            return thread;
        }
    };

    static {
        Covode.recordClassIndex(22827);
    }

    /* renamed from: b */
    public static Executor m37720b() {
        MethodCollector.m26663i(8661);
        if (f47500a == null) {
            synchronized (f47505f) {
                try {
                    if (f47500a == null) {
                        f47500a = m37719a(f47509j);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8661);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f47500a;
        MethodCollector.m26664o(8661);
        return executorService;
    }

    /* renamed from: c */
    public static Executor m37721c() {
        MethodCollector.m26663i(8816);
        if (C19483d.m36365a().mo31141b().f46242ag) {
            Executor b = m37720b();
            MethodCollector.m26664o(8816);
            return b;
        }
        if (f47501b == null) {
            synchronized (f47506g) {
                try {
                    if (f47501b == null) {
                        f47501b = m37719a(f47509j);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8816);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f47501b;
        MethodCollector.m26664o(8816);
        return executorService;
    }

    /* renamed from: d */
    public static Executor m37722d() {
        MethodCollector.m26663i(8817);
        if (f47503d == null) {
            synchronized (f47508i) {
                try {
                    if (f47503d == null) {
                        f47503d = m37719a(f47509j);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8817);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f47503d;
        MethodCollector.m26664o(8817);
        return executorService;
    }

    /* renamed from: a */
    public static synchronized Executor m37717a() {
        ExecutorService executorService;
        synchronized (C19983a.class) {
            MethodCollector.m26663i(8518);
            int i = 4;
            if (f47502c == null) {
                ExecutorService executorService2 = C19483d.m36365a().mo31141b().f46203L;
                if (executorService2 != null) {
                    f47502c = executorService2;
                    f47504e = true;
                } else {
                    synchronized (f47507h) {
                        try {
                            if (f47502c == null || f47502c.isShutdown()) {
                                int availableProcessors = Runtime.getRuntime().availableProcessors();
                                if (availableProcessors <= 1) {
                                    availableProcessors = 4;
                                }
                                f47502c = m37718a(availableProcessors, f47509j);
                                f47504e = false;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(8518);
                            throw th;
                        }
                    }
                }
            }
            if (f47502c.isShutdown()) {
                int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                if (availableProcessors2 > 1) {
                    i = availableProcessors2;
                }
                f47502c = m37718a(i, f47509j);
                f47504e = false;
            }
            executorService = f47502c;
            MethodCollector.m26664o(8518);
        }
        return executorService;
    }

    /* renamed from: a */
    public static String m37716a(Executor executor) {
        if (executor == null) {
            return "unknown";
        }
        if (executor == f47502c) {
            return "default";
        }
        if (executor == f47501b) {
            return "receive";
        }
        if (executor == f47500a) {
            return "send";
        }
        if (executor == f47503d) {
            return "common";
        }
        return "unknown";
    }

    /* renamed from: a */
    private static ExecutorService m37719a(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    private static ExecutorService m37718a(int i, ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = i;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }
}
