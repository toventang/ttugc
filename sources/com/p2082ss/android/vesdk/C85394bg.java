package com.p2082ss.android.vesdk;

import android.os.Trace;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.vesdk.bg */
public final class C85394bg {

    /* renamed from: a */
    private static boolean f191167a;

    static {
        Covode.recordClassIndex(99506);
    }

    /* renamed from: b */
    public static void m146929b() {
        if (f191167a) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static synchronized void m146927a() {
        synchronized (C85394bg.class) {
            MethodCollector.m26663i(3050);
            f191167a = false;
            MethodCollector.m26664o(3050);
        }
    }

    /* renamed from: a */
    public static void m146928a(String str) {
        if (f191167a) {
            Trace.beginSection(str);
        }
    }
}
