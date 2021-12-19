package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class StageFrightAndroid4Optimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26591);
    }

    /* renamed from: com_bytedance_sysoptimizer_StageFrightAndroid4Optimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42847x9fb7d316(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fixStageFrightAndroid4(Context context) {
        MethodCollector.m26663i(6760);
        if (mOptimized) {
            MethodCollector.m26664o(6760);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MethodCollector.m26664o(6760);
        } else {
            if (loadOptimizerOnNeed(context)) {
                try {
                    optimize();
                    mOptimized = true;
                    MethodCollector.m26664o(6760);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    m42847x9fb7d316("StageFrightOptimizer", "UnsatisfiedLinkError", e);
                }
            }
            MethodCollector.m26664o(6760);
        }
    }
}
