package com.p2082ss.android.p2092ad.splash.p2109f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;

/* renamed from: com.ss.android.ad.splash.f.g */
public class C29644g {

    /* renamed from: a */
    public static int f70704a = 2;

    static {
        Covode.recordClassIndex(36040);
    }

    /* renamed from: a */
    public static void m59685a() {
        if (f70704a <= 6) {
            m59687b();
        }
    }

    /* renamed from: b */
    private static String m59687b() {
        if (!C29495h.f70243s) {
            return "";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 1; i < stackTrace.length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (!(className.equals(Thread.class.getCanonicalName()) || className.equals(C29644g.class.getCanonicalName()))) {
                return "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")#" + stackTraceElement.getMethodName() + ". ";
            }
        }
        return "";
    }

    /* renamed from: b */
    public static void m59688b(String str) {
        if (str != null && f70704a <= 3) {
            m59687b();
        }
    }

    /* renamed from: c */
    public static void m59689c(String str) {
        if (str != null && f70704a <= 4) {
            m59687b();
        }
    }

    /* renamed from: d */
    public static void m59690d(String str) {
        if (str != null && f70704a <= 5) {
            m59687b();
        }
    }

    /* renamed from: e */
    public static void m59691e(String str) {
        if (str != null && f70704a <= 6) {
            m59687b();
        }
    }

    /* renamed from: a */
    public static void m59686a(String str) {
        m59688b(m59687b() + str);
    }
}
