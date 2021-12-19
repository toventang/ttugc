package com.benchmark.port.nativePort;

import com.benchmark.p117a.C2413a;
import com.benchmark.tools.C2512a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ApplogUtilsInvoker {
    public static native void nativeInit();

    static {
        Covode.recordClassIndex(2859);
        C2512a.m7381a();
        if (!C2512a.f7621a) {
            C2512a.m7381a();
        }
    }

    public static void Init() {
        MethodCollector.m26663i(9789);
        if (C2512a.f7621a) {
            nativeInit();
        }
        MethodCollector.m26664o(9789);
    }

    public static void onNativeCallback_onAppLogJson(String str, String str2) {
        C2413a.m7258a(str, str2);
    }
}
