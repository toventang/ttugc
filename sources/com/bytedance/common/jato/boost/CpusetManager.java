package com.bytedance.common.jato.boost;

import com.bytedance.common.jato.C13556d;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class CpusetManager {
    private static volatile int[] bigCoreNum;
    private static boolean isAlreadyPreload;
    private static AtomicBoolean isCpuSetWork = new AtomicBoolean(false);
    private static volatile int[] smallCoreNum;

    private static native void resetCpuSet();

    private static native void resetCpuSetTid(int i);

    private static native void setCpuSet(int[] iArr);

    private static native void setCpuSetTid(int i, int[] iArr);

    private static boolean loadLibrary() {
        return C13556d.m24356a();
    }

    static {
        Covode.recordClassIndex(15544);
    }

    public static void bindBigCore() {
        MethodCollector.m26663i(12992);
        if (!isCpuSetWork.get() || bigCoreNum == null) {
            Jato.getListener().mo21785a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSet(bigCoreNum);
            MethodCollector.m26664o(12992);
            return;
        }
        MethodCollector.m26664o(12992);
    }

    public static void bindLittleCore() {
        MethodCollector.m26663i(13081);
        if (!isCpuSetWork.get()) {
            Jato.getListener().mo21785a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSet(smallCoreNum);
            MethodCollector.m26664o(13081);
            return;
        }
        MethodCollector.m26664o(13081);
    }

    public static synchronized void preload() {
        synchronized (CpusetManager.class) {
            MethodCollector.m26663i(13086);
            if (isAlreadyPreload) {
                MethodCollector.m26664o(13086);
                return;
            }
            if (C13539c.m24320a()) {
                smallCoreNum = C13539c.f32940a;
                bigCoreNum = C13539c.f32941b;
                isCpuSetWork.set(true);
            }
            isAlreadyPreload = true;
            MethodCollector.m26664o(13086);
        }
    }

    public static void resetCoreBind() {
        MethodCollector.m26663i(13082);
        if (!isCpuSetWork.get()) {
            Jato.getListener().mo21785a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            resetCpuSet();
            MethodCollector.m26664o(13082);
            return;
        }
        MethodCollector.m26664o(13082);
    }

    public static void init(ExecutorService executorService) {
        executorService.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.CpusetManager.RunnableC135341 */

            static {
                Covode.recordClassIndex(15545);
            }

            public final void run() {
                CpusetManager.preload();
            }
        });
    }

    private static void debug(String str) {
        if (Jato.isDebug() && Jato.getListener() != null) {
            Jato.getListener().mo21785a(str);
        }
    }

    public static void bindBigCore(int i) {
        MethodCollector.m26663i(13083);
        if (!isCpuSetWork.get() || bigCoreNum == null) {
            Jato.getListener().mo21785a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSetTid(i, bigCoreNum);
            MethodCollector.m26664o(13083);
            return;
        }
        MethodCollector.m26664o(13083);
    }

    public static void bindLittleCore(int i) {
        MethodCollector.m26663i(13084);
        if (!isCpuSetWork.get() || smallCoreNum == null) {
            Jato.getListener().mo21785a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSetTid(i, smallCoreNum);
            MethodCollector.m26664o(13084);
            return;
        }
        MethodCollector.m26664o(13084);
    }

    public static void resetCoreBind(int i) {
        MethodCollector.m26663i(13085);
        if (!isCpuSetWork.get()) {
            Jato.getListener().mo21785a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            resetCpuSetTid(i);
            MethodCollector.m26664o(13085);
            return;
        }
        MethodCollector.m26664o(13085);
    }
}
