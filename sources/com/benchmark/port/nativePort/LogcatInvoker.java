package com.benchmark.port.nativePort;

import com.benchmark.tools.C2512a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LogcatInvoker {
    private static native void nativeSetLogLevel(byte b);

    static {
        Covode.recordClassIndex(2860);
        C2512a.m7381a();
        if (!C2512a.f7621a) {
            C2512a.m7381a();
        }
    }

    /* renamed from: a */
    public static void m7366a(byte b) {
        MethodCollector.m26663i(7424);
        if (C2512a.f7621a) {
            nativeSetLogLevel(b);
        }
        MethodCollector.m26664o(7424);
    }
}
