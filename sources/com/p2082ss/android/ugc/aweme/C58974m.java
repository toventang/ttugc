package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.m */
final /* synthetic */ class C58974m implements AbstractC39264b {

    /* renamed from: a */
    private final Bundle f134216a;

    static {
        Covode.recordClassIndex(69302);
    }

    C58974m(Bundle bundle) {
        this.f134216a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b
    /* renamed from: a */
    public final void mo68586a() {
        Bundle bundle = this.f134216a;
        if (C80580in.m139687c()) {
            C39223a.m79599m().mo68657a();
        }
        C31373a.C31374a.m65591a(bundle);
    }
}
