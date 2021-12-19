package com.p2082ss.android.p2092ad.splash.p2107d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ad.splash.d.b */
public class C29631b {

    /* renamed from: b */
    private static volatile C29631b f70691b;

    /* renamed from: a */
    public long f70692a;

    static {
        Covode.recordClassIndex(36027);
    }

    private C29631b() {
    }

    /* renamed from: a */
    public static C29631b m59651a() {
        MethodCollector.m26663i(9456);
        if (f70691b == null) {
            synchronized (C29631b.class) {
                try {
                    if (f70691b == null) {
                        f70691b = new C29631b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9456);
                    throw th;
                }
            }
        }
        C29631b bVar = f70691b;
        MethodCollector.m26664o(9456);
        return bVar;
    }
}
