package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.f */
final /* synthetic */ class C4570f implements AbstractC89172b {

    /* renamed from: a */
    private final C4566e f12198a;

    static {
        Covode.recordClassIndex(5146);
    }

    C4570f(C4566e eVar) {
        this.f12198a = eVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        this.f12198a.mo10308b(PrivacyCert.Builder.with("bpea-520").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        return C89391z.f203057a;
    }
}
