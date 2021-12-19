package com.appsflyer;

import android.net.TrafficStats;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {

    /* renamed from: ι */
    private static AFExecutor f6828;

    /* renamed from: ı */
    final ThreadFactory f6829 = new ThreadFactory() {
        /* class com.appsflyer.AFExecutor.ThreadFactoryC22681 */

        static {
            Covode.recordClassIndex(2481);
        }

        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() {
                /* class com.appsflyer.AFExecutor.ThreadFactoryC22681.RunnableC22691 */

                static {
                    Covode.recordClassIndex(2482);
                }

                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };

    /* renamed from: ǃ */
    ScheduledExecutorService f6830;

    /* renamed from: ɩ */
    ScheduledExecutorService f6831;

    /* renamed from: Ι */
    Executor f6832;

    static {
        Covode.recordClassIndex(2480);
    }

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f6828 == null) {
            f6828 = new AFExecutor();
        }
        return f6828;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final ScheduledThreadPoolExecutor mo6258() {
        ScheduledExecutorService scheduledExecutorService = this.f6831;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f6831.isTerminated()) {
            this.f6831 = m6904xe8df285(2, this.f6829);
        }
        return (ScheduledThreadPoolExecutor) this.f6831;
    }

    public Executor getThreadPoolExecutor() {
        Executor executor = this.f6832;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f6832).isTerminated() || ((ThreadPoolExecutor) this.f6832).isTerminating()))) {
            this.f6832 = m6903x92d2b58c(2, this.f6829);
        }
        return this.f6832;
    }

    /* renamed from: ɩ */
    static void m6905(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }

    /* renamed from: com_appsflyer_AFExecutor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newFixedThreadPool */
    public static ExecutorService m6903x92d2b58c(int i, ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = i;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: com_appsflyer_AFExecutor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool */
    public static ScheduledExecutorService m6904xe8df285(int i, ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = i;
        a.f95509g = threadFactory;
        return (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }
}
