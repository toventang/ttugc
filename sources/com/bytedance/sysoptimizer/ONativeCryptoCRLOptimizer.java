package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ONativeCryptoCRLOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26582);
    }

    /* renamed from: com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42836xf8de724f(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42837xf8de724f(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (ONativeCryptoCRLOptimizer.class) {
            MethodCollector.m26663i(7824);
            if (sOptimized) {
                MethodCollector.m26664o(7824);
            } else if (Build.VERSION.SDK_INT != 27) {
                MethodCollector.m26664o(7824);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        if (optimize()) {
                            m42836xf8de724f("NativeCrypt", "hook succ");
                        } else {
                            m42836xf8de724f("NativeCrypt", "hook fail");
                        }
                        sOptimized = true;
                        MethodCollector.m26664o(7824);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42837xf8de724f("NativeCrypt", "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(7824);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42837xf8de724f("NativeCrypt", "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(7824);
            }
        }
    }
}
