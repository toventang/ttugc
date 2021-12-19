package com.p2082ss.avframework.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.utils.ExceptionTracer */
public class ExceptionTracer extends Throwable {
    static {
        Covode.recordClassIndex(100727);
    }

    public static void onJniException(Object obj) {
        if (obj != null && (obj instanceof Throwable)) {
            AVLog.logKibana(7, "Exception", "Jni Exception", (Throwable) obj);
            AVLog.ioe("Exception", "Jni Exception", (Throwable) obj);
        }
    }
}
