package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.I18nSettingNewVersionActivity;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.p */
final /* synthetic */ class C68596p implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153465a;

    static {
        Covode.recordClassIndex(80852);
    }

    C68596p(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f153465a = i18nSettingNewVersionActivity;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153465a;
        I18nSettingNewVersionActivity.C68493a aVar = (I18nSettingNewVersionActivity.C68493a) obj;
        if (aVar.f153302b && C17873f.f42636l) {
            aVar.f153301a.mo68645h();
        }
        if (i18nSettingNewVersionActivity.f153293b != null) {
            i18nSettingNewVersionActivity.f153293b.dispose();
        }
    }
}
