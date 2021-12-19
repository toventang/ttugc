package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.n */
final /* synthetic */ class C68594n implements AbstractC88433f {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153463a;

    static {
        Covode.recordClassIndex(80850);
    }

    C68594n(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f153463a = i18nSettingNewVersionActivity;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153463a;
        ((ITpcConsentService) obj).mo68646i();
        if (i18nSettingNewVersionActivity.f153293b != null) {
            i18nSettingNewVersionActivity.f153293b.dispose();
        }
    }
}
