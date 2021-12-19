package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RedmiTypeFaceOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26585);
    }

    /* renamed from: com_bytedance_sysoptimizer_RedmiTypeFaceOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42842x7d7567cb(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize(boolean z);

    public static void fixOnAndroidQ(Context context) {
        fixOnAndroidQ(context, false);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fixOnAndroidQ(Context context, boolean z) {
        MethodCollector.m26663i(7510);
        if (mOptimized) {
            MethodCollector.m26664o(7510);
        } else if (Build.VERSION.SDK_INT != 29) {
            MethodCollector.m26664o(7510);
        } else {
            if (loadOptimizerOnNeed(context)) {
                try {
                    optimize(z);
                    mOptimized = true;
                    MethodCollector.m26664o(7510);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    m42842x7d7567cb("RedmiTypeFaceOptimizer", "UnsatisfiedLinkError", e);
                }
            }
            MethodCollector.m26664o(7510);
        }
    }
}
