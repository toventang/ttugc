package com.p2082ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;

/* renamed from: com.ss.android.socialbase.downloader.impls.l */
public class C30499l {

    /* renamed from: a */
    private static volatile AbstractC30423o f72712a;

    /* renamed from: b */
    private static volatile AbstractC30423o f72713b;

    static {
        Covode.recordClassIndex(37027);
    }

    /* renamed from: a */
    public static AbstractC30423o m62246a(boolean z) {
        MethodCollector.m26663i(9078);
        if (!z || !C30399c.m61677E()) {
            if (f72712a == null) {
                synchronized (C30499l.class) {
                    try {
                        if (f72712a == null) {
                            f72712a = new C30504p();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(9078);
                        throw th;
                    }
                }
            }
            AbstractC30423o oVar = f72712a;
            MethodCollector.m26664o(9078);
            return oVar;
        }
        if (f72713b == null) {
            synchronized (C30499l.class) {
                try {
                    if (f72713b == null) {
                        f72713b = C30399c.f72430b.mo54047b();
                    }
                } catch (Throwable th2) {
                    MethodCollector.m26664o(9078);
                    throw th2;
                }
            }
        }
        AbstractC30423o oVar2 = f72713b;
        MethodCollector.m26664o(9078);
        return oVar2;
    }
}
