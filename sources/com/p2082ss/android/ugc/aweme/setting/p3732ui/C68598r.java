package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.r */
final /* synthetic */ class C68598r implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153468a;

    /* renamed from: b */
    private final DialogC17223o f153469b;

    static {
        Covode.recordClassIndex(80854);
    }

    C68598r(I18nSettingNewVersionActivity i18nSettingNewVersionActivity, DialogC17223o oVar) {
        this.f153468a = i18nSettingNewVersionActivity;
        this.f153469b = oVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153468a;
        DialogC17223o oVar = this.f153469b;
        Throwable th = (Throwable) obj;
        C34611o.m70668a("compliance_api_status", new C33743c().mo59974a("error_message", Integer.valueOf(th instanceof C34480a ? ((C34480a) th).getErrorCode() : 0)).mo59976a(StringSet.type, "/tiktok/v1/edibility/birthdate/").mo59974a("status", (Integer) 1).mo59977a());
        SmartRouter.buildRoute(i18nSettingNewVersionActivity, "//account/setting").open();
        oVar.dismiss();
    }
}
