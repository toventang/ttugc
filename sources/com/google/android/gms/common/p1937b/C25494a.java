package com.google.android.gms.common.p1937b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.b.a */
public final class C25494a {

    /* renamed from: a */
    private static AbstractC25495a f60477a;

    /* renamed from: com.google.android.gms.common.b.a$a */
    public interface AbstractC25495a {
        static {
            Covode.recordClassIndex(30894);
        }

        /* renamed from: a */
        ScheduledExecutorService mo41729a();
    }

    static {
        Covode.recordClassIndex(30893);
    }

    /* renamed from: a */
    public static synchronized AbstractC25495a m49165a() {
        AbstractC25495a aVar;
        synchronized (C25494a.class) {
            MethodCollector.m26663i(7561);
            if (f60477a == null) {
                f60477a = new C25496b();
            }
            aVar = f60477a;
            MethodCollector.m26664o(7561);
        }
        return aVar;
    }
}
