package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NativeBitmap {
    public static boolean mEnabled;
    private static boolean mStarted;

    static {
        Covode.recordClassIndex(26579);
    }

    /* renamed from: com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42832x60ef3adf(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42833x60ef3ae0(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42834x60ef3ae0(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean start(int i);

    private NativeBitmap() {
    }

    public static double getJavaHeapUtilizaiton() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        double d = (double) Runtime.getRuntime().totalMemory();
        Double.isNaN(d);
        double d2 = (double) maxMemory;
        Double.isNaN(d2);
        return (d * 1.0d) / d2;
    }

    public static synchronized boolean enable(Context context) {
        synchronized (NativeBitmap.class) {
            MethodCollector.m26663i(7814);
            if (Build.VERSION.SDK_INT >= 22) {
                if (Build.VERSION.SDK_INT <= 25) {
                    boolean realStart = realStart(context);
                    MethodCollector.m26664o(7814);
                    return realStart;
                }
            }
            MethodCollector.m26664o(7814);
            return false;
        }
    }

    public static synchronized boolean realStart(Context context) {
        synchronized (NativeBitmap.class) {
            MethodCollector.m26663i(7949);
            if (mEnabled) {
                MethodCollector.m26664o(7949);
                return true;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    mEnabled = start(Build.VERSION.SDK_INT);
                    m42832x60ef3adf("NativeBitmap", "NativeBitmap.enable: " + mEnabled);
                    boolean z = mEnabled;
                    MethodCollector.m26664o(7949);
                    return z;
                } catch (UnsatisfiedLinkError e) {
                    m42834x60ef3ae0("NativeBitmap", "UnsatisfiedLinkError", e);
                }
            }
            MethodCollector.m26664o(7949);
            return false;
        }
    }

    public static synchronized boolean enable(final Context context, final long j, final double d, long j2) {
        synchronized (NativeBitmap.class) {
            MethodCollector.m26663i(7947);
            if (Build.VERSION.SDK_INT < 22 || Build.VERSION.SDK_INT > 25) {
                MethodCollector.m26664o(7947);
                return false;
            } else if (Runtime.getRuntime().maxMemory() > j2) {
                m42833x60ef3ae0("NativeBitmap", "disabled: The java heap is big enough. ");
                MethodCollector.m26664o(7947);
                return false;
            } else if (mStarted || mEnabled) {
                MethodCollector.m26664o(7947);
                return true;
            } else {
                mStarted = true;
                new Thread(null, new Runnable() {
                    /* class com.bytedance.sysoptimizer.NativeBitmap.RunnableC227191 */

                    static {
                        Covode.recordClassIndex(26580);
                    }

                    public final void run() {
                        MethodCollector.m26663i(7963);
                        while (true) {
                            try {
                                Thread.sleep(j);
                                if (NativeBitmap.mEnabled) {
                                    MethodCollector.m26664o(7963);
                                    return;
                                } else if (NativeBitmap.getJavaHeapUtilizaiton() >= d) {
                                    NativeBitmap.realStart(context);
                                    MethodCollector.m26664o(7963);
                                    return;
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }, "NativeBitmap", 262144).start();
                MethodCollector.m26664o(7947);
                return true;
            }
        }
    }
}
