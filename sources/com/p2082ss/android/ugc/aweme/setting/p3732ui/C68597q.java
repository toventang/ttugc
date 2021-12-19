package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.setting.model.C68178h;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.q */
final /* synthetic */ class C68597q implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153466a;

    /* renamed from: b */
    private final DialogC17223o f153467b;

    static {
        Covode.recordClassIndex(80853);
    }

    C68597q(I18nSettingNewVersionActivity i18nSettingNewVersionActivity, DialogC17223o oVar) {
        this.f153466a = i18nSettingNewVersionActivity;
        this.f153467b = oVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153466a;
        DialogC17223o oVar = this.f153467b;
        C34611o.m70668a("compliance_api_status", new C33743c().mo59976a(StringSet.type, "/tiktok/v1/edibility/birthdate/").mo59974a("status", (Integer) 0).mo59977a());
        SmartRouter.buildRoute(i18nSettingNewVersionActivity, "//account/setting").withParam("dob_status", (C68178h) obj).open();
        oVar.dismiss();
    }
}
