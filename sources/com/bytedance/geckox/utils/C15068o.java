package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.policy.p1029c.ExecutorC14982a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.geckox.utils.o */
public class C15068o {

    /* renamed from: c */
    private static C15068o f36787c;

    /* renamed from: a */
    public ExecutorC14982a f36788a;

    /* renamed from: b */
    private Executor f36789b;

    static {
        Covode.recordClassIndex(17236);
    }

    private C15068o() {
    }

    /* renamed from: b */
    public final Executor mo24343b() {
        if (this.f36789b == null) {
            this.f36789b = m27746a(new ThreadFactory() {
                /* class com.bytedance.geckox.utils.C15068o.ThreadFactoryC150691 */

                static {
                    Covode.recordClassIndex(17237);
                }

                public final Thread newThread(Runnable runnable) {
                    MethodCollector.m26663i(3388);
                    Thread thread = new Thread(runnable);
                    thread.setName("gecko-check-update-thread");
                    thread.setPriority(3);
                    MethodCollector.m26664o(3388);
                    return thread;
                }
            });
        }
        return this.f36789b;
    }

    /* renamed from: a */
    public static C15068o m27745a() {
        MethodCollector.m26663i(3380);
        if (f36787c == null) {
            synchronized (C15068o.class) {
                try {
                    if (f36787c == null) {
                        f36787c = new C15068o();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3380);
                    throw th;
                }
            }
        }
        C15068o oVar = f36787c;
        MethodCollector.m26664o(3380);
        return oVar;
    }

    /* renamed from: a */
    public static ExecutorService m27746a(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }
}
