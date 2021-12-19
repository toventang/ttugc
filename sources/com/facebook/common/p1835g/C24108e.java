package com.facebook.common.p1835g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.facebook.common.g.e */
public final class C24108e implements AbstractC24107d {

    /* renamed from: a */
    private static C24108e f57035a;

    static {
        Covode.recordClassIndex(28236);
    }

    @Override // com.facebook.common.p1835g.AbstractC24107d
    /* renamed from: a */
    public final void mo34255a(AbstractC24106c cVar) {
    }

    /* renamed from: a */
    public static synchronized C24108e m45686a() {
        C24108e eVar;
        synchronized (C24108e.class) {
            MethodCollector.m26663i(13131);
            if (f57035a == null) {
                f57035a = new C24108e();
            }
            eVar = f57035a;
            MethodCollector.m26664o(13131);
        }
        return eVar;
    }
}
