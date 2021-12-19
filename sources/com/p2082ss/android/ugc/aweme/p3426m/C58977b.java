package com.p2082ss.android.ugc.aweme.p3426m;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.m.b */
public final class C58977b {

    /* renamed from: a */
    private static final Object f134224a = new Object();

    /* renamed from: b */
    private static volatile C58977b f134225b;

    /* renamed from: c */
    private List<AbstractC58978a> f134226c;

    /* renamed from: com.ss.android.ugc.aweme.m.b$a */
    public interface AbstractC58978a {
        static {
            Covode.recordClassIndex(69306);
        }

        /* renamed from: a */
        boolean mo96453a();
    }

    static {
        Covode.recordClassIndex(69305);
    }

    private C58977b() {
        if (f134225b != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: a */
    public static C58977b m108350a() {
        MethodCollector.m26663i(6326);
        if (f134225b == null) {
            synchronized (f134224a) {
                try {
                    if (f134225b == null) {
                        f134225b = new C58977b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6326);
                    throw th;
                }
            }
        }
        C58977b bVar = f134225b;
        MethodCollector.m26664o(6326);
        return bVar;
    }

    /* renamed from: b */
    public final void mo96452b() {
        MethodCollector.m26663i(6327);
        synchronized (f134224a) {
            try {
                List<AbstractC58978a> list = this.f134226c;
                if (list != null) {
                    Iterator<AbstractC58978a> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().mo96453a()) {
                            it.remove();
                        }
                    }
                    MethodCollector.m26664o(6327);
                }
            } finally {
                MethodCollector.m26664o(6327);
            }
        }
    }
}
