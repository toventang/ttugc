package com.bytedance.crash.runtime;

import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.crash.runtime.n */
public class C14019n {

    /* renamed from: a */
    private static volatile C14032s f34170a;

    static {
        Covode.recordClassIndex(16084);
    }

    /* renamed from: b */
    public static C14032s m25421b() {
        if (f34170a == null) {
            m25420a();
        }
        return f34170a;
    }

    /* renamed from: a */
    public static HandlerThread m25420a() {
        MethodCollector.m26663i(1127);
        if (f34170a == null) {
            synchronized (C14019n.class) {
                try {
                    if (f34170a == null) {
                        C14032s sVar = new C14032s("default_npth_thread");
                        f34170a = sVar;
                        sVar.f34196a.start();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1127);
                    throw th;
                }
            }
        }
        HandlerThread handlerThread = f34170a.f34196a;
        MethodCollector.m26664o(1127);
        return handlerThread;
    }
}
