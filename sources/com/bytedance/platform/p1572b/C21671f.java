package com.bytedance.platform.p1572b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.platform.b.f */
public class C21671f {

    /* renamed from: a */
    public static final RejectedExecutionHandler f51430a = new RejectedExecutionHandler() {
        /* class com.bytedance.platform.p1572b.C21671f.RejectedExecutionHandlerC216721 */

        static {
            Covode.recordClassIndex(25313);
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MethodCollector.m26663i(10228);
            if (C21671f.f51432c != null) {
                ((AbstractC21667c) threadPoolExecutor).mo35329a();
            }
            C21671f.f51431b.execute(runnable);
            MethodCollector.m26664o(10228);
        }
    };

    /* renamed from: b */
    public static volatile ThreadPoolExecutor f51431b;

    /* renamed from: c */
    public static AbstractC21675b f51432c;

    /* renamed from: d */
    public static AbstractC21676g f51433d;

    /* renamed from: e */
    private static final int f51434e;

    /* renamed from: f */
    private static final int f51435f;

    /* renamed from: g */
    private static C21661a f51436g;

    /* renamed from: h */
    private static AbstractC21676g f51437h = new AbstractC21676g() {
        /* class com.bytedance.platform.p1572b.C21671f.C216732 */

        static {
            Covode.recordClassIndex(25314);
        }

        @Override // com.bytedance.platform.p1572b.AbstractC21676g
        /* renamed from: a */
        public final void mo35335a(Throwable th) {
            if (C21671f.f51433d != null) {
                C21671f.f51433d.mo35335a(th);
            }
        }
    };

    /* renamed from: i */
    private static volatile ThreadPoolExecutor f51438i;

    /* renamed from: com.bytedance.platform.b.f$a */
    public static class C21674a {

        /* renamed from: a */
        public int f51439a;

        /* renamed from: b */
        public int f51440b;

        /* renamed from: c */
        public long f51441c;

        /* renamed from: d */
        public TimeUnit f51442d;

        static {
            Covode.recordClassIndex(25315);
        }
    }

    /* renamed from: com.bytedance.platform.b.f$b */
    public interface AbstractC21675b {
        static {
            Covode.recordClassIndex(25316);
        }
    }

    private C21671f() {
    }

    static {
        Covode.recordClassIndex(25312);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f51434e = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f51435f = availableProcessors;
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m40615a() {
        MethodCollector.m26663i(9253);
        if (f51438i == null) {
            synchronized (C21671f.class) {
                try {
                    if (f51438i == null) {
                        C21661a aVar = f51436g;
                        if (aVar == null || aVar.f51409a == null) {
                            f51438i = new C21670e(0, 128, 30, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC21665b("platform-io", f51437h), f51430a, "platform-io");
                        } else {
                            f51438i = new C21670e(f51436g.f51409a.f51439a, f51436g.f51409a.f51440b, f51436g.f51409a.f51441c, f51436g.f51409a.f51442d, new SynchronousQueue(), new ThreadFactoryC21665b("platform-io", f51437h), f51430a, "platform-io");
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9253);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = f51438i;
        MethodCollector.m26664o(9253);
        return threadPoolExecutor;
    }
}
