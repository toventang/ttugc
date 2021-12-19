package com.p2082ss.android.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.account.p2090c.AbstractC29348a;

/* renamed from: com.ss.android.account.e */
public class C29350e {

    /* renamed from: b */
    private static volatile C29350e f69669b;

    /* renamed from: a */
    public AbstractC29348a f69670a;

    static {
        Covode.recordClassIndex(35738);
    }

    private C29350e() {
    }

    /* renamed from: a */
    public static C29350e m58780a() {
        MethodCollector.m26663i(1851);
        if (f69669b == null) {
            synchronized (C29350e.class) {
                try {
                    if (f69669b == null) {
                        f69669b = new C29350e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1851);
                    throw th;
                }
            }
        }
        C29350e eVar = f69669b;
        MethodCollector.m26664o(1851);
        return eVar;
    }
}
