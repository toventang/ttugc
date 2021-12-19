package com.bytedance.android.p126a.p127a.p135h;

import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p133f.C2633a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.a.a.h.a */
public final class C2640a {
    static {
        Covode.recordClassIndex(3028);
    }

    /* renamed from: a */
    public static String m7643a(String str) {
        C2633a aVar = C2628e.m7607d().f7906c;
        if (aVar != null && aVar.f7919b) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 1; i < stackTrace.length; i++) {
                try {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!(stackTraceElement.getClassName().equals(Thread.class.getCanonicalName()) || stackTraceElement.getClassName().equals(C2640a.class.getCanonicalName()))) {
                        return "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")#" + stackTraceElement.getMethodName() + ". " + str;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return str;
    }
}
