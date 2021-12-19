package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.ad */
final /* synthetic */ class C67972ad implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152295a;

    /* renamed from: b */
    private final DialogC17223o f152296b;

    static {
        Covode.recordClassIndex(80151);
    }

    C67972ad(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, DialogC17223o oVar) {
        this.f152295a = i18nSettingManageMyAccountActivity;
        this.f152296b = oVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152295a;
        DialogC17223o oVar = this.f152296b;
        Throwable th = (Throwable) obj;
        C34611o.m70668a("compliance_api_status", new C33743c().mo59974a("error_message", Integer.valueOf(th instanceof C34480a ? ((C34480a) th).getErrorCode() : 0)).mo59976a(StringSet.type, "/tiktok/v1/edibility/birthdate/").mo59974a("status", (Integer) 1).mo59977a());
        i18nSettingManageMyAccountActivity.mo108554a();
        new C23144b(i18nSettingManageMyAccountActivity).mo37640e(R.string.fz3).mo37637b();
        oVar.dismiss();
    }
}
