package com.p2082ss.android.ugc.aweme.setting;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.setting.ap */
final /* synthetic */ class C67984ap implements IAccountService.AbstractC31277g {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152309a;

    /* renamed from: b */
    private final DialogInterface f152310b;

    static {
        Covode.recordClassIndex(80163);
    }

    C67984ap(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, DialogInterface dialogInterface) {
        this.f152309a = i18nSettingManageMyAccountActivity;
        this.f152310b = dialogInterface;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        this.f152309a.mo108556a(this.f152310b, i, i2);
    }
}
