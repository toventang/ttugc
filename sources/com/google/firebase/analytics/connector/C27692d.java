package com.google.firebase.analytics.connector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.C25762ab;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.firebase.p2010b.AbstractC27700b;
import com.google.firebase.p2010b.C27699a;

/* renamed from: com.google.firebase.analytics.connector.d */
final /* synthetic */ class C27692d implements AbstractC27700b {

    /* renamed from: a */
    static final AbstractC27700b f65092a = new C27692d();

    static {
        Covode.recordClassIndex(33273);
    }

    private C27692d() {
    }

    @Override // com.google.firebase.p2010b.AbstractC27700b
    /* renamed from: a */
    public final void mo46321a(C27699a aVar) {
        MethodCollector.m26663i(730);
        boolean z = aVar.f65117b.f65065a;
        synchronized (C27690b.class) {
            try {
                C25939f fVar = ((C27690b) C27690b.f65088a).f65089b.f61671a;
                fVar.mo42391a(new C25762ab(fVar, z));
            } finally {
                MethodCollector.m26664o(730);
            }
        }
    }
}
