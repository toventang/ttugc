package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NougatJitCompileOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26581);
    }

    /* renamed from: com_bytedance_sysoptimizer_NougatJitCompileOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42835x36a34c21(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void optimize();

    public static synchronized void fix(Context context) {
        synchronized (NougatJitCompileOptimizer.class) {
            MethodCollector.m26663i(7829);
            if (sOptimized) {
                MethodCollector.m26664o(7829);
            } else if (Build.VERSION.SDK_INT != 24) {
                MethodCollector.m26664o(7829);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        optimize();
                        sOptimized = true;
                        MethodCollector.m26664o(7829);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42835x36a34c21("NJitCompileOptimizer", "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(7829);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42835x36a34c21("NJitCompileOptimizer", "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(7829);
            }
        }
    }
}
