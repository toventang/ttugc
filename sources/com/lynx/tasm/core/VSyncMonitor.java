package com.lynx.tasm.core;

import android.view.Choreographer;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

public class VSyncMonitor {

    /* renamed from: a */
    public static WeakReference<WindowManager> f67788a;

    static {
        Covode.recordClassIndex(34842);
    }

    public static native void nativeOnVSync(long j, long j2, long j3);

    public static void request(final long j) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            /* class com.lynx.tasm.core.VSyncMonitor.Choreographer$FrameCallbackC287441 */

            static {
                Covode.recordClassIndex(34843);
            }

            public final void doFrame(long j) {
                long j2;
                MethodCollector.m26663i(1760);
                if (VSyncMonitor.f67788a.get() != null) {
                    double refreshRate = (double) VSyncMonitor.f67788a.get().getDefaultDisplay().getRefreshRate();
                    Double.isNaN(refreshRate);
                    j2 = (long) (1.0E9d / refreshRate);
                } else {
                    j2 = 16666666;
                }
                VSyncMonitor.nativeOnVSync(j, j, j + j2);
                MethodCollector.m26664o(1760);
            }
        });
    }
}
