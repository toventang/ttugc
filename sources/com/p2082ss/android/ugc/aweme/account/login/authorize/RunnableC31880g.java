package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.agegate.C31380a;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;
import com.p2082ss.android.ugc.aweme.account.agegate.C31481c;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31930a;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31935b;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31937c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2249h.C31681f;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32867m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.g */
final /* synthetic */ class RunnableC31880g implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f76177a;

    /* renamed from: b */
    private final int f76178b;

    /* renamed from: c */
    private final boolean f76179c;

    static {
        Covode.recordClassIndex(38624);
    }

    RunnableC31880g(AuthorizeActivity authorizeActivity, int i, boolean z) {
        this.f76177a = authorizeActivity;
        this.f76178b = i;
        this.f76179c = z;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f76177a;
        int i = this.f76178b;
        boolean z = this.f76179c;
        if (authorizeActivity.isDestroyed()) {
            return;
        }
        if (i == 0) {
            C39162r.m79460a("tns_third_party_not_registered_age_gate_action", new C31376a().mo57397a("register_age_gate_action", i).mo57397a("show", 0).f75156a);
            if (C31937c.m66302a()) {
                C31930a aVar = new C31930a();
                AuthResult authResult = authorizeActivity.f76133i;
                C31935b bVar = new C31935b(authorizeActivity.f76133i, authorizeActivity);
                C89219l.m154721d(authorizeActivity, "");
                C89219l.m154721d(authResult, "");
                C89219l.m154721d(bVar, "");
                aVar.f76275a = bVar;
                if (!C31937c.m66302a()) {
                    C31930a.AbstractC31932b bVar2 = aVar.f76275a;
                    if (bVar2 != null) {
                        bVar2.mo57858a();
                        return;
                    }
                    return;
                }
                SmartRouter.buildRoute(authorizeActivity, "//account/login/signup_or_login").withParam("enter_type", "click_login").withParam("next_page", EnumC32594j.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue()).withParam("key_auth_result", authResult).open(10086, new C31930a.C31934d(new C31930a.C31933c(aVar)));
                return;
            }
            authorizeActivity.mo57797a(authorizeActivity.f76133i, false);
            return;
        }
        C39162r.m79460a("tns_third_party_not_registered_age_gate_action", new C31376a().mo57397a("register_age_gate_action", i).mo57397a("show", 1).f75156a);
        C31412b bVar3 = new C31412b();
        AuthResult authResult2 = authorizeActivity.f76133i;
        C31380a aVar2 = new C31380a(authorizeActivity.f76133i, authorizeActivity);
        Boolean valueOf = Boolean.valueOf(z);
        Bundle a = AuthorizeActivity.m66188a(authorizeActivity.getIntent());
        bVar3.f75221a = aVar2;
        String d = C31681f.m66005d(authResult2);
        int d2 = ((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60103d();
        if (d2 == 0 || (d2 == 1 && (TextUtils.equals(d, "facebook") || TextUtils.equals(d, "google")))) {
            if (bVar3.f75221a != null) {
                bVar3.f75221a.mo57401a();
            }
        } else if (valueOf.booleanValue()) {
            C32867m.m67466a(authorizeActivity).withParam(a).open();
            authorizeActivity.finish();
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(authorizeActivity, "//account/login/signup_or_login");
            buildRoute.withParam("enter_type", "click_login");
            buildRoute.withParam("key_auth_result", authResult2);
            buildRoute.withParam("platform", authResult2.f49370d);
            buildRoute.withParam("is_existing_user", false);
            buildRoute.withParam("enter_from", "3rd_party_auth");
            buildRoute.withParam("enter_method", "3rd_party_verified");
            if (d2 == 1) {
                buildRoute.withParam("next_page", EnumC32594j.THIRD_PARTY_FTC_AGE_GATE.getValue());
            } else {
                buildRoute.withParam("next_page", EnumC32594j.THIRD_PARTY_AGE_GATE.getValue());
            }
            buildRoute.open(998, new C31481c(bVar3));
        }
    }
}
