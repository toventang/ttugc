package com.p2082ss.android.ugc.aweme.setting;

import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC34824bg;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.as */
final /* synthetic */ class C68004as implements AbstractC34824bg {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152354a;

    static {
        Covode.recordClassIndex(80200);
    }

    C68004as(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152354a = i18nSettingManageMyAccountActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34824bg
    /* renamed from: a */
    public final void mo61666a(String str, boolean z) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152354a;
        if (z) {
            new C23144b(i18nSettingManageMyAccountActivity).mo37640e(R.string.qb).mo37636b(R.raw.icon_tick_fill_small).mo37638c(C0643b.m2378c(i18nSettingManageMyAccountActivity, R.color.a9)).mo37637b();
            i18nSettingManageMyAccountActivity.f152261m.mo70136a(i18nSettingManageMyAccountActivity.mo108552a(str));
        }
    }
}
