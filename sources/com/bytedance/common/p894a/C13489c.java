package com.bytedance.common.p894a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.common.a.c */
public final class C13489c {

    /* renamed from: a */
    private static ExecutorService f32868a;

    static {
        Covode.recordClassIndex(15497);
        ThreadFactoryC134901 r2 = new ThreadFactory() {
            /* class com.bytedance.common.p894a.C13489c.ThreadFactoryC134901 */

            static {
                Covode.recordClassIndex(15498);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("deximage_monitor");
                return thread;
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        f32868a = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static synchronized C14827k m24259a() {
        C14827k a;
        synchronized (C13489c.class) {
            MethodCollector.m26663i(3109);
            a = SDKMonitorUtils.m27201a("2021");
            MethodCollector.m26664o(3109);
        }
        return a;
    }
}
