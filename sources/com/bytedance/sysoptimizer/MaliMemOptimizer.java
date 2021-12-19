package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MaliMemOptimizer {
    private static volatile boolean hasEnableMaliGLErrorSkip;
    private static volatile boolean hasSetTimeMillsDelayed;

    static {
        Covode.recordClassIndex(26578);
    }

    private static native void enable_gl_error_skip(boolean z);

    private static native void set_time_mills_delayed(int i, int i2);

    private MaliMemOptimizer() {
    }

    public static synchronized void enableMaliGLErrorSkip(Context context, boolean z) {
        synchronized (MaliMemOptimizer.class) {
            MethodCollector.m26663i(7806);
            if (hasEnableMaliGLErrorSkip) {
                MethodCollector.m26664o(7806);
                return;
            }
            ByteHook.m7797a();
            SysOptimizer.loadOptimizerLibrary(context);
            enable_gl_error_skip(z);
            hasEnableMaliGLErrorSkip = true;
            MethodCollector.m26664o(7806);
        }
    }

    public static synchronized void setTimeMillsDelayed(int i, int i2, Context context) {
        synchronized (MaliMemOptimizer.class) {
            MethodCollector.m26663i(7669);
            if (hasSetTimeMillsDelayed) {
                MethodCollector.m26664o(7669);
                return;
            }
            ByteHook.m7797a();
            SysOptimizer.loadOptimizerLibrary(context);
            set_time_mills_delayed(i, i2);
            hasSetTimeMillsDelayed = true;
            MethodCollector.m26664o(7669);
        }
    }
}
