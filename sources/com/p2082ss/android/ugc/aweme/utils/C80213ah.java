package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.utils.ah */
public class C80213ah {

    /* renamed from: b */
    private static C80213ah f179683b;

    /* renamed from: a */
    public boolean f179684a;

    static {
        Covode.recordClassIndex(93481);
    }

    /* renamed from: a */
    public static C80213ah m139041a() {
        MethodCollector.m26663i(14241);
        if (f179683b == null) {
            synchronized (C80213ah.class) {
                try {
                    if (f179683b == null) {
                        f179683b = new C80213ah();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14241);
                    throw th;
                }
            }
        }
        C80213ah ahVar = f179683b;
        MethodCollector.m26664o(14241);
        return ahVar;
    }
}
