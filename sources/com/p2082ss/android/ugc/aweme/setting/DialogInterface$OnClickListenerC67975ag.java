package com.p2082ss.android.ugc.aweme.setting;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ag */
public final /* synthetic */ class DialogInterface$OnClickListenerC67975ag implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152299a;

    /* renamed from: b */
    private final int f152300b = 0;

    static {
        Covode.recordClassIndex(80154);
    }

    DialogInterface$OnClickListenerC67975ag(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152299a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152299a;
        C31575b.m65867i().switchProAccount(this.f152300b, null, null, 0, new C67984ap(i18nSettingManageMyAccountActivity, dialogInterface));
    }
}
