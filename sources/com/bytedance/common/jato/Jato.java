package com.bytedance.common.jato;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Process;
import android.util.ArrayMap;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.common.jato.boost.AbstractC13537a;
import com.bytedance.common.jato.boost.AbstractC13542e;
import com.bytedance.common.jato.boost.C13538b;
import com.bytedance.common.jato.boost.C13540d;
import com.bytedance.common.jato.boost.C13543f;
import com.bytedance.common.jato.boost.C13546g;
import com.bytedance.common.jato.boost.C13552i;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.boost.MemoryManager;
import com.bytedance.common.jato.boost.ThreadBoostManager;
import com.bytedance.common.jato.dex.C13557a;
import com.bytedance.common.jato.fdio.AbstractC13574b;
import com.bytedance.common.jato.fdio.FDIOCollector;
import com.bytedance.common.jato.fdio.FDIOPreloaderManager;
import com.bytedance.common.jato.fdio.p905a.C13570a;
import com.bytedance.common.jato.gcblocker.C13576b;
import com.bytedance.common.jato.jit.JitSuspend;
import com.bytedance.common.jato.p901a.p902a.C13524a;
import com.bytedance.common.jato.p903b.C13530a;
import com.bytedance.common.jato.p903b.C13532b;
import com.bytedance.common.jato.scheduler.C13578a;
import com.bytedance.common.jato.scheduler.SchedulerNativeHolder;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class Jato {
    private static C13528b sConfig;
    public static Context sContext;
    private static boolean sInitialized;
    private static ExecutorService sInnerExecutorService;
    private static boolean sIsDebug;
    private static AbstractC13554c sListener;
    public static List<AbstractC13554c> sListenerList;
    private static ExecutorService sWorkExecutorService;

    static {
        Covode.recordClassIndex(15521);
    }

    public static void promoteMainThreadPriority() {
    }

    public static void promoteMainThreadPriority(int i) {
    }

    public static void tryBoostStorage(long j) {
    }

    public static void bindBigCore() {
        CpusetManager.bindBigCore();
    }

    public static void bindLittleCore() {
        CpusetManager.bindLittleCore();
    }

    public static void enableClassVerify() {
        C13557a.m24359b();
    }

    public static C13528b getConfig() {
        return sConfig;
    }

    public static Context getContext() {
        return sContext;
    }

    public static ExecutorService getWorkExecutorService() {
        return sWorkExecutorService;
    }

    public static boolean isDebug() {
        return sIsDebug;
    }

    public static void releaseBoost() {
        C13538b.m24315a();
    }

    public static void resetCoreBind() {
        CpusetManager.resetCoreBind();
    }

    public static void resetRenderThread() {
        C13546g.m24337a();
    }

    public static void preloadCpusetInfo() {
        CpusetManager.init(getWorkExecutorService());
    }

    public static void shrinkVM() {
        shrinkVM(512, 2048);
    }

    public static void disableClassVerify() {
        C13557a.m24358a(sContext);
        C13557a.m24357a();
    }

    public static void disableJit() {
        sWorkExecutorService.execute(new Runnable() {
            /* class com.bytedance.common.jato.Jato.RunnableC1351310 */

            static {
                Covode.recordClassIndex(15523);
            }

            public final void run() {
                JitSuspend.m24388a();
                JitSuspend.m24389b();
            }
        });
    }

    public static void enableJit() {
        sWorkExecutorService.execute(new Runnable() {
            /* class com.bytedance.common.jato.Jato.RunnableC1351411 */

            static {
                Covode.recordClassIndex(15524);
            }

            public final void run() {
                JitSuspend.m24390c();
            }
        });
    }

    public static void optimizeLaunchIO() {
        if (Build.VERSION.SDK_INT > 22) {
            C13570a.m24370a();
        }
    }

    public static void stopOptimizeLaunchIO() {
        if (Build.VERSION.SDK_INT > 22) {
            C13570a.m24371a(false);
        }
    }

    public static synchronized AbstractC13554c getListener() {
        AbstractC13554c cVar;
        synchronized (Jato.class) {
            MethodCollector.m26663i(8992);
            if (sListener == null) {
                sListener = new AbstractC13554c() {
                    /* class com.bytedance.common.jato.Jato.C135163 */

                    static {
                        Covode.recordClassIndex(15526);
                    }

                    @Override // com.bytedance.common.jato.AbstractC13554c
                    /* renamed from: a */
                    public final void mo21785a(String str) {
                        if (Jato.isDebug() && Jato.sListenerList != null) {
                            for (AbstractC13554c cVar : Jato.sListenerList) {
                                if (cVar != null) {
                                    cVar.mo21785a(str);
                                }
                            }
                        }
                    }

                    @Override // com.bytedance.common.jato.AbstractC13554c
                    /* renamed from: a */
                    public final void mo21786a(String str, Throwable th) {
                        if (Jato.sListenerList != null) {
                            for (AbstractC13554c cVar : Jato.sListenerList) {
                                if (cVar != null) {
                                    cVar.mo21786a(str, th);
                                }
                            }
                        }
                    }
                };
            }
            cVar = sListener;
            MethodCollector.m26664o(8992);
        }
        return cVar;
    }

    public static ExecutorService getInnerExecutorService() {
        MethodCollector.m26663i(8845);
        if (sInnerExecutorService == null) {
            synchronized (Jato.class) {
                try {
                    if (sInnerExecutorService == null) {
                        sInnerExecutorService = m24298x2c34f3a9(new ThreadFactory() {
                            /* class com.bytedance.common.jato.Jato.ThreadFactoryC135152 */

                            static {
                                Covode.recordClassIndex(15525);
                            }

                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, "jato_inner_thread");
                            }
                        });
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8845);
                    throw th;
                }
            }
        }
        ExecutorService executorService = sInnerExecutorService;
        MethodCollector.m26664o(8845);
        return executorService;
    }

    public static void resetPriority() {
        try {
            if (C13546g.f32962c.get(-1) != null) {
                Process.setThreadPriority(0, C13546g.f32962c.get(-1).intValue());
            }
        } catch (Throwable th) {
            getListener().mo21786a("error when reset priority", th);
        }
    }

    public static void stopOptimizeLaunchLock() {
        if (C13524a.f32910d) {
            C13524a.f32910d = false;
            if (getWorkExecutorService() != null) {
                getWorkExecutorService().execute(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: INVOKE  
                      (wrap: java.util.concurrent.ExecutorService : 0x000d: INVOKE  (r1v1 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.Jato.getWorkExecutorService():java.util.concurrent.ExecutorService)
                      (wrap: com.bytedance.common.jato.a.a.a$1 : 0x0013: CONSTRUCTOR  (r0v4 com.bytedance.common.jato.a.a.a$1) =  call: com.bytedance.common.jato.a.a.a.1.<init>():void type: CONSTRUCTOR)
                     type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.Jato.stopOptimizeLaunchLock():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r0v4 com.bytedance.common.jato.a.a.a$1) =  call: com.bytedance.common.jato.a.a.a.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.common.jato.Jato.stopOptimizeLaunchLock():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.a.a.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    boolean r0 = com.bytedance.common.jato.p901a.p902a.C13524a.f32910d
                    if (r0 == 0) goto L_0x0026
                    r0 = 0
                    com.bytedance.common.jato.p901a.p902a.C13524a.f32910d = r0
                    java.util.concurrent.ExecutorService r0 = getWorkExecutorService()
                    if (r0 == 0) goto L_0x001a
                    java.util.concurrent.ExecutorService r1 = getWorkExecutorService()
                    com.bytedance.common.jato.a.a.a$1 r0 = new com.bytedance.common.jato.a.a.a$1
                    r0.<init>()
                    r1.execute(r0)
                    return
                L_0x001a:
                    java.util.concurrent.ExecutorService r1 = getInnerExecutorService()
                    com.bytedance.common.jato.a.a.a$2 r0 = new com.bytedance.common.jato.a.a.a$2
                    r0.<init>()
                    r1.execute(r0)
                L_0x0026:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.Jato.stopOptimizeLaunchLock():void");
            }

            public static void preloadBoostInfo() {
                Context context = sContext;
                ExecutorService executorService = sWorkExecutorService;
                C135185 r0 = new AbstractC13537a() {
                    /* class com.bytedance.common.jato.Jato.C135185 */

                    static {
                        Covode.recordClassIndex(15528);
                    }

                    @Override // com.bytedance.common.jato.boost.AbstractC13537a
                    /* renamed from: a */
                    public final void mo21788a(String str) {
                        Jato.getListener().mo21785a(str);
                    }

                    @Override // com.bytedance.common.jato.boost.AbstractC13537a
                    /* renamed from: a */
                    public final void mo21789a(String str, Throwable th) {
                        Jato.getListener().mo21786a(str, th);
                    }
                };
                C13538b.f32938b = executorService;
                C13538b.f32939c = r0;
                String str = Build.HARDWARE;
                C13538b.m24316a("cpuboost hardware: " + Build.HARDWARE);
                AbstractC13542e eVar = null;
                if (str.startsWith("qcom") || str.startsWith("msm") || str.startsWith("qsc") || str.startsWith("sdm")) {
                    C13538b.m24316a("cpuboost qcm boost");
                    eVar = new C13552i();
                } else if (str.startsWith("mt")) {
                    C13538b.m24316a("cpuboost mtk boost");
                    eVar = new C13543f();
                } else if (str.startsWith("kirin") || str.startsWith("hi")) {
                    C13538b.m24316a("cpuboost hisilicon boost");
                    eVar = new C13540d();
                } else {
                    C13538b.m24317a("cpuboost not found boost for: " + Build.HARDWARE, null);
                }
                C13538b.f32937a = eVar;
                if (eVar != null) {
                    C13538b.f32937a.mo21811a(context);
                }
            }

            public static void tryCpuBoost(long j) {
                C13538b.m24318a(j);
            }

            public static void tryGpuBoost(long j) {
                C13538b.m24319b(j);
            }

            public static void bindBigCore(int i) {
                CpusetManager.bindBigCore(i);
            }

            public static void bindLittleCore(int i) {
                CpusetManager.bindLittleCore(i);
            }

            public static void resetCoreBind(int i) {
                CpusetManager.resetCoreBind(i);
            }

            public static void setPriority(int i) {
                C13546g.m24338a(-1, i);
            }

            public static void startFDIOCollect(String str) {
                startFDIOCollect(str, false);
            }

            public static boolean tryCpuBoostWithResult(long j) {
                return C13538b.m24318a(j);
            }

            public static boolean tryGpuBoostWithResult(long j) {
                return C13538b.m24319b(j);
            }

            public static void requestBlockGc(final long j) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.RunnableC135207 */

                        static {
                            Covode.recordClassIndex(15530);
                        }

                        public final void run() {
                            C13576b.m24384a().mo21843a(j);
                        }
                    });
                }
            }

            public static void startBlockGc(final String str) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.RunnableC135218 */

                        static {
                            Covode.recordClassIndex(15531);
                        }

                        public final void run() {
                            C13576b.m24384a().mo21844a(str);
                        }
                    });
                }
            }

            public static void stopBlockGc(final String str) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.RunnableC135229 */

                        static {
                            Covode.recordClassIndex(15532);
                        }

                        public final void run() {
                            C13576b.m24384a().mo21845b(str);
                        }
                    });
                }
            }

            /* renamed from: com_bytedance_common_jato_Jato_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
            public static ExecutorService m24298x2c34f3a9(ThreadFactory threadFactory) {
                C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
                a.f95505c = 1;
                a.f95509g = threadFactory;
                return C40780g.m82242a(a.mo70028a());
            }

            public static void initScheduler(final int i) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null && sContext != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.RunnableC135121 */

                        static {
                            Covode.recordClassIndex(15522);
                        }

                        public final void run() {
                            MethodCollector.m26663i(13148);
                            C13578a a = C13578a.m24392a();
                            Context context = Jato.sContext;
                            int i = i;
                            if (a.f33022a.compareAndSet(false, true) && Build.VERSION.SDK_INT > 22 && SchedulerNativeHolder.m24391a()) {
                                int i2 = context.getApplicationInfo().targetSdkVersion;
                                ByteHook.m7797a();
                                if (C13532b.m24310b() || C13532b.m24309a()) {
                                    i |= 1024;
                                }
                                SchedulerNativeHolder.nativeInit(i2, i, context);
                                ThreadBoostManager.delayMaskMemoryInfo();
                            }
                            MethodCollector.m26664o(13148);
                        }
                    });
                }
            }

            public static void resetPriority(int i) {
                try {
                    if (C13546g.f32962c.get(Integer.valueOf(i)) != null) {
                        Process.setThreadPriority(i, C13546g.f32962c.get(Integer.valueOf(i)).intValue());
                    }
                } catch (Throwable th) {
                    getListener().mo21786a("error when reset priority", th);
                }
            }

            public static void setPriority(int i, int i2) {
                C13546g.m24338a(i, i2);
            }

            public static void boostRenderThread(Application application, ExecutorService executorService) {
                boostRenderThread(application, -20, executorService);
            }

            public static void endFDIOOperator(String str, boolean z) {
                AbstractC13574b andRemove = FDIOPreloaderManager.getAndRemove(str);
                if (andRemove != null) {
                    andRemove.mo21833a(z);
                }
            }

            public static void shrinkVM(final int i, final int i2) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.RunnableC135174 */

                        static {
                            Covode.recordClassIndex(15527);
                        }

                        public final void run() {
                            Shrinker.getInstance().doShrink(i, i2);
                        }
                    });
                }
            }

            public static void startFDIOCollect(String str, boolean z) {
                FDIOCollector collector = FDIOPreloaderManager.getCollector(str);
                if (collector != null) {
                    collector.mo21832a(str, false);
                    collector.f32996a = z;
                }
            }

            public static void startFDIOPreload(String str, boolean z) {
                AbstractC13574b preloader = FDIOPreloaderManager.getPreloader(str);
                if (preloader != null) {
                    preloader.mo21832a(str, z);
                }
            }

            public static void boostRenderThread(Application application, int i, ExecutorService executorService) {
                if (executorService != null && application != null) {
                    C13546g.m24339a(application, executorService, i);
                }
            }

            public static void pagePreFault(final int i, final boolean z, final boolean z2) {
                ExecutorService executorService;
                final int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29 && i2 < 31 && (executorService = sWorkExecutorService) != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.RunnableC135196 */

                        static {
                            Covode.recordClassIndex(15529);
                        }

                        public final void run() {
                            MethodCollector.m26663i(10042);
                            String str = null;
                            try {
                                str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.board.platform");
                            } catch (Exception unused) {
                            }
                            if (str != null) {
                                String lowerCase = str.toLowerCase();
                                if (lowerCase.startsWith("kirin9") || lowerCase.startsWith("msm8") || lowerCase.startsWith("sdm8") || lowerCase.startsWith("sm8")) {
                                    MethodCollector.m26664o(10042);
                                    return;
                                }
                            }
                            int i = i2;
                            int i2 = i;
                            boolean z = z;
                            boolean z2 = z2;
                            if (C13556d.m24356a()) {
                                ByteHook.m7797a();
                                MemoryManager.nativePagePreFault(i, i2, z, z2);
                            }
                            MethodCollector.m26664o(10042);
                        }
                    });
                }
            }

            public static void optimizeLaunchLock(Application application, boolean z, boolean z2) {
                try {
                    C13524a.f32912f = true;
                    C13524a.f32913g = z;
                    C13524a.f32914h = z2;
                    C13524a.f32911e = application;
                    int i = Build.VERSION.SDK_INT;
                    try {
                        Class<?> cls = Class.forName("android.app.ContextImpl");
                        if (Build.VERSION.SDK_INT <= 23) {
                            Field declaredField = cls.getDeclaredField("sSharedPrefs");
                            declaredField.setAccessible(true);
                            ArrayMap arrayMap = (ArrayMap) declaredField.get(null);
                            if (arrayMap != null) {
                                C13524a.f32907a = (ArrayMap) arrayMap.get(C13524a.f32911e.getPackageName());
                            }
                            if (C13524a.f32907a == null) {
                                C34822d.m71158a(C13524a.f32911e, "jato_preload_sp", 0);
                                ArrayMap arrayMap2 = (ArrayMap) declaredField.get(null);
                                if (arrayMap2 != null) {
                                    C13524a.f32907a = (ArrayMap) arrayMap2.get(C13524a.f32911e.getPackageName());
                                }
                            }
                        } else {
                            Field declaredField2 = cls.getDeclaredField("sSharedPrefsCache");
                            declaredField2.setAccessible(true);
                            ArrayMap arrayMap3 = (ArrayMap) declaredField2.get(null);
                            if (arrayMap3 != null) {
                                C13524a.f32908b = (ArrayMap) arrayMap3.get(C13524a.f32911e.getPackageName());
                            }
                            if (C13524a.f32908b == null) {
                                C34822d.m71158a(C13524a.f32911e, "jato_preload_sp", 0);
                                ArrayMap arrayMap4 = (ArrayMap) declaredField2.get(null);
                                if (arrayMap4 != null) {
                                    C13524a.f32908b = (ArrayMap) arrayMap4.get(C13524a.f32911e.getPackageName());
                                }
                            }
                            Application application2 = C13524a.f32911e;
                            Field declaredField3 = ContextWrapper.class.getDeclaredField("mBase");
                            declaredField3.setAccessible(true);
                            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, "mSharedPrefsPaths");
                            field.setAccessible(true);
                            C13524a.f32909c = (ArrayMap) field.get((Context) declaredField3.get(application2));
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (NoSuchFieldException e2) {
                        e2.printStackTrace();
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (NoSuchMethodException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                    C13524a.m24303a();
                } catch (Throwable unused) {
                }
            }

            public static synchronized void init(Context context, boolean z, AbstractC13554c cVar, ExecutorService executorService) {
                synchronized (Jato.class) {
                    MethodCollector.m26663i(8684);
                    init(context, z, cVar, executorService, null);
                    MethodCollector.m26664o(8684);
                }
            }

            public static synchronized void init(Context context, boolean z, AbstractC13554c cVar, ExecutorService executorService, C13523a aVar) {
                synchronized (Jato.class) {
                    MethodCollector.m26663i(8837);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (sListenerList == null) {
                        sListenerList = new LinkedList();
                    }
                    sListenerList.add(cVar);
                    if (sInitialized) {
                        MethodCollector.m26664o(8837);
                        return;
                    }
                    sIsDebug = z;
                    sWorkExecutorService = executorService;
                    sInitialized = true;
                    sContext = context;
                    sConfig = new C13528b();
                    if (context instanceof Application) {
                        C13530a aVar2 = C13530a.C13531a.f32932a;
                        Application application = (Application) context;
                        application.unregisterActivityLifecycleCallbacks(aVar2);
                        application.registerActivityLifecycleCallbacks(aVar2);
                    }
                    if (aVar != null) {
                        C13558e.m24361a(context, aVar);
                        C13558e.f32991b.execute(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: INVOKE  
                              (wrap: java.util.concurrent.ExecutorService : 0x004e: SGET  (r1v0 java.util.concurrent.ExecutorService) =  com.bytedance.common.jato.e.b java.util.concurrent.ExecutorService)
                              (wrap: com.bytedance.common.jato.e$3 : 0x0052: CONSTRUCTOR  (r0v7 com.bytedance.common.jato.e$3) = 
                              (wrap: long : 0x004d: ARITH  (r2v1 long) = (wrap: long : 0x0049: INVOKE  (r2v0 long) =  type: STATIC call: java.lang.System.currentTimeMillis():long) - (r4v0 'currentTimeMillis' long))
                             call: com.bytedance.common.jato.e.3.<init>(long):void type: CONSTRUCTOR)
                             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.Jato.init(android.content.Context, boolean, com.bytedance.common.jato.c, java.util.concurrent.ExecutorService, com.bytedance.common.jato.a):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: CONSTRUCTOR  (r0v7 com.bytedance.common.jato.e$3) = 
                              (wrap: long : 0x004d: ARITH  (r2v1 long) = (wrap: long : 0x0049: INVOKE  (r2v0 long) =  type: STATIC call: java.lang.System.currentTimeMillis():long) - (r4v0 'currentTimeMillis' long))
                             call: com.bytedance.common.jato.e.3.<init>(long):void type: CONSTRUCTOR in method: com.bytedance.common.jato.Jato.init(android.content.Context, boolean, com.bytedance.common.jato.c, java.util.concurrent.ExecutorService, com.bytedance.common.jato.a):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 30 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.e, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 36 more
                            */
                        /*
                            java.lang.Class<com.bytedance.common.jato.Jato> r7 = com.bytedance.common.jato.Jato.class
                            monitor-enter(r7)
                            r6 = 8837(0x2285, float:1.2383E-41)
                            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)     // Catch:{ all -> 0x005d }
                            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005d }
                            java.util.List<com.bytedance.common.jato.c> r0 = com.bytedance.common.jato.Jato.sListenerList     // Catch:{ all -> 0x005d }
                            if (r0 != 0) goto L_0x0017
                            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x005d }
                            r0.<init>()     // Catch:{ all -> 0x005d }
                            com.bytedance.common.jato.Jato.sListenerList = r0     // Catch:{ all -> 0x005d }
                        L_0x0017:
                            java.util.List<com.bytedance.common.jato.c> r0 = com.bytedance.common.jato.Jato.sListenerList     // Catch:{ all -> 0x005d }
                            r0.add(r10)     // Catch:{ all -> 0x005d }
                            boolean r0 = com.bytedance.common.jato.Jato.sInitialized     // Catch:{ all -> 0x005d }
                            if (r0 == 0) goto L_0x0025
                            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)     // Catch:{ all -> 0x005d }
                            monitor-exit(r7)
                            return
                        L_0x0025:
                            com.bytedance.common.jato.Jato.sIsDebug = r9
                            com.bytedance.common.jato.Jato.sWorkExecutorService = r11
                            r0 = 1
                            com.bytedance.common.jato.Jato.sInitialized = r0
                            com.bytedance.common.jato.Jato.sContext = r8
                            com.bytedance.common.jato.b r0 = new com.bytedance.common.jato.b
                            r0.<init>()
                            com.bytedance.common.jato.Jato.sConfig = r0
                            boolean r0 = r8 instanceof android.app.Application
                            if (r0 == 0) goto L_0x0044
                            com.bytedance.common.jato.b.a r1 = com.bytedance.common.jato.p903b.C13530a.C13531a.f32932a
                            r0 = r8
                            android.app.Application r0 = (android.app.Application) r0
                            r0.unregisterActivityLifecycleCallbacks(r1)
                            r0.registerActivityLifecycleCallbacks(r1)
                        L_0x0044:
                            if (r12 == 0) goto L_0x0058
                            com.bytedance.common.jato.C13558e.m24361a(r8, r12)
                            long r2 = java.lang.System.currentTimeMillis()
                            long r2 = r2 - r4
                            java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.C13558e.f32991b
                            com.bytedance.common.jato.e$3 r0 = new com.bytedance.common.jato.e$3
                            r0.<init>(r2)
                            r1.execute(r0)
                        L_0x0058:
                            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
                            monitor-exit(r7)
                            return
                        L_0x005d:
                            r0 = move-exception
                            monitor-exit(r7)
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.Jato.init(android.content.Context, boolean, com.bytedance.common.jato.c, java.util.concurrent.ExecutorService, com.bytedance.common.jato.a):void");
                    }
                }
