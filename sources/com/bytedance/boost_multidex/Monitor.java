package com.bytedance.boost_multidex;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Monitor {
    private static Monitor sMonitor;
    private ScheduledExecutorService mExecutor = m24017xfc8c48e5(1);
    private String mProcessName;

    static {
        Covode.recordClassIndex(15328);
    }

    /* renamed from: com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m24012xb9a89b7b(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m24013xb9a89b7c(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m24014xb9a89b80(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m24015xb9a89b8e(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m24016xb9a89b8e(String str, String str2, Throwable th) {
        return 0;
    }

    static Monitor get() {
        return sMonitor;
    }

    static void init(Monitor monitor) {
        if (monitor == null) {
            monitor = new Monitor();
        }
        sMonitor = monitor;
    }

    /* access modifiers changed from: protected */
    public void doAfterInstall(final Runnable runnable) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            /* class com.bytedance.boost_multidex.Monitor.C133391 */

            static {
                Covode.recordClassIndex(15329);
            }

            public boolean queueIdle() {
                Monitor.this.getExecutor().schedule(runnable, 5000, TimeUnit.MILLISECONDS);
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void doBeforeHandleOpt() {
        MethodCollector.m26663i(9096);
        try {
            Thread.sleep(10000);
            MethodCollector.m26664o(9096);
        } catch (InterruptedException e) {
            e.printStackTrace();
            MethodCollector.m26664o(9096);
        }
    }

    public ScheduledExecutorService getExecutor() {
        return this.mExecutor;
    }

    /* access modifiers changed from: package-private */
    public String getProcessName() {
        return this.mProcessName;
    }

    /* access modifiers changed from: protected */
    public boolean isEnableNativeCheckSum() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        m24011x1dc10198(str);
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
        m24012xb9a89b7b("BoostMultiDex", str);
    }

    /* access modifiers changed from: protected */
    public void logError(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str, Throwable th) {
        m24013xb9a89b7c("BoostMultiDex", str, th);
    }

    /* access modifiers changed from: protected */
    public void logErrorAfterInstall(String str, Throwable th) {
        m24013xb9a89b7c("BoostMultiDex", str, th);
    }

    /* access modifiers changed from: protected */
    public void logInfo(String str) {
        m24014xb9a89b80("BoostMultiDex", str);
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str) {
        m24015xb9a89b8e("BoostMultiDex", str);
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str, Throwable th) {
        m24016xb9a89b8e("BoostMultiDex", str, th);
    }

    /* access modifiers changed from: protected */
    public void reportAfterInstall(long j, long j2, long j3, String str) {
    }

    public Monitor setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.mExecutor = scheduledExecutorService;
        return this;
    }

    public Monitor setProcessName(String str) {
        this.mProcessName = str;
        return this;
    }

    /* renamed from: com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool */
    public static ScheduledExecutorService m24017xfc8c48e5(int i) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = i;
        return (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m24011x1dc10198(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
