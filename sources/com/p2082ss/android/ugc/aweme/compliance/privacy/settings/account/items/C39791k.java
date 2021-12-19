package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.k */
public final class C39791k extends AbstractC39751a {

    /* renamed from: a */
    private final C39256o f93681a;

    /* renamed from: b */
    private final int f93682b = R.string.fjv;

    static {
        Covode.recordClassIndex(47521);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return this.f93681a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93682b;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        String str;
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_personalize_data", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
        C39162r.m79460a("enter_personalize_data", new C33744d().mo59983a("enter_from", "settings").f79943a);
        if (C39223a.m79593g().mo68663b() == 0) {
            str = "off";
        } else {
            str = "on";
        }
        C39162r.m79460a("show_personalization_status", new C33744d().mo59983a("initial_status", str).f79943a);
        SmartRouter.buildRoute(context, "aweme://privacy/setting/personalization").withParam("user_data_download", C39699a.m80587b()).open();
    }
}
