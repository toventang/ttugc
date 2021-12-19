package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;

/* renamed from: com.ss.android.ugc.aweme.live.b */
public class C58589b {

    /* renamed from: a */
    private static volatile C27910f f133451a;

    static {
        Covode.recordClassIndex(68885);
    }

    private C58589b() {
    }

    /* renamed from: a */
    public static C27910f m107696a() {
        MethodCollector.m26663i(4104);
        if (f133451a == null) {
            synchronized (C58589b.class) {
                try {
                    if (f133451a == null) {
                        f133451a = new C27910f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4104);
                    throw th;
                }
            }
        }
        C27910f fVar = f133451a;
        MethodCollector.m26664o(4104);
        return fVar;
    }
}
