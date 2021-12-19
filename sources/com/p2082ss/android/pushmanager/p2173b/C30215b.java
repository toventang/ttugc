package com.p2082ss.android.pushmanager.p2173b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.pushmanager.b.b */
public class C30215b {

    /* renamed from: a */
    private static volatile C30215b f72062a;

    static {
        Covode.recordClassIndex(36721);
    }

    /* renamed from: a */
    public static C30215b m61118a() {
        MethodCollector.m26663i(4472);
        if (f72062a == null) {
            synchronized (C30215b.class) {
                try {
                    if (f72062a == null) {
                        f72062a = new C30215b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4472);
                    throw th;
                }
            }
        }
        C30215b bVar = f72062a;
        MethodCollector.m26664o(4472);
        return bVar;
    }
}
