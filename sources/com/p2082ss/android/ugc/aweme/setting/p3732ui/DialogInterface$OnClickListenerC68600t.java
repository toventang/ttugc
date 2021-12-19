package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.t */
final /* synthetic */ class DialogInterface$OnClickListenerC68600t implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153471a;

    static {
        Covode.recordClassIndex(80856);
    }

    DialogInterface$OnClickListenerC68600t(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f153471a = i18nSettingNewVersionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153471a;
        C31575b.m65859a();
        C31575b.f75524a.mo57075k().updateMethodInfo("allow_one_key_login", true);
        i18nSettingNewVersionActivity.mo108959E();
        C39162r.m79460a("remember_login_info_confirm", new C33744d().mo59983a("user_id", C31575b.m65865g().getCurUserId()).mo59983a("enter_from", "logout").f79943a);
    }
}
