package com.p2082ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ttve.common.g */
public class C30647g {

    /* renamed from: b */
    private static volatile C30647g f73268b;

    /* renamed from: a */
    public TESpdLogInvoker f73269a = new TESpdLogInvoker();

    static {
        Covode.recordClassIndex(37189);
    }

    private C30647g() {
    }

    /* renamed from: com.ss.android.ttve.common.g$a */
    public enum EnumC30648a {
        LEVEL0,
        LEVEL1,
        LEVEL2,
        LEVEL3;

        static {
            Covode.recordClassIndex(37190);
        }
    }

    /* renamed from: a */
    public static C30647g m62989a() {
        MethodCollector.m26663i(4336);
        if (f73268b == null) {
            synchronized (C30647g.class) {
                try {
                    if (f73268b == null) {
                        f73268b = new C30647g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4336);
                    throw th;
                }
            }
        }
        C30647g gVar = f73268b;
        MethodCollector.m26664o(4336);
        return gVar;
    }
}
