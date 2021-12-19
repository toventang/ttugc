package com.lynx.tasm.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.lynx.tasm.core.a */
public final class C28745a {

    /* renamed from: a */
    private static volatile Executor f67790a;

    /* renamed from: b */
    private static volatile ExecutorService f67791b;

    static {
        Covode.recordClassIndex(34844);
    }

    private C28745a() {
    }

    /* renamed from: a */
    public static Executor m57564a() {
        MethodCollector.m26663i(242);
        if (f67790a == null) {
            synchronized (C28745a.class) {
                try {
                    if (f67790a == null) {
                        f67790a = m57565a("lynx-brief-io-thread", 3);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(242);
                    throw th;
                }
            }
        }
        Executor executor = f67790a;
        MethodCollector.m26664o(242);
        return executor;
    }

    /* renamed from: b */
    public static ExecutorService m57566b() {
        MethodCollector.m26663i(244);
        if (f67791b == null) {
            synchronized (C28745a.class) {
                try {
                    if (f67791b == null) {
                        f67791b = m57565a("lynx-view-op-thread", 10);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(244);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f67791b;
        MethodCollector.m26664o(244);
        return executorService;
    }

    /* renamed from: a */
    private static ExecutorService m57565a(final String str, final int i) {
        try {
            ThreadFactoryC287461 r2 = new ThreadFactory() {
                /* class com.lynx.tasm.core.C28745a.ThreadFactoryC287461 */

                static {
                    Covode.recordClassIndex(34845);
                }

                public final Thread newThread(Runnable runnable) {
                    MethodCollector.m26663i(238);
                    Thread thread = new Thread(runnable, str);
                    if (thread.isDaemon()) {
                        thread.setDaemon(false);
                    }
                    thread.setPriority(i);
                    MethodCollector.m26664o(238);
                    return thread;
                }
            };
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = 2;
            a.f95509g = r2;
            return C40780g.m82242a(a.mo70028a());
        } catch (Throwable unused) {
            f67790a = new Executor() {
                /* class com.lynx.tasm.core.C28745a.ExecutorC287472 */

                static {
                    Covode.recordClassIndex(34846);
                }

                public final void execute(Runnable runnable) {
                }
            };
            return null;
        }
    }
}
