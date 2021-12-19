package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;

public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    static final /* synthetic */ boolean f198271a = true;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f198272b;

    /* renamed from: c */
    private final boolean f198273c;

    /* renamed from: d */
    private boolean f198274d;

    private static native void nativeReportJavaException(boolean z, Throwable th);

    private static native void nativeReportJavaStackTrace(String str);

    static {
        Covode.recordClassIndex(103348);
    }

    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.f198272b = uncaughtExceptionHandler;
        this.f198273c = z;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        MethodCollector.m26663i(4826);
        if (!this.f198274d) {
            this.f198274d = true;
            nativeReportJavaException(this.f198273c, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f198272b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        MethodCollector.m26664o(4826);
    }
}
