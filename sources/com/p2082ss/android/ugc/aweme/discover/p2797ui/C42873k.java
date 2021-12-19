package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.ui.k */
public final /* synthetic */ class C42873k implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC42715b f99972a;

    static {
        Covode.recordClassIndex(50978);
    }

    C42873k(AbstractC42715b bVar) {
        this.f99972a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC42715b bVar = this.f99972a;
        ((ITpcConsentService) obj).mo68646i();
        if (bVar.f99644s != null) {
            bVar.f99644s.dispose();
        }
    }
}
