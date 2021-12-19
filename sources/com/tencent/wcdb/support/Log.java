package com.tencent.wcdb.support;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class Log {

    /* renamed from: a */
    private static LogCallback f197776a;

    public interface LogCallback {
        static {
            Covode.recordClassIndex(103166);
        }

        void println(int i, String str, String str2);
    }

    static {
        Covode.recordClassIndex(103165);
    }

    private static native void nativePrintLn(int i, String str, String str2);

    private static native void nativeSetLogger(int i, LogCallback logCallback);

    private Log() {
    }

    /* renamed from: a */
    public static void m151458a(String str, String str2, Object... objArr) {
        m151457a(6, str, C1764a.m5928a(str2, objArr));
    }

    /* renamed from: b */
    public static void m151459b(String str, String str2, Object... objArr) {
        m151457a(4, str, C1764a.m5928a(str2, objArr));
    }

    /* renamed from: a */
    public static void m151457a(int i, String str, String str2) {
        MethodCollector.m26663i(4494);
        LogCallback logCallback = f197776a;
        if (logCallback != null) {
            logCallback.println(i, str, str2);
            MethodCollector.m26664o(4494);
            return;
        }
        nativePrintLn(i, str, str2);
        MethodCollector.m26664o(4494);
    }
}
