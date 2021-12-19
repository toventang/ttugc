package com.lynx.tasm.p2056e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.lynx.tasm.e.a */
public class C28768a {

    /* renamed from: b */
    private static C28768a f67846b;

    /* renamed from: a */
    public AbstractC28769b f67847a;

    static {
        Covode.recordClassIndex(34867);
    }

    /* renamed from: a */
    public static C28768a m57580a() {
        MethodCollector.m26663i(4237);
        if (f67846b == null) {
            synchronized (C28768a.class) {
                try {
                    if (f67846b == null) {
                        f67846b = new C28768a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4237);
                    throw th;
                }
            }
        }
        C28768a aVar = f67846b;
        MethodCollector.m26664o(4237);
        return aVar;
    }
}
