package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;

public class SysOptimizer {
    private static boolean mHookRefreshed = false;
    private static ArrayList<UnsatisfiedLinkError> mLoadError = new ArrayList<>();
    private static volatile boolean mOptimzerLibLoaded;

    /* renamed from: com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42849x1c85e0a1(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42850x1c85e0a2(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42851x1c85e0a2(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void refreshHook();

    public static ArrayList<UnsatisfiedLinkError> getLoadLibraryError() {
        return mLoadError;
    }

    static {
        Covode.recordClassIndex(26592);
    }

    public static synchronized void hookOptimizerEnable() {
        synchronized (SysOptimizer.class) {
            MethodCollector.m26663i(7826);
            if (!mOptimzerLibLoaded || mHookRefreshed) {
                MethodCollector.m26664o(7826);
                return;
            }
            try {
                refreshHook();
                mHookRefreshed = true;
                MethodCollector.m26664o(7826);
            } catch (UnsatisfiedLinkError unused) {
                m42850x1c85e0a2("SYSOPTIMIZER", "refresh xhook failed.");
                MethodCollector.m26664o(7826);
            }
        }
    }

    /* renamed from: com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m42848x5847ca32(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static boolean loadOptimizerLibrary(Context context) {
        MethodCollector.m26663i(7688);
        if (mOptimzerLibLoaded) {
            MethodCollector.m26664o(7688);
            return true;
        }
        synchronized (SysOptimizer.class) {
            try {
                if (mOptimzerLibLoaded) {
                    return true;
                }
                if (context == null) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        m42848x5847ca32("sysoptimizer");
                    } catch (UnsatisfiedLinkError e) {
                        m42850x1c85e0a2("SYSOPTIMIZER", "failed to load SYSOPTIMIZER");
                        m42851x1c85e0a2("SYSOPTIMIZER", "", e);
                        mLoadError.add(e);
                        MethodCollector.m26664o(7688);
                        return false;
                    } catch (OverlappingFileLockException e2) {
                        m42851x1c85e0a2("SYSOPTIMIZER", "failed to load so caused by OverlappingFileLockException:", e2);
                        MethodCollector.m26664o(7688);
                        return false;
                    }
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    Librarian.m38963a("sysoptimizer", context);
                }
                m42849x1c85e0a1("SYSOPTIMIZER", "load SYSOPTIMIZER success");
                mOptimzerLibLoaded = true;
                MethodCollector.m26664o(7688);
                return true;
            } finally {
                MethodCollector.m26664o(7688);
            }
        }
    }
}
