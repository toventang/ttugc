package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RegexMatcherOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26586);
    }

    /* renamed from: com_bytedance_sysoptimizer_RegexMatcherOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42843xbd82c699(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_RegexMatcherOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42844xbd82c69a(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (RegexMatcherOptimizer.class) {
            MethodCollector.m26663i(7068);
            if (sOptimized) {
                MethodCollector.m26664o(7068);
            } else if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        m42843xbd82c699("RegexMatcherOptimizer", "opt ret = " + optimize());
                        optimize();
                        sOptimized = true;
                        MethodCollector.m26664o(7068);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42844xbd82c69a("RegexMatcherOptimizer", "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(7068);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42844xbd82c69a("RegexMatcherOptimizer", "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(7068);
            } else {
                MethodCollector.m26664o(7068);
            }
        }
    }
}
