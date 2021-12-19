package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ArtOptimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    /* renamed from: com_bytedance_sysoptimizer_ArtOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42818xff8136cc(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean disableDumpOatFile(int i);

    private static native boolean increaseSuspendTime(int i);

    private ArtOptimizer() {
    }

    static {
        Covode.recordClassIndex(26551);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 23) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optSuspendTimeout(Context context) {
        synchronized (ArtOptimizer.class) {
            MethodCollector.m26663i(6091);
            if (mOptimized) {
                MethodCollector.m26664o(6091);
                return true;
            } else if (loadOptimizerOnNeed(context)) {
                try {
                    boolean increaseSuspendTime = increaseSuspendTime(Build.VERSION.SDK_INT);
                    mOptimized = increaseSuspendTime;
                    MethodCollector.m26664o(6091);
                    return increaseSuspendTime;
                } catch (UnsatisfiedLinkError e) {
                    m42818xff8136cc(TAG, "UnsatisfiedLinkError", e);
                    MethodCollector.m26664o(6091);
                    return false;
                }
            } else {
                MethodCollector.m26664o(6091);
                return false;
            }
        }
    }

    public static synchronized boolean disableDumpOatFileForANR(Context context) {
        synchronized (ArtOptimizer.class) {
            MethodCollector.m26663i(6238);
            if (mOptimized) {
                MethodCollector.m26664o(6238);
                return true;
            } else if (Build.VERSION.SDK_INT != 29 || !SysOptimizer.loadOptimizerLibrary(context)) {
                MethodCollector.m26664o(6238);
                return false;
            } else {
                try {
                    boolean disableDumpOatFile = disableDumpOatFile(Build.VERSION.SDK_INT);
                    mOptimized = disableDumpOatFile;
                    MethodCollector.m26664o(6238);
                    return disableDumpOatFile;
                } catch (UnsatisfiedLinkError e) {
                    m42818xff8136cc(TAG, "UnsatisfiedLinkError", e);
                    MethodCollector.m26664o(6238);
                    return false;
                }
            }
        }
    }
}
