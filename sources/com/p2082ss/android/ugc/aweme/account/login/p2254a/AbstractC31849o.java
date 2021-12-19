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
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.o */
public abstract class AbstractC31849o extends C31828h {

    /* renamed from: a */
    public final String f76109a;

    /* renamed from: h */
    public final Bundle f76110h;

    /* renamed from: i */
    public final I18nSignUpActivity f76111i;

    static {
        Covode.recordClassIndex(38591);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC31849o(final String str, final Bundle bundle, final I18nSignUpActivity i18nSignUpActivity) {
        super(2131231060, (View.OnClickListener) new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.account.login.p2254a.AbstractC31849o.View$OnClickListenerC318501 */

            static {
                Covode.recordClassIndex(38592);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C39162r.m79460a("click_sign_up", new C31376a().mo57399a("enter_method", str).f75156a);
                i18nSignUpActivity.mo57716b("click_platform");
                IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
                if (iFeed0VVManagerService != null) {
                    iFeed0VVManagerService.mo60082a("click_sign_up");
                    iFeed0VVManagerService.mo60083b("SIGNUP");
                }
                if (C39223a.m79594h().mo68584c()) {
                    SmartRoute a = C32867m.m67466a(i18nSignUpActivity);
                    Bundle bundle = bundle;
                    if (bundle != null) {
                        bundle.putBoolean("age_gate_block", true);
                        a.withParam(bundle);
                    }
                    if (!i18nSignUpActivity.mo57714a(a)) {
                        a.open();
                        return;
                    }
                    return;
                }
                SmartRoute b = C32867m.m67467b(i18nSignUpActivity);
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    b.withParam(bundle2);
                }
                if (!i18nSignUpActivity.mo57714a(b)) {
                    b.open();
                }
            }
        }, (int) R.string.apy, false, "phone_email_show");
        C89219l.m154721d(str, "");
        C89219l.m154721d(i18nSignUpActivity, "");
        this.f76109a = str;
        this.f76110h = bundle;
        this.f76111i = i18nSignUpActivity;
    }

    public /* synthetic */ AbstractC31849o(String str, Bundle bundle, I18nSignUpActivity i18nSignUpActivity, byte b) {
        this(str, bundle, i18nSignUpActivity);
    }
}
