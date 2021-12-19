package com.p2082ss.android.ugc.aweme.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.af */
final /* synthetic */ class C67974af implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152298a;

    static {
        Covode.recordClassIndex(80153);
    }

    C67974af(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152298a = i18nSettingManageMyAccountActivity;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152298a;
        Throwable th = (Throwable) obj;
        if (th instanceof C34485a) {
            C34485a aVar = (C34485a) th;
            if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                new C79459a(i18nSettingManageMyAccountActivity).mo123050a(R.string.bon).mo123053a();
                return;
            }
            C17197a.C17200a aVar2 = new C17197a.C17200a(i18nSettingManageMyAccountActivity);
            aVar2.f41071b = aVar.getErrorMsg();
            aVar2.mo27190a(R.string.ghu, DialogInterface$OnClickListenerC68002aq.f152352a, false).mo27193a().mo27185c();
            return;
        }
        i18nSettingManageMyAccountActivity.mo108558b();
    }
}
