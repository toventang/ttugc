package com.bytedance.sysoptimizer.fake.name;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.SysOptimizer;

public class SmFakeNameHandler {
    private static String TAG = "SYSOPTIMIZER";
    private static volatile boolean inited;

    /* renamed from: com_bytedance_sysoptimizer_fake_name_SmFakeNameHandler_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42855x3f7a0336(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void replace(int i);

    static {
        Covode.recordClassIndex(26597);
    }

    private static boolean inAndroid5x() {
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 21) {
            return true;
        }
        return false;
    }

    private static boolean shouldFix() {
        if (!inAndroid5x() || !Build.MODEL.startsWith("SM-")) {
            return false;
        }
        return true;
    }

    public static synchronized void start(Context context) {
        synchronized (SmFakeNameHandler.class) {
            MethodCollector.m26663i(7184);
            if (!shouldFix()) {
                MethodCollector.m26664o(7184);
            } else if (inited) {
                MethodCollector.m26664o(7184);
            } else {
                inited = true;
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        replace(Build.VERSION.SDK_INT);
                        MethodCollector.m26664o(7184);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        m42855x3f7a0336(TAG, "UnsatisfiedLinkError", e);
                        MethodCollector.m26664o(7184);
                        return;
                    } catch (NoSuchMethodError e2) {
                        m42855x3f7a0336(TAG, "NoSuchMethodError", e2);
                    }
                }
                MethodCollector.m26664o(7184);
            }
        }
    }
}
