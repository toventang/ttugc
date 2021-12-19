package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class CfiCheckOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26555);
    }

    /* renamed from: com_bytedance_sysoptimizer_CfiCheckOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42819x17a2c323(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean disableCfiCheck();

    private CfiCheckOptimizer() {
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT > 30 || !Process.is64Bit()) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (CfiCheckOptimizer.class) {
            MethodCollector.m26663i(5780);
            if (mOptimized) {
                MethodCollector.m26664o(5780);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean disableCfiCheck = disableCfiCheck();
                    mOptimized = disableCfiCheck;
                    MethodCollector.m26664o(5780);
                    return disableCfiCheck;
                } catch (UnsatisfiedLinkError e) {
                    m42819x17a2c323("CfiCheckOptimizer", "failed to optimize, UnsatisfiedLinkError", e);
                }
            }
            MethodCollector.m26664o(5780);
            return false;
        }
    }
}
