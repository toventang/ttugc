package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DvmDeadLockOptimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    /* renamed from: com_bytedance_sysoptimizer_DvmDeadLockOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42820xaa747fa5(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    private DvmDeadLockOptimizer() {
    }

    static {
        Covode.recordClassIndex(26556);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT != 19) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (DvmDeadLockOptimizer.class) {
            MethodCollector.m26663i(5786);
            if (mOptimized) {
                MethodCollector.m26664o(5786);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean optimize = optimize();
                    mOptimized = optimize;
                    MethodCollector.m26664o(5786);
                    return optimize;
                } catch (UnsatisfiedLinkError e) {
                    m42820xaa747fa5(TAG, "failed to optimize, UnsatisfiedLinkError", e);
                }
            }
            MethodCollector.m26664o(5786);
            return false;
        }
    }
}
