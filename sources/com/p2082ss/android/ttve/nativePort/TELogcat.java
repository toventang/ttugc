package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ttve.nativePort.TELogcat */
public class TELogcat {
    private static native void nativeLog(byte b, String str, String str2);

    private static native void nativeSetLogLevel(byte b);

    static {
        Covode.recordClassIndex(37303);
        C30731d.m63117b();
    }

    public static void setLogLevel(byte b) {
        MethodCollector.m26663i(910);
        nativeSetLogLevel(b);
        MethodCollector.m26664o(910);
    }

    public static void Log(byte b, String str, String str2) {
        MethodCollector.m26663i(907);
        nativeLog(b, str, str2);
        MethodCollector.m26664o(907);
    }
}
