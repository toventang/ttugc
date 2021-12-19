package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;

/* renamed from: com.ss.android.ugc.aweme.j */
final /* synthetic */ class C56812j implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f129384a;

    static {
        Covode.recordClassIndex(66692);
    }

    C56812j(Bundle bundle) {
        this.f129384a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f129384a;
        if (bundle == null) {
            bundle = bundle2;
        }
        C39223a.m79594h().mo68583b();
        if (!C36085cj.m73553g().toRecoverDeletedAccount("enter_from_login_ui_routine")) {
            C31373a.C31374a.m65591a(bundle);
        }
    }
}
