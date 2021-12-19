package com.p2082ss.android.ugc.aweme.settingsrequest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.news.common.service.manager.C21520c;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.k */
public final class C68811k extends C68790d {
    static {
        Covode.recordClassIndex(81088);
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.C68790d, com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz.AbstractC68043a
    /* renamed from: a */
    public final void mo96447a(C68174d dVar) {
        super.mo96447a(dVar);
        ISplashAdService iSplashAdService = (ISplashAdService) C21520c.m40424a(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.mo28711a(SettingsManager.m29616a().mo25400a("awesome_splash_filter_enable", false));
        }
        SettingsRequestServiceImpl.m65417i();
    }
}
