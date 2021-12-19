package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class VMDebugDumpHprofOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26595);
    }

    /* renamed from: com_bytedance_sysoptimizer_VMDebugDumpHprofOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42852x1710b433(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_VMDebugDumpHprofOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42853x1710b434(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (VMDebugDumpHprofOptimizer.class) {
            MethodCollector.m26663i(7324);
            if (sOptimized) {
                MethodCollector.m26664o(7324);
                return;
            }
            if ((Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 23) && SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    m42852x1710b433("VMDebugDump", "opt ret = " + optimize());
                    optimize();
                    sOptimized = true;
                    MethodCollector.m26664o(7324);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    m42853x1710b434("VMDebugDump", "UnsatisfiedLinkError", e);
                    MethodCollector.m26664o(7324);
                    return;
                } catch (NoSuchMethodError e2) {
                    m42853x1710b434("VMDebugDump", "NoSuchMethodError", e2);
                }
            }
            MethodCollector.m26664o(7324);
        }
    }
}
