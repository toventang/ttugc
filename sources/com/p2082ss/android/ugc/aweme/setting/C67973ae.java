package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.ae */
final /* synthetic */ class C67973ae implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152297a;

    static {
        Covode.recordClassIndex(80152);
    }

    C67973ae(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152297a = i18nSettingManageMyAccountActivity;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f152297a.mo108555a((C80580in.m139683b() == null || C80580in.m139683b().getCommerceUserLevel() != 2) ? R.string.ght : R.string.ghr, R.string.ghs);
    }
}
