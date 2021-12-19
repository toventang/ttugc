package com.bytedance.common.jato.boost;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.jato.C13556d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ThreadBoostManager {
    static {
        Covode.recordClassIndex(15547);
    }

    public static native void maskMemoryInfo();

    private static boolean loadLibrary() {
        return C13556d.m24356a();
    }

    public static void delayMaskMemoryInfo() {
        if (loadLibrary()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.bytedance.common.jato.boost.ThreadBoostManager.RunnableC135351 */

                static {
                    Covode.recordClassIndex(15548);
                }

                public final void run() {
                    new Thread(new Runnable() {
                        /* class com.bytedance.common.jato.boost.ThreadBoostManager.RunnableC135351.RunnableC135361 */

                        static {
                            Covode.recordClassIndex(15549);
                        }

                        public final void run() {
                            MethodCollector.m26663i(10974);
                            ThreadBoostManager.maskMemoryInfo();
                            MethodCollector.m26664o(10974);
                        }
                    }).start();
                }
            }, 10000);
        }
    }
}
