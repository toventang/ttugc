package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MaliGpuExtIsSupportOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26577);
    }

    /* renamed from: com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42830xbc4d520f(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42831xbc4d5210(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (MaliGpuExtIsSupportOptimizer.class) {
            MethodCollector.m26663i(7961);
            if (sOptimized) {
                MethodCollector.m26664o(7961);
            } else if (Build.VERSION.SDK_INT != 21) {
                MethodCollector.m26664o(7961);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        if (optimize()) {
                            m42830xbc4d520f("MaliGpuExtIsSupportOpt", "opt for extIsSupport");
                        } else {
                            m42830xbc4d520f("MaliGpuExtIsSupportOpt", "opt failed");
                        }
                        sOptimized = true;
                        MethodCollector.m26664o(7961);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42831xbc4d5210("MaliGpuExtIsSupportOpt", "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(7961);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42831xbc4d5210("MaliGpuExtIsSupportOpt", "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(7961);
            }
        }
    }
}
