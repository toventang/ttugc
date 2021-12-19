package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.aa */
public class C11135aa extends RuntimeException {
    static {
        Covode.recordClassIndex(12762);
    }

    public final synchronized Throwable fillInStackTrace() {
        MethodCollector.m26663i(8917);
        if (C11168q.f26784b) {
            Throwable fillInStackTrace = super.fillInStackTrace();
            MethodCollector.m26664o(8917);
            return fillInStackTrace;
        }
        MethodCollector.m26664o(8917);
        return this;
    }

    public C11135aa(String str) {
        super(str);
    }
}
