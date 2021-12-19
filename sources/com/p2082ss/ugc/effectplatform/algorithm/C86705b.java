package com.p2082ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.effectplatform.algorithm.AbstractC86713g;

/* renamed from: com.ss.ugc.effectplatform.algorithm.b */
public final class C86705b {

    /* renamed from: a */
    public static AbstractC86713g f195526a = AbstractC86713g.C86714a.f195545a;

    /* renamed from: b */
    public static final C86705b f195527b = new C86705b();

    /* renamed from: c */
    private static volatile boolean f195528c;

    private C86705b() {
    }

    static {
        Covode.recordClassIndex(102404);
    }

    /* renamed from: a */
    public final void mo139942a() {
        MethodCollector.m26663i(2408);
        if (f195528c) {
            MethodCollector.m26664o(2408);
            return;
        }
        synchronized (this) {
            try {
                if (!f195528c) {
                    f195526a.loadLibrary("newep");
                    f195528c = true;
                }
            } finally {
                MethodCollector.m26664o(2408);
            }
        }
    }
}
