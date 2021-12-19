package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.u */
public final /* synthetic */ class C79487u implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f178426a;

    static {
        Covode.recordClassIndex(92690);
    }

    C79487u(Bundle bundle) {
        this.f178426a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f178426a;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle.getBoolean("kids_mode_restart", false)) {
            C39162r.onEventV3("kids_log_in");
            Context j = C17873f.m33102j();
            if (j == null) {
                j = C17867d.m33078a();
            }
            C39223a.m79603q().mo68626a(j);
        } else if (bundle.getBoolean("need_restart", false)) {
            new Handler().postDelayed(new RunnableC61291n(bundle), 500);
        } else {
            C31373a.C31374a.m65591a(bundle);
        }
    }
}
