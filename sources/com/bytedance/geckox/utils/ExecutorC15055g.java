package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.geckox.utils.g */
public class ExecutorC15055g implements Executor {

    /* renamed from: a */
    private static volatile ExecutorC15055g f36777a;

    /* renamed from: b */
    private Executor f36778b;

    static {
        Covode.recordClassIndex(17223);
    }

    private ExecutorC15055g() {
        ThreadFactoryC150561 r2 = new ThreadFactory() {
            /* class com.bytedance.geckox.utils.ExecutorC15055g.ThreadFactoryC150561 */

            static {
                Covode.recordClassIndex(17224);
            }

            public final Thread newThread(Runnable runnable) {
                MethodCollector.m26663i(3553);
                Thread thread = new Thread(runnable);
                thread.setName("gecko-io-thread");
                thread.setPriority(3);
                MethodCollector.m26664o(3553);
                return thread;
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        this.f36778b = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static ExecutorC15055g m27720a() {
        MethodCollector.m26663i(5042);
        if (f36777a == null) {
            synchronized (ExecutorC15055g.class) {
                try {
                    if (f36777a == null) {
                        f36777a = new ExecutorC15055g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5042);
                    throw th;
                }
            }
        }
        ExecutorC15055g gVar = f36777a;
        MethodCollector.m26664o(5042);
        return gVar;
    }

    public void execute(Runnable runnable) {
        this.f36778b.execute(runnable);
    }
}
