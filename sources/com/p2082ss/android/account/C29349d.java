package com.p2082ss.android.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.account.p2088a.AbstractC29342b;

/* renamed from: com.ss.android.account.d */
public class C29349d {

    /* renamed from: b */
    private static volatile C29349d f69667b;

    /* renamed from: a */
    public AbstractC29342b f69668a;

    static {
        Covode.recordClassIndex(35737);
    }

    private C29349d() {
    }

    /* renamed from: a */
    public static C29349d m58779a() {
        MethodCollector.m26663i(1902);
        if (f69667b == null) {
            synchronized (C29349d.class) {
                try {
                    if (f69667b == null) {
                        f69667b = new C29349d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1902);
                    throw th;
                }
            }
        }
        C29349d dVar = f69667b;
        MethodCollector.m26664o(1902);
        return dVar;
    }
}
