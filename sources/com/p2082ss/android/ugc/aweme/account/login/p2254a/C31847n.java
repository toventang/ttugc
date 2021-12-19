package com.p2082ss.android.ugc.aweme.account.login.p2254a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32867m;
import com.p2082ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.n */
public final class C31847n extends C31828h {

    /* renamed from: a */
    public final String f76103a;

    /* renamed from: h */
    public final Bundle f76104h;

    /* renamed from: i */
    public final I18nSignUpActivity f76105i;

    static {
        Covode.recordClassIndex(38589);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31847n(final String str, final Bundle bundle, final I18nSignUpActivity i18nSignUpActivity) {
        super(2131231060, new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.account.login.p2254a.C31847n.View$OnClickListenerC318481 */

            static {
                Covode.recordClassIndex(38590);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C39162r.m79460a("click_login_button", new C31376a().mo57399a("enter_from", str).f75156a);
                i18nSignUpActivity.mo57716b("click_platform");
                IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
                if (iFeed0VVManagerService != null) {
                    iFeed0VVManagerService.mo60082a("click_login");
                    iFeed0VVManagerService.mo60083b("LOGIN");
                }
                SmartRoute c = C32867m.m67468c(i18nSignUpActivity);
                Bundle bundle = bundle;
                if (bundle != null) {
                    c.withParam(bundle);
                }
                c.open();
            }
        }, (int) R.string.aob, "phone_email_show", 8);
        C89219l.m154721d(str, "");
        C89219l.m154721d(i18nSignUpActivity, "");
        this.f76103a = str;
        this.f76104h = bundle;
        this.f76105i = i18nSignUpActivity;
    }
}
