package com.bytedance.ttnet.p1700a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.ttnet.a.b */
public class C22904b {

    /* renamed from: a */
    private static volatile C22904b f54100a;

    static {
        Covode.recordClassIndex(26812);
    }

    private C22904b() {
    }

    /* renamed from: a */
    public static C22904b m43175a() {
        MethodCollector.m26663i(5066);
        if (f54100a == null) {
            synchronized (C22904b.class) {
                try {
                    if (f54100a == null) {
                        f54100a = new C22904b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5066);
                    throw th;
                }
            }
        }
        C22904b bVar = f54100a;
        MethodCollector.m26664o(5066);
        return bVar;
    }
}
