package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DvmOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26558);
    }

    private static native void optLinearAllocBuffer(int i);

    private static native void startHookDvmFunc();

    private DvmOptimizer() {
    }

    public static void optDvmLinearAllocBuffer(Context context) {
        optDvmLinearAllocBuffer(context, 67108864);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT <= 19) {
            return SysOptimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static void hookDvmLinearAllocFunc(Context context) {
        MethodCollector.m26663i(5771);
        if (loadOptimizerOnNeed(context)) {
            startHookDvmFunc();
        }
        MethodCollector.m26664o(5771);
    }

    public static synchronized void optDvmLinearAllocBuffer(Context context, int i) {
        synchronized (DvmOptimizer.class) {
            MethodCollector.m26663i(5643);
            if (sOptimized) {
                MethodCollector.m26664o(5643);
                return;
            }
            if (loadOptimizerOnNeed(context)) {
                optLinearAllocBuffer(i);
                sOptimized = true;
            }
            MethodCollector.m26664o(5643);
        }
    }
}
