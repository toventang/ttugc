package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.h */
final /* synthetic */ class C31328h implements AbstractC88433f {

    /* renamed from: a */
    private final C31310a f75053a;

    static {
        Covode.recordClassIndex(38028);
    }

    C31328h(C31310a aVar) {
        this.f75053a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MethodCollector.m26663i(7169);
        synchronized (C31310a.class) {
            try {
                if (C31310a.f75025a && C31310a.f75027c != null) {
                    C17867d.m33078a().unregisterReceiver(C31310a.f75027c);
                    C31310a.f75025a = false;
                }
            } finally {
                MethodCollector.m26664o(7169);
            }
        }
    }
}
