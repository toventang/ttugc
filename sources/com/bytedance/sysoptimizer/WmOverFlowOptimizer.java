package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class WmOverFlowOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26596);
    }

    /* renamed from: com_bytedance_sysoptimizer_WmOverFlowOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42854x13e8e94d(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (WmOverFlowOptimizer.class) {
            MethodCollector.m26663i(6608);
            if (mOptimized) {
                MethodCollector.m26664o(6608);
            } else if (Build.VERSION.SDK_INT <= 23 || Build.VERSION.SDK_INT > 25) {
                MethodCollector.m26664o(6608);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        optimize();
                        mOptimized = true;
                        MethodCollector.m26664o(6608);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42854x13e8e94d("WmOverFlowOptimizer", "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(6608);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42854x13e8e94d("WmOverFlowOptimizer", "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(6608);
            }
        }
    }
}
