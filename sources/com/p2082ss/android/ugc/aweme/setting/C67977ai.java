package com.p2082ss.android.ugc.aweme.setting;

import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.setting.api.C68000c;
import com.p2082ss.android.ugc.aweme.setting.api.IUnbindValidateApi;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ai */
final /* synthetic */ class C67977ai implements AbstractC89172b {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152302a;

    static {
        Covode.recordClassIndex(80156);
    }

    C67977ai(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152302a = i18nSettingManageMyAccountActivity;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152302a;
        DialogC17223o oVar = new DialogC17223o(i18nSettingManageMyAccountActivity);
        oVar.show();
        IUnbindValidateApi iUnbindValidateApi = IUnbindValidateApi.C67992a.f152330a;
        String a = AbstractC22384h.m42212a(C29736b.f70924e + "/passport/mobile/unbind_validate/");
        C89219l.m154716b(a, "");
        iUnbindValidateApi.unbindMobileValidate(a).mo5534a(new AbstractC1729g<C68000c, Object>(oVar) {
            /* class com.p2082ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.C679636 */

            /* renamed from: a */
            final /* synthetic */ Dialog f152276a;

            static {
                Covode.recordClassIndex(80135);
            }

            @Override // p077b.AbstractC1729g
            public final Object then(C1731i<C68000c> iVar) {
                this.f152276a.dismiss();
                if (!C80214ai.m139043a(iVar) || iVar.mo5545d().f152349b == null) {
                    I18nSettingManageMyAccountActivity.this.mo108560c();
                    I18nSettingManageMyAccountActivity.m120255a("unlink", true, false, -1);
                    return null;
                }
                C68000c.C68001a aVar = iVar.mo5545d().f152349b;
                int i = aVar.f152350a;
                I18nSettingManageMyAccountActivity.m120255a("unlink", true, false, i);
                if (i == 0) {
                    I18nSettingManageMyAccountActivity.this.f152251c = true;
                    C31575b.m65863e().unbindPhone(I18nSettingManageMyAccountActivity.this, aVar.f152351b, "manage_my_account");
                    return null;
                }
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                i18nSettingManageMyAccountActivity.mo108559b(i18nSettingManageMyAccountActivity.mo108553a(true, aVar.f152350a));
                return null;
            }

            {
                this.f152276a = r2;
            }
        }, C1731i.f5564c, null);
        return C89391z.f203057a;
    }
}
