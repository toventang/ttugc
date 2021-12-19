package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class KGetCookieOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26569);
    }

    /* renamed from: com_bytedance_sysoptimizer_KGetCookieOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42826xf8a81995(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_KGetCookieOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42827xf8a81996(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (KGetCookieOptimizer.class) {
            MethodCollector.m26663i(7025);
            if (sOptimized) {
                MethodCollector.m26664o(7025);
            } else if (Build.VERSION.SDK_INT != 19) {
                MethodCollector.m26664o(7025);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        if (optimize()) {
                            m42826xf8a81995("KGetCookieOptimizer", "GetCookie opt succ");
                        }
                        sOptimized = true;
                        MethodCollector.m26664o(7025);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42827xf8a81996("KGetCookieOptimizer", "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(7025);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42827xf8a81996("KGetCookieOptimizer", "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(7025);
            }
        }
    }
}
