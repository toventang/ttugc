package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.p2010b.AbstractC27700b;
import com.google.firebase.p2010b.C27699a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.o */
public final /* synthetic */ class C27799o implements AbstractC27700b {

    /* renamed from: a */
    private final FirebaseInstanceId.C27752a f65310a;

    static {
        Covode.recordClassIndex(33387);
    }

    C27799o(FirebaseInstanceId.C27752a aVar) {
        this.f65310a = aVar;
    }

    @Override // com.google.firebase.p2010b.AbstractC27700b
    /* renamed from: a */
    public final void mo46321a(C27699a aVar) {
        MethodCollector.m26663i(12176);
        FirebaseInstanceId.C27752a aVar2 = this.f65310a;
        synchronized (aVar2) {
            try {
                if (aVar2.mo46404a()) {
                    FirebaseInstanceId.this.mo46393a();
                }
            } finally {
                MethodCollector.m26664o(12176);
            }
        }
    }
}
