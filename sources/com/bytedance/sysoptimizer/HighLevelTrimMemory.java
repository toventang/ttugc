package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class HighLevelTrimMemory {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    /* renamed from: com_bytedance_sysoptimizer_HighLevelTrimMemory_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42822x1ae6eeb5(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean disable();

    private HighLevelTrimMemory() {
    }

    static {
        Covode.recordClassIndex(26566);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (HighLevelTrimMemory.class) {
            MethodCollector.m26663i(7186);
            if (mOptimized) {
                MethodCollector.m26664o(7186);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean disable = disable();
                    mOptimized = disable;
                    MethodCollector.m26664o(7186);
                    return disable;
                } catch (UnsatisfiedLinkError e) {
                    m42822x1ae6eeb5(TAG, "failed to optimize, UnsatisfiedLinkError", e);
                }
            }
            MethodCollector.m26664o(7186);
            return false;
        }
    }
}
