package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.i */
public final /* synthetic */ class C31329i implements AbstractC88433f {

    /* renamed from: a */
    private final C31310a f75054a;

    static {
        Covode.recordClassIndex(38029);
    }

    C31329i(C31310a aVar) {
        this.f75054a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MethodCollector.m26663i(7313);
        C31310a aVar = this.f75054a;
        if (!((Boolean) obj).booleanValue()) {
            aVar.mo57318b();
            synchronized (C31310a.class) {
                try {
                    if (C31310a.f75026b && C31310a.f75028d != null && !C31310a.f75028d.isDisposed()) {
                        C31310a.f75028d.dispose();
                        C31310a.f75026b = false;
                    }
                } finally {
                    MethodCollector.m26664o(7313);
                }
            }
            return;
        }
        MethodCollector.m26664o(7313);
    }
}
