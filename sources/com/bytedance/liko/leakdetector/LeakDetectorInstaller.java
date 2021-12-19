package com.bytedance.liko.leakdetector;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.liko.leakdetector.p1487a.C20853b;
import com.bytedance.liko.leakdetector.p1487a.C20854c;
import com.bytedance.liko.leakdetector.strategy.C20860a;
import com.bytedance.liko.leakdetector.strategy.p1488a.C20864a;
import com.bytedance.liko.memoryexplorer.AnalyzerEngine;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.p1484b.C20840d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.concurrent.Callable;
import leakcanary.C89799e;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

public final class LeakDetectorInstaller {
    public static final LeakDetectorInstaller INSTANCE = new LeakDetectorInstaller();
    private static Handler handler;
    private static boolean hasExcuteBackgroud;
    private static int retryCount;
    private static long trySumTime;

    private LeakDetectorInstaller() {
    }

    public final Handler getHandler() {
        return handler;
    }

    public final boolean getHasExcuteBackgroud() {
        return hasExcuteBackgroud;
    }

    public final int getRetryCount() {
        return retryCount;
    }

    public final long getTrySumTime() {
        return trySumTime;
    }

    static {
        Covode.recordClassIndex(24422);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$b */
    public static final class CallableC20846b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Context f49302a;

        static {
            Covode.recordClassIndex(24424);
        }

        CallableC20846b(Context context) {
            this.f49302a = context;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            final int optInt = C20840d.f49292f.optInt("strategy", 0);
            if (optInt > 0) {
                C20840d.f49292f.put("url", "https://api-va.tiktokv.com/");
                MemoryConfig.initJsonConfig(C20840d.f49292f.toString());
                Handler handler = LeakDetectorInstaller.INSTANCE.getHandler();
                if (handler != null) {
                    handler.post(new Runnable(this) {
                        /* class com.bytedance.liko.leakdetector.LeakDetectorInstaller.CallableC20846b.RunnableC208471 */

                        /* renamed from: a */
                        final /* synthetic */ CallableC20846b f49303a;

                        static {
                            Covode.recordClassIndex(24425);
                        }

                        {
                            this.f49303a = r1;
                        }

                        public final void run() {
                            LeakDetectorInstaller.INSTANCE.install(this.f49303a.f49302a, optInt);
                        }
                    });
                }
                LeakDetectorInstaller.INSTANCE.setTrySumTime(0);
                return C89391z.f203057a;
            } else if (optInt == 0) {
                LeakDetectorInstaller leakDetectorInstaller = LeakDetectorInstaller.INSTANCE;
                leakDetectorInstaller.setTrySumTime(leakDetectorInstaller.getTrySumTime() + 10000);
                C89219l.m154719c("Leak detector strategy < 1,retry", "");
                Handler handler2 = LeakDetectorInstaller.INSTANCE.getHandler();
                if (handler2 != null) {
                    return Boolean.valueOf(handler2.sendEmptyMessageDelayed(0, 10000));
                }
                return null;
            } else {
                C89219l.m154719c("Leak detector strategy < 0, finish", "");
                return C89391z.f203057a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$a */
    public static final class CallableC20845a<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f49300a;

        /* renamed from: b */
        final /* synthetic */ Context f49301b;

        static {
            Covode.recordClassIndex(24423);
        }

        CallableC20845a(int i, Context context) {
            this.f49300a = i;
            this.f49301b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            Context context;
            SharedPreferences a;
            String string;
            String str;
            Context context2;
            SharedPreferences a2;
            String string2;
            if (!((this.f49300a & 2) == 0 || (context2 = this.f49301b) == null || (a2 = C34822d.m71158a(context2, "LeakDetectorSp", 0)) == null || (string2 = a2.getString("ld_oom_dump_file", null)) == null)) {
                if ((this.f49300a & 16) != 0) {
                    C89219l.m154719c("OOM UploadHprof right now:".concat(String.valueOf(string2)), "");
                    new C20864a().mo34291a(this.f49301b, string2);
                    C20854c.m39207b(this.f49301b, null);
                } else if (C20853b.m39205a() < 0.4f) {
                    C89219l.m154719c("OOM anlaysis right now:".concat(String.valueOf(string2)), "");
                    LeakDetectorInstaller.INSTANCE.runAnalysis(string2);
                    C20854c.m39207b(this.f49301b, null);
                }
            }
            if (!((this.f49300a & 4) == 0 || (str = MemoryConfig.getMemoryConfig().dumpFilePath) == null)) {
                if ((this.f49300a & 16) != 0) {
                    C89219l.m154719c("direct UploadHprof right now:".concat(String.valueOf(str)), "");
                    new C20864a().mo34291a(this.f49301b, str);
                } else if (C20853b.m39205a() > 0.4f) {
                    C89219l.m154719c("direct anlaysis right now:".concat(String.valueOf(str)), "");
                    LeakDetectorInstaller.INSTANCE.runAnalysis(str);
                }
            }
            if (!((this.f49300a & 8) == 0 || (context = this.f49301b) == null || (a = C34822d.m71158a(context, "LeakDetectorSp", 0)) == null || (string = a.getString("ld_memory_peak_dump_file", null)) == null)) {
                if ((this.f49300a & 16) != 0) {
                    C89219l.m154719c("MemoryPeak UploadHprof right now:".concat(String.valueOf(string)), "");
                    new C20864a().mo34291a(this.f49301b, string);
                    C20854c.m39206a(this.f49301b, null);
                } else if (C20853b.m39205a() > 0.4f) {
                    C89219l.m154719c("MemoryPeak anlaysis right now:".concat(String.valueOf(string)), "");
                    LeakDetectorInstaller.INSTANCE.runAnalysis(string);
                    C20854c.m39206a(this.f49301b, null);
                }
            }
            return C89391z.f203057a;
        }
    }

    public final void setHandler(Handler handler2) {
        handler = handler2;
    }

    public final void setHasExcuteBackgroud(boolean z) {
        hasExcuteBackgroud = z;
    }

    public final void setRetryCount(int i) {
        retryCount = i;
    }

    public final void setTrySumTime(long j) {
        trySumTime = j;
    }

    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$e */
    public static final class HandlerC20850e extends Handler {

        /* renamed from: a */
        final /* synthetic */ Context f49308a;

        static {
            Covode.recordClassIndex(24428);
        }

        public final void handleMessage(Message message) {
            LeakDetectorInstaller.INSTANCE.tryInstall(this.f49308a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC20850e(Context context, Looper looper) {
            super(looper);
            this.f49308a = context;
        }
    }

    /* renamed from: com_bytedance_liko_leakdetector_LeakDetectorInstaller_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m39194xe1abfb01(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public final void initConfig(Context context) {
        C1731i.m5635a((Callable) new CallableC20846b(context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$c */
    public static final class C20848c<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Context f49305a;

        /* renamed from: b */
        final /* synthetic */ int f49306b;

        static {
            Covode.recordClassIndex(24426);
        }

        C20848c(Context context, int i) {
            this.f49305a = context;
            this.f49306b = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            if (bool.booleanValue() && !LeakDetectorInstaller.INSTANCE.getHasExcuteBackgroud()) {
                C89219l.m154719c("excuteStrategy runInbackground", "");
                LeakDetectorInstaller.INSTANCE.setHasExcuteBackgroud(true);
                LeakDetectorInstaller.INSTANCE.excuteStrategy(this.f49305a, this.f49306b);
            }
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$d */
    public static final class HandlerC20849d extends Handler {

        /* renamed from: a */
        final /* synthetic */ Context f49307a;

        static {
            Covode.recordClassIndex(24427);
        }

        public final void handleMessage(Message message) {
            if (LeakDetectorInstaller.INSTANCE.getTrySumTime() > 100000) {
                LeakDetectorInstaller.INSTANCE.setTrySumTime(0);
                C89219l.m154719c("Leak detector install timeout", "");
                return;
            }
            LeakDetectorInstaller.INSTANCE.initConfig(this.f49307a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC20849d(Context context, Looper looper) {
            super(looper);
            this.f49307a = context;
        }
    }

    /* renamed from: com_bytedance_liko_leakdetector_LeakDetectorInstaller_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m39195x3025eca4(File file) {
        MethodCollector.m26663i(14233);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(14233);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(14233);
        return delete;
    }

    public final synchronized void runAnalysis(String str) {
        MethodCollector.m26663i(14226);
        C89219l.m154719c(str, "");
        C20860a.f49323f = true;
        C89219l.m154719c("start Analysis:hprof path:".concat(String.valueOf(str)), "");
        try {
            new AnalyzerEngine().runAnalysis(new File(str), MemoryConfig.getMemoryConfig());
        } catch (Throwable th) {
            m39195x3025eca4(new File(str));
            C89219l.m154719c("runAnalysis fail! delete file " + th.toString(), "");
        }
        C20860a.f49323f = false;
        C89219l.m154719c("end Analysis", "");
        MethodCollector.m26664o(14226);
    }

    public final void tryInstall(Context context) {
        if ("local_test".equals(C17867d.m33089j())) {
            boolean z = true;
            try {
                C20840d.f49287a = true;
                C89219l.m154719c("Leak detector start install", "");
                if (context == null) {
                    Boolean.valueOf(true);
                } else {
                    SharedPreferences a = C34822d.m71158a(context, "LeakDetectorSp", 0);
                    if (a != null) {
                        z = a.getBoolean("open_leak_detector_on_local_test", true);
                    }
                }
                C20840d.f49287a = z;
                if (!z) {
                    C89219l.m154719c("Leak detector is disabled", "");
                    return;
                }
            } catch (Throwable th) {
                C89219l.m154719c("SPHelper crash!\n".concat(String.valueOf(th)), "");
                int i = retryCount;
                retryCount = i + 1;
                if (i <= 0) {
                    new HandlerC20850e(context, Looper.getMainLooper()).sendEmptyMessageDelayed(0, 10000);
                    C89219l.m154719c("retry install in 10s", "");
                    return;
                }
                return;
            }
        }
        HandlerC20849d dVar = new HandlerC20849d(context, Looper.getMainLooper());
        handler = dVar;
        dVar.sendEmptyMessageDelayed(0, 10000);
    }

    public final void excuteStrategy(Context context, int i) {
        C89219l.m154719c(context, "");
        C1731i.m5635a((Callable) new CallableC20845a(i, context));
    }

    public final void runInbackground(Context context, int i) {
        C89219l.m154719c(context, "");
        if (C17867d.m33086g() > 0) {
            C17873f.m33099g().mo143289d(new C20848c(context, i));
        } else {
            excuteStrategy(context, i);
        }
    }

    public final void setLeakCanaryConfig(boolean z, int i) {
        C89799e.m155893a(C89799e.C89800a.m155894a(C89799e.f203635a, false, z, i, false, 0, false, false, 121));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[Catch:{ all -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec A[Catch:{ all -> 0x0160 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void install(android.content.Context r13, int r14) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.LeakDetectorInstaller.install(android.content.Context, int):void");
    }
}
