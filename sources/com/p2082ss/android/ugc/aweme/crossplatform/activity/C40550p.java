package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import p4560f.p4561a.p4567d.AbstractC88430c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.p */
public final /* synthetic */ class C40550p implements AbstractC88430c {

    /* renamed from: a */
    static final AbstractC88430c f94877a = new C40550p();

    static {
        Covode.recordClassIndex(48371);
    }

    private C40550p() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88430c
    /* renamed from: a */
    public final Object mo9210a(Object obj, Object obj2) {
        return new MixActivityContainer.C40532a((ITpcConsentService) obj, (Activity) obj2);
    }
}
