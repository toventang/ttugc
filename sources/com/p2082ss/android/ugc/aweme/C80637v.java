package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.v */
public final /* synthetic */ class C80637v implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f180290a;

    static {
        Covode.recordClassIndex(93911);
    }

    C80637v(Bundle bundle) {
        this.f180290a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f180290a;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (Keva.getRepo("compliance_setting").getBoolean("need_to_show_ftc_age_gate_but_no_showed", false)) {
            C33830n.m69192a("aweme_age_gate_not_show", "", new C33743c().mo59974a("platform", Integer.valueOf(C36085cj.m73552f().getLoginPlatform())).mo59977a());
        }
        C39223a.m79596j().mo68700a(new C58974m(bundle));
    }
}
