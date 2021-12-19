package com.lynx.tasm.base;

import android.os.Trace;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.C28180a;
import com.lynx.tasm.LynxEnv;

public class TraceEvent {
    static {
        Covode.recordClassIndex(34447);
    }

    private static native void nativeBeginSection(long j, String str);

    private static native boolean nativeCategoryEnabled(long j);

    private static native void nativeEndSection(long j, String str);

    private static native void nativeFPSTrace(long j, long j2);

    private static native void nativeFlush();

    private static native void nativeInstant(long j, String str, long j2, String str2);

    private static native boolean nativeRegisterTraceBackend(long j);

    private static native void nativeScreenshot(String str);

    /* renamed from: a */
    public static boolean m56868a() {
        if (C28180a.f65961c.booleanValue() || LynxEnv.m56706b().f66641h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m56865a(String str) {
        m56864a(0, str);
    }

    /* renamed from: b */
    public static void m56870b(String str) {
        m56869b(0, str);
    }

    /* renamed from: a */
    public static void m56867a(String str, String str2) {
        m56866a(str, System.nanoTime() / 1000, str2);
    }

    /* renamed from: a */
    public static void m56864a(long j, String str) {
        MethodCollector.m26663i(1398);
        if (m56868a()) {
            if (!C28180a.f65962d.booleanValue()) {
                nativeBeginSection(j, str);
                MethodCollector.m26664o(1398);
                return;
            }
            Trace.beginSection(str);
        }
        MethodCollector.m26664o(1398);
    }

    /* renamed from: b */
    public static void m56869b(long j, String str) {
        MethodCollector.m26663i(1401);
        if (m56868a()) {
            if (!C28180a.f65962d.booleanValue()) {
                nativeEndSection(j, str);
                MethodCollector.m26664o(1401);
                return;
            }
            Trace.endSection();
        }
        MethodCollector.m26664o(1401);
    }

    /* renamed from: a */
    private static void m56866a(String str, long j, String str2) {
        MethodCollector.m26663i(1418);
        if (m56868a()) {
            if (!C28180a.f65962d.booleanValue()) {
                nativeInstant(1, str, j, str2);
                MethodCollector.m26664o(1418);
                return;
            }
            Trace.beginSection(str);
            Trace.endSection();
        }
        MethodCollector.m26664o(1418);
    }
}
