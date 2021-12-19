package com.p2082ss.android.p2092ad.splash.core.p2103h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ad.splash.core.h.a */
public class C29501a {

    /* renamed from: b */
    private static volatile C29501a f70261b;

    /* renamed from: a */
    public volatile ExecutorService f70262a;

    static {
        Covode.recordClassIndex(35895);
    }

    /* renamed from: a */
    public static C29501a m59114a() {
        MethodCollector.m26663i(12835);
        if (f70261b == null) {
            synchronized (C29501a.class) {
                try {
                    if (f70261b == null) {
                        f70261b = new C29501a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12835);
                    throw th;
                }
            }
        }
        C29501a aVar = f70261b;
        MethodCollector.m26664o(12835);
        return aVar;
    }

    /* renamed from: a */
    public final void mo51588a(ExecutorService executorService) {
        if (executorService != null) {
            this.f70262a = executorService;
        }
    }
}
