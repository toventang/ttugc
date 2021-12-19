package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.r */
public final /* synthetic */ class C40552r implements AbstractC88433f {

    /* renamed from: a */
    private final MixActivityContainer f94879a;

    /* renamed from: b */
    private final boolean f94880b;

    static {
        Covode.recordClassIndex(48373);
    }

    C40552r(MixActivityContainer mixActivityContainer, boolean z) {
        this.f94879a = mixActivityContainer;
        this.f94880b = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MixActivityContainer mixActivityContainer = this.f94879a;
        boolean z = this.f94880b;
        ((ITpcConsentService) obj).mo68646i();
        if (!z && C39223a.m79604r().mo68637a((AbstractC39273a) null) && C39223a.m79604r().mo68639b()) {
            C39223a.m79604r().mo68636a(mixActivityContainer.f94810a, "deeplink");
        }
        if (mixActivityContainer.f94818i != null) {
            mixActivityContainer.f94818i.dispose();
        }
    }
}
