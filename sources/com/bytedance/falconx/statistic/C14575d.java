package com.bytedance.falconx.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.C14568d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.falconx.statistic.d */
public class C14575d {

    /* renamed from: c */
    private static volatile C14575d f35240c;

    /* renamed from: a */
    public Executor f35241a;

    /* renamed from: b */
    public C14568d f35242b;

    static {
        Covode.recordClassIndex(16665);
    }

    private C14575d() {
        ThreadFactoryC145761 r2 = new ThreadFactory() {
            /* class com.bytedance.falconx.statistic.C14575d.ThreadFactoryC145761 */

            static {
                Covode.recordClassIndex(16666);
            }

            public final Thread newThread(Runnable runnable) {
                MethodCollector.m26663i(2107);
                Thread thread = new Thread(runnable);
                thread.setName("falconx-io-thread");
                thread.setPriority(3);
                MethodCollector.m26664o(2107);
                return thread;
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        this.f35241a = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static C14575d m26653a() {
        MethodCollector.m26663i(4454);
        if (f35240c == null) {
            synchronized (C14575d.class) {
                try {
                    if (f35240c == null) {
                        f35240c = new C14575d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4454);
                    throw th;
                }
            }
        }
        C14575d dVar = f35240c;
        MethodCollector.m26664o(4454);
        return dVar;
    }
}
