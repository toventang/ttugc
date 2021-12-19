package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class FdSanFatalSwitch {
    private static volatile boolean mFdSanFatalSwitch;

    static {
        Covode.recordClassIndex(26562);
    }

    private static native void openAndroidQFdsan();

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return SysOptimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static synchronized void openAndroidQFdsan(Context context) {
        synchronized (FdSanFatalSwitch.class) {
            MethodCollector.m26663i(5625);
            if (!mFdSanFatalSwitch && loadOptimizerOnNeed(context)) {
                openAndroidQFdsan();
                mFdSanFatalSwitch = true;
            }
            MethodCollector.m26664o(5625);
        }
    }
}
