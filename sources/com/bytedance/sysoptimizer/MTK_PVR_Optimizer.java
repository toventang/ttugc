package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MTK_PVR_Optimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;
    private static boolean sAlwaysCatchSIGSEGV;
    private static boolean sCatchSIGSEGV;

    /* renamed from: com_bytedance_sysoptimizer_MTK_PVR_Optimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42829xd8a3f857(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void optimize();

    private static native void setCatchOption(boolean z);

    static {
        Covode.recordClassIndex(26576);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void setAlwaysCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            MethodCollector.m26663i(8109);
            if (sAlwaysCatchSIGSEGV == z) {
                MethodCollector.m26664o(8109);
                return;
            }
            sAlwaysCatchSIGSEGV = z;
            if (mOptimized) {
                if (z || sCatchSIGSEGV) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setCatchOption(z2);
            }
            MethodCollector.m26664o(8109);
        }
    }

    public static synchronized void setCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            MethodCollector.m26663i(8107);
            if (sCatchSIGSEGV == z) {
                MethodCollector.m26664o(8107);
                return;
            }
            sCatchSIGSEGV = z;
            if (mOptimized) {
                if (sAlwaysCatchSIGSEGV || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setCatchOption(z2);
            }
            MethodCollector.m26664o(8107);
        }
    }

    public static synchronized void enable(Context context) {
        boolean z;
        synchronized (MTK_PVR_Optimizer.class) {
            MethodCollector.m26663i(8392);
            if (mOptimized) {
                MethodCollector.m26664o(8392);
                return;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    if (!sAlwaysCatchSIGSEGV) {
                        if (!sCatchSIGSEGV) {
                            z = false;
                            setCatchOption(z);
                            optimize();
                            mOptimized = true;
                            MethodCollector.m26664o(8392);
                            return;
                        }
                    }
                    z = true;
                    setCatchOption(z);
                    optimize();
                    mOptimized = true;
                    MethodCollector.m26664o(8392);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    m42829xd8a3f857(TAG, "UnsatisfiedLinkError", e);
                }
            }
            MethodCollector.m26664o(8392);
        }
    }
}
