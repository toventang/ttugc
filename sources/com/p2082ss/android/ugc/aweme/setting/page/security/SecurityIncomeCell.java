package com.p2082ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityIncomeCell */
public final class SecurityIncomeCell extends RightTextCell<C68334c> {
    static {
        Covode.recordClassIndex(80535);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        super.onClick(view);
        C39162r.m79460a("click_income_plus_verification", new C33744d().mo59983a("enter_from", "setting_security").f79943a);
        C29844g gVar = new C29844g("https://www.tiktok.com/inapp/reauth/settings");
        gVar.mo52130a("locale", C53438a.m98623b());
        gVar.mo52128a("aid", C17867d.f42590n);
        gVar.mo52130a("enter_from", "account_security_settings");
        SmartRouter.buildRoute(((RightTextCell) this).f152793a, "aweme://webview").withParam("url", gVar.mo52126a()).withParam("hide_nav_bar", true).open();
    }
}
