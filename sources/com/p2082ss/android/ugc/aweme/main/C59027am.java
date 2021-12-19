package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.main.am */
final /* synthetic */ class C59027am implements AbstractC88433f {

    /* renamed from: a */
    private final C59014ae f134399a;

    static {
        Covode.recordClassIndex(69372);
    }

    C59027am(C59014ae aeVar) {
        this.f134399a = aeVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C59014ae aeVar = this.f134399a;
        ((ITpcConsentService) obj).mo68646i();
        if (aeVar.f134348F != null) {
            aeVar.f134348F.dispose();
        }
    }
}
