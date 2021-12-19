package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DvmGlesOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26557);
    }

    /* renamed from: com_bytedance_sysoptimizer_DvmGlesOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42821x9e7c0281(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (DvmGlesOptimizer.class) {
            MethodCollector.m26663i(8574);
            if (mOptimized) {
                MethodCollector.m26664o(8574);
            } else if (Build.VERSION.SDK_INT != 19) {
                MethodCollector.m26664o(8574);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        optimize();
                        mOptimized = true;
                        MethodCollector.m26664o(8574);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42821x9e7c0281("DvmGlesOptimizer", "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(8574);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42821x9e7c0281("DvmGlesOptimizer", "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(8574);
            }
        }
    }
}
