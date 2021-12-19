package com.p2082ss.android.ugc.aweme.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.model.C68178h;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.setting.ac */
final /* synthetic */ class C67971ac implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152293a;

    /* renamed from: b */
    private final DialogC17223o f152294b;

    static {
        Covode.recordClassIndex(80150);
    }

    C67971ac(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, DialogC17223o oVar) {
        this.f152293a = i18nSettingManageMyAccountActivity;
        this.f152294b = oVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152293a;
        C68178h hVar = (C68178h) obj;
        this.f152294b.dismiss();
        int i = 0;
        if (hVar == null || hVar.status_code != 0) {
            new C23144b(i18nSettingManageMyAccountActivity).mo37640e(R.string.fz3).mo37637b();
            C33743c cVar = new C33743c();
            if (hVar != null) {
                i = hVar.error_code;
            }
            C34611o.m70668a("compliance_api_status", cVar.mo59974a("error_message", Integer.valueOf(i)).mo59976a(StringSet.type, "/tiktok/v1/edibility/birthdate/").mo59974a("status", (Integer) 1).mo59977a());
            i18nSettingManageMyAccountActivity.mo108554a();
            return;
        }
        C34611o.m70668a("compliance_api_status", new C33743c().mo59976a(StringSet.type, "/tiktok/v1/edibility/birthdate/").mo59974a("status", (Integer) 0).mo59977a());
        i18nSettingManageMyAccountActivity.f152252d = hVar;
        i18nSettingManageMyAccountActivity.mo108554a();
        if (i18nSettingManageMyAccountActivity.f152252d.getType().intValue() == 3 || i18nSettingManageMyAccountActivity.f152252d.getType().intValue() == 4 || i18nSettingManageMyAccountActivity.f152252d.getType().intValue() == 0 || i18nSettingManageMyAccountActivity.f152252d.getType().intValue() == 5) {
            C23025b bVar = new C23025b(i18nSettingManageMyAccountActivity);
            if (i18nSettingManageMyAccountActivity.f152252d.getType().intValue() != 4 || TextUtils.isEmpty(i18nSettingManageMyAccountActivity.f152252d.getAppealUrl())) {
                bVar.mo37416a(R.string.bx, (AbstractC89172b<? super C23024a, C89391z>) null);
            } else {
                bVar.mo37416a(R.string.qe, new C68003ar(i18nSettingManageMyAccountActivity));
                bVar.mo37416a(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            }
            ((C23023b) ((C23023b) new C23023b(i18nSettingManageMyAccountActivity).mo37479a(R.string.qc)).mo37413d(i18nSettingManageMyAccountActivity.f152252d.getMsg()).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
            C39162r.m79460a("show_age_edit_ineligible_popup", new C33744d().mo59983a("enter_from", "age_edit_page").mo59982a("user_age_status", i18nSettingManageMyAccountActivity.f152252d.getType()).f79943a);
            return;
        }
        C31575b.m65862d().mo57199a(i18nSettingManageMyAccountActivity, new C68004as(i18nSettingManageMyAccountActivity), i18nSettingManageMyAccountActivity.f152252d.getDefaultDoB(), "click_dob_from_manage_account", i18nSettingManageMyAccountActivity.f152252d.getType().intValue(), i18nSettingManageMyAccountActivity.f152252d.getUpperBoundDate(), i18nSettingManageMyAccountActivity.f152252d.getDescType().intValue());
    }
}
