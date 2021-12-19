package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AcodecHandler {
    private static volatile boolean mInit;

    static {
        Covode.recordClassIndex(26550);
    }

    /* renamed from: com_bytedance_sysoptimizer_AcodecHandler_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m42817x143defc9(String str, String str2) {
        return 0;
    }

    private static native void fixAcodecMessage();

    private static boolean inAndroid4x() {
        if (Build.VERSION.SDK_INT <= 20) {
            return true;
        }
        return false;
    }

    private static boolean inAndroid5x() {
        if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
            return true;
        }
        return false;
    }

    public static synchronized void fixAcodecMessage(Context context) {
        synchronized (AcodecHandler.class) {
            MethodCollector.m26663i(8881);
            if ((inAndroid4x() || inAndroid5x()) && SysOptimizer.loadOptimizerLibrary(context)) {
                m42817x143defc9("AcodecHandler", "handlerAcodecMessage");
                ByteHook.m7797a();
                fixAcodecMessage();
            }
            MethodCollector.m26664o(8881);
        }
    }
}
