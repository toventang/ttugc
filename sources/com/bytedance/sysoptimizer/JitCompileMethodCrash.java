package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class JitCompileMethodCrash {
    private static String TAG = "OPTIMIZER-JIT";
    private static boolean mOptimized;

    /* renamed from: com_bytedance_sysoptimizer_JitCompileMethodCrash_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42823xdeab8618(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_JitCompileMethodCrash_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42824xdeab8618(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize(int i);

    private JitCompileMethodCrash() {
    }

    static {
        Covode.recordClassIndex(26567);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 27 || Build.VERSION.SDK_INT > 30) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (JitCompileMethodCrash.class) {
            MethodCollector.m26663i(8412);
            if (mOptimized) {
                MethodCollector.m26664o(8412);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean optimize = optimize(Build.VERSION.SDK_INT);
                    mOptimized = optimize;
                    MethodCollector.m26664o(8412);
                    return optimize;
                } catch (UnsatisfiedLinkError e) {
                    m42824xdeab8618(TAG, "failed to optimize, UnsatisfiedLinkError", e);
                }
            }
            m42823xdeab8618(TAG, "optimize failed.");
            MethodCollector.m26664o(8412);
            return false;
        }
    }
}
