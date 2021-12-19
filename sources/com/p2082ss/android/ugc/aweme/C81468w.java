package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.w */
public final /* synthetic */ class C81468w implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f182124a;

    static {
        Covode.recordClassIndex(94840);
    }

    C81468w(Bundle bundle) {
        this.f182124a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f182124a;
        if (bundle == null) {
            bundle = bundle2;
        }
        C39223a.m79600n().mo68670a(C17873f.m33102j());
        C31373a.C31374a.m65591a(bundle);
    }
}
