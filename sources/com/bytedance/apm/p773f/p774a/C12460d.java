package com.bytedance.apm.p773f.p774a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.apm.f.a.d */
public final class C12460d {

    /* renamed from: a */
    public static volatile boolean f30262a;

    /* renamed from: b */
    public static EnumC12462a f30263b = EnumC12462a.NONE;

    /* renamed from: c */
    public static long f30264c = -1;

    /* renamed from: d */
    public static long f30265d;

    /* renamed from: e */
    public static String f30266e = "";

    /* renamed from: f */
    private static long f30267f = 8000;

    /* renamed from: g */
    private static ExecutorService f30268g;

    /* renamed from: com.bytedance.apm.f.a.d$a */
    public enum EnumC12462a {
        NONE,
        SLEEP,
        NOT_SLEEP,
        DISK_SLEEP;

        static {
            Covode.recordClassIndex(14272);
        }
    }

    static {
        Covode.recordClassIndex(14270);
        ThreadFactoryC124611 r2 = new ThreadFactory() {
            /* class com.bytedance.apm.p773f.p774a.C12460d.ThreadFactoryC124611 */

            static {
                Covode.recordClassIndex(14271);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("launch_sleep_detector");
                return thread;
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        f30268g = C40780g.m82242a(a.mo70028a());
    }
}
