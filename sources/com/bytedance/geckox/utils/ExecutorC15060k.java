package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.geckox.utils.k */
public class ExecutorC15060k implements Executor {

    /* renamed from: a */
    private static volatile ExecutorC15060k f36782a;

    /* renamed from: b */
    private Executor f36783b;

    static {
        Covode.recordClassIndex(17228);
    }

    private ExecutorC15060k() {
        ThreadFactoryC150611 r2 = new ThreadFactory() {
            /* class com.bytedance.geckox.utils.ExecutorC15060k.ThreadFactoryC150611 */

            static {
                Covode.recordClassIndex(17229);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("gecko-piecemeal-thread");
                return thread;
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        this.f36783b = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static ExecutorC15060k m27731a() {
        MethodCollector.m26663i(5020);
        if (f36782a == null) {
            synchronized (ExecutorC15060k.class) {
                try {
                    if (f36782a == null) {
                        f36782a = new ExecutorC15060k();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5020);
                    throw th;
                }
            }
        }
        ExecutorC15060k kVar = f36782a;
        MethodCollector.m26664o(5020);
        return kVar;
    }

    public void execute(Runnable runnable) {
        this.f36783b.execute(runnable);
    }
}
