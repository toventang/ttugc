package com.bytedance.common.jato.jit;

import android.os.Looper;
import com.bytedance.common.jato.C13556d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class JitSuspend {

    /* renamed from: a */
    private static volatile boolean f33019a;

    static {
        Covode.recordClassIndex(15597);
    }

    private static native void nativeBegin();

    private static native void nativeEnd();

    private static native boolean nativeInit();

    /* renamed from: b */
    public static synchronized void m24389b() {
        synchronized (JitSuspend.class) {
            MethodCollector.m26663i(12459);
            if (!f33019a) {
                MethodCollector.m26664o(12459);
                return;
            }
            nativeBegin();
            MethodCollector.m26664o(12459);
        }
    }

    /* renamed from: c */
    public static synchronized void m24390c() {
        synchronized (JitSuspend.class) {
            MethodCollector.m26663i(12570);
            if (!f33019a) {
                MethodCollector.m26664o(12570);
                return;
            }
            nativeEnd();
            MethodCollector.m26664o(12570);
        }
    }

    /* renamed from: a */
    public static synchronized void m24388a() {
        synchronized (JitSuspend.class) {
            MethodCollector.m26663i(12343);
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                if (!C13556d.m24356a()) {
                    MethodCollector.m26664o(12343);
                    return;
                } else if (f33019a) {
                    MethodCollector.m26664o(12343);
                    return;
                } else {
                    f33019a = nativeInit();
                }
            }
            MethodCollector.m26664o(12343);
        }
    }
}
