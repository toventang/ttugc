package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;

/* renamed from: com.ss.android.ugc.aweme.s */
final /* synthetic */ class C67213s implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f150640a;

    static {
        Covode.recordClassIndex(78832);
    }

    C67213s(Bundle bundle) {
        this.f150640a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f150640a;
        if (bundle == null) {
            bundle = bundle2;
        }
        int i = bundle.getInt("kr_marketing_notification_operation", 0);
        if (i != 0) {
            C39223a.m79600n().mo68669a(i);
        }
        C31373a.C31374a.m65591a(bundle);
    }
}
