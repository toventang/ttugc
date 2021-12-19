package com.p2082ss.android.ugc.aweme.p2719cv;

import android.os.Process;
import android.os.SystemClock;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.experiment.C46995gv;
import com.p2082ss.android.ugc.aweme.p2719cv.C40774f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40789m;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.cv.d */
public final class C40767d implements C40789m.AbstractC40790a {

    /* renamed from: a */
    public static AtomicInteger f95433a = new AtomicInteger(0);

    /* renamed from: b */
    public static final int f95434b;

    /* renamed from: c */
    public static final int f95435c;

    /* renamed from: d */
    public static ExecutorService f95436d;

    /* renamed from: e */
    public static ExecutorService f95437e;

    /* renamed from: f */
    public static long f95438f;

    /* renamed from: g */
    public static long f95439g;

    /* renamed from: h */
    public static final long f95440h = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: i */
    private static final int f95441i;

    /* renamed from: j */
    private static final int f95442j;

    /* renamed from: k */
    private static final int f95443k;

    /* renamed from: l */
    private static RejectedExecutionHandler f95444l = new RejectedExecutionHandler() {
        /* class com.p2082ss.android.ugc.aweme.p2719cv.C40767d.RejectedExecutionHandlerC407681 */

        static {
            Covode.recordClassIndex(48620);
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C1764a.m5928a("sIORejectHandler: runnable=%s, executor=%s", new Object[]{runnable, threadPoolExecutor});
            C40767d.f95436d.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - C40767d.f95438f >= C40767d.f95440h) {
                C40767d.f95438f = elapsedRealtime;
                C40774f.C40778a.f95473a.mo70019a(runnable, threadPoolExecutor);
                return;
            }
            C40767d.f95438f = elapsedRealtime;
        }
    };

    /* renamed from: m */
    private static RejectedExecutionHandler f95445m = new RejectedExecutionHandler() {
        /* class com.p2082ss.android.ugc.aweme.p2719cv.C40767d.RejectedExecutionHandlerC407692 */

        static {
            Covode.recordClassIndex(48621);
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C1764a.m5928a("sDefaultRejectHandler: runnable=%s, executor=%s", new Object[]{runnable, threadPoolExecutor});
            C40767d.f95437e.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - C40767d.f95439g >= C40767d.f95440h || C40780g.f95475a.f95482a) {
                C40767d.f95439g = elapsedRealtime;
                C40774f.C40778a.f95473a.mo70019a(runnable, threadPoolExecutor);
                return;
            }
            C40767d.f95439g = elapsedRealtime;
        }
    };

    /* renamed from: a */
    private static ExecutorService m82233a() {
        return new C40764a(EnumC40793o.IO, 0, 128, 30, TimeUnit.SECONDS, new SynchronousQueue(), m82235a("tp-io", false, 0), f95444l);
    }

    /* renamed from: b */
    private static int m82236b() {
        if (((Boolean) C46995gv.f109506b.getValue()).booleanValue()) {
            return f95435c;
        }
        return f95434b;
    }

    /* renamed from: com.ss.android.ugc.aweme.cv.d$4 */
    static /* synthetic */ class C407724 {

        /* renamed from: a */
        static final /* synthetic */ int[] f95451a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 48624(0xbdf0, float:6.8137E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.cv.o[] r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.p2719cv.C40767d.C407724.f95451a = r2
                com.ss.android.ugc.aweme.cv.o r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.IO     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.p2719cv.C40767d.C407724.f95451a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.cv.o r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.p2719cv.C40767d.C407724.f95451a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.cv.o r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.p2719cv.C40767d.C407724.f95451a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.cv.o r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.SCHEDULED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.p2719cv.C40767d.C407724.f95451a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.aweme.cv.o r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.SERIAL     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.p2082ss.android.ugc.aweme.p2719cv.C40767d.C407724.f95451a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.android.ugc.aweme.cv.o r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.FIXED     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2719cv.C40767d.C407724.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(48619);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f95441i = availableProcessors;
        int i = availableProcessors + 1;
        f95442j = i;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f95443k = max;
        f95434b = Math.max(2, Math.min(availableProcessors - 1, 4));
        f95435c = Math.max(2, availableProcessors - 1);
        f95436d = m82234a(max, EnumC40793o.IO, "tp-reject");
        f95437e = m82234a(i, EnumC40793o.DEFAULT, "tp-default-reject");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.C40789m.AbstractC40790a
    /* renamed from: a */
    public final ExecutorService mo70012a(C40787l lVar) {
        String str;
        ThreadFactory a;
        long j;
        BlockingQueue linkedBlockingQueue;
        String str2;
        ThreadFactory a2;
        RejectedExecutionHandler abortPolicy;
        BlockingQueue linkedBlockingQueue2;
        String str3;
        ThreadFactory a3;
        RejectedExecutionHandler abortPolicy2;
        MethodCollector.m26663i(2297);
        C1764a.m5928a("create: taskType=%s", new Object[]{lVar.f95496a});
        long j2 = 30;
        switch (C407724.f95451a[lVar.f95496a.ordinal()]) {
            case 1:
                ExecutorService a4 = m82233a();
                MethodCollector.m26664o(2297);
                return a4;
            case 2:
                C40764a aVar = new C40764a(EnumC40793o.DEFAULT, m82236b(), (m82236b() * 2) + 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), m82235a("tp-default", false, 0), f95445m);
                aVar.allowCoreThreadTimeOut(true);
                MethodCollector.m26664o(2297);
                return aVar;
            case 3:
                C40764a aVar2 = new C40764a(EnumC40793o.BACKGROUND, 0, 3, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(128), m82235a("tp-background", true, 10), f95445m);
                MethodCollector.m26664o(2297);
                return aVar2;
            case 4:
                int i = lVar.f95498c;
                if (lVar.f95502g != null) {
                    a = lVar.f95502g;
                } else {
                    if (lVar.f95497b != null) {
                        str = lVar.f95497b;
                    } else {
                        str = "tp-scheduled";
                    }
                    a = m82235a(str, false, 0);
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, a);
                if (lVar.f95501f >= 0) {
                    j = lVar.f95501f;
                } else {
                    j = 15;
                }
                scheduledThreadPoolExecutor.setKeepAliveTime(j, TimeUnit.SECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                MethodCollector.m26664o(2297);
                return scheduledThreadPoolExecutor;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                EnumC40793o oVar = EnumC40793o.SERIAL;
                if (lVar.f95501f >= 0) {
                    j2 = lVar.f95501f;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (lVar.f95499d != null) {
                    linkedBlockingQueue = lVar.f95499d;
                } else {
                    linkedBlockingQueue = new LinkedBlockingQueue();
                }
                if (lVar.f95502g != null) {
                    a2 = lVar.f95502g;
                } else {
                    if (lVar.f95497b != null) {
                        str2 = lVar.f95497b;
                    } else {
                        str2 = "tp-serial";
                    }
                    a2 = m82235a(str2, false, 0);
                }
                if (lVar.f95500e != null) {
                    abortPolicy = lVar.f95500e;
                } else {
                    abortPolicy = new ThreadPoolExecutor.AbortPolicy();
                }
                C40764a aVar3 = new C40764a(oVar, 1, 1, j2, timeUnit, linkedBlockingQueue, a2, abortPolicy);
                aVar3.allowCoreThreadTimeOut(true);
                MethodCollector.m26664o(2297);
                return aVar3;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                EnumC40793o oVar2 = EnumC40793o.FIXED;
                int i2 = lVar.f95498c;
                int i3 = lVar.f95498c;
                if (lVar.f95501f >= 0) {
                    j2 = lVar.f95501f;
                }
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                if (lVar.f95499d != null) {
                    linkedBlockingQueue2 = lVar.f95499d;
                } else {
                    linkedBlockingQueue2 = new LinkedBlockingQueue();
                }
                if (lVar.f95502g != null) {
                    a3 = lVar.f95502g;
                } else {
                    if (lVar.f95497b != null) {
                        str3 = lVar.f95497b;
                    } else {
                        str3 = "tp-fixed";
                    }
                    a3 = m82235a(str3, false, 0);
                }
                if (lVar.f95500e != null) {
                    abortPolicy2 = lVar.f95500e;
                } else {
                    abortPolicy2 = new ThreadPoolExecutor.AbortPolicy();
                }
                C40764a aVar4 = new C40764a(oVar2, i2, i3, j2, timeUnit2, linkedBlockingQueue2, a3, abortPolicy2);
                aVar4.allowCoreThreadTimeOut(true);
                MethodCollector.m26664o(2297);
                return aVar4;
            default:
                ExecutorService a5 = m82233a();
                MethodCollector.m26664o(2297);
                return a5;
        }
    }

    /* renamed from: a */
    private static ThreadFactory m82235a(final String str, final boolean z, final int i) {
        return new ThreadFactory() {
            /* class com.p2082ss.android.ugc.aweme.p2719cv.C40767d.ThreadFactoryC407703 */

            static {
                Covode.recordClassIndex(48622);
            }

            public final Thread newThread(final Runnable runnable) {
                Thread thread = new Thread(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.p2719cv.C40767d.ThreadFactoryC407703.RunnableC407711 */

                    static {
                        Covode.recordClassIndex(48623);
                    }

                    public final void run() {
                        try {
                            Process.setThreadPriority(i);
                        } catch (Throwable unused) {
                        }
                        runnable.run();
                    }
                });
                thread.setName(str + "-" + C40767d.f95433a.incrementAndGet());
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* renamed from: a */
    private static ExecutorService m82234a(int i, EnumC40793o oVar, String str) {
        C40764a aVar = new C40764a(oVar, i, i, TimeUnit.SECONDS, new LinkedBlockingQueue(), m82235a(str, false, 0));
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }
}
