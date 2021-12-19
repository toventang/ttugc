package com.p2082ss.android.ugc.aweme.p2430by;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.by.a */
public class C35330a {

    /* renamed from: b */
    private static C35330a f83354b;

    /* renamed from: a */
    public boolean f83355a = true;

    static {
        Covode.recordClassIndex(42498);
    }

    /* renamed from: a */
    public static C35330a m72309a() {
        MethodCollector.m26663i(1086);
        if (f83354b == null) {
            synchronized (C35330a.class) {
                try {
                    if (f83354b == null) {
                        f83354b = new C35330a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1086);
                    throw th;
                }
            }
        }
        C35330a aVar = f83354b;
        MethodCollector.m26664o(1086);
        return aVar;
    }
}
