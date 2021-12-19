package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class JitGetMethodHashOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26568);
    }

    /* renamed from: com_bytedance_sysoptimizer_JitGetMethodHashOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42825xd6ccb8b5(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fix(Context context) {
        MethodCollector.m26663i(8245);
        if (mOptimized) {
            MethodCollector.m26664o(8245);
            return;
        }
        if (loadOptimizerOnNeed(context)) {
            try {
                optimize();
                mOptimized = true;
                MethodCollector.m26664o(8245);
                return;
            } catch (UnsatisfiedLinkError e) {
                m42825xd6ccb8b5("JitGetMethodHashOptimizer", "UnsatisfiedLinkError", e);
            }
        }
        MethodCollector.m26664o(8245);
    }
}
