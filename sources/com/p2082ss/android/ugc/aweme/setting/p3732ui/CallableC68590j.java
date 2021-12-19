package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.j */
final /* synthetic */ class CallableC68590j implements Callable {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153459a;

    static {
        Covode.recordClassIndex(80846);
    }

    CallableC68590j(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f153459a = i18nSettingNewVersionActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153459a;
        C51423a.m95784a(3, "clear-cache", "start clear cache without disk manager");
        IExternalService a = AVExternalServiceImpl.m113114a();
        a.configService().cacheConfig().clearEffectCache();
        a.configService().cacheConfig().clearMvCache();
        File file = new File(I18nSettingNewVersionActivity.m120916a(C17867d.m33078a()).getAbsolutePath() + "/aweme_monitor");
        if (file.exists()) {
            I18nSettingNewVersionActivity.m120918a(file);
        }
        C80720e.m139925b(i18nSettingNewVersionActivity.getCacheDir());
        C80937s.m140452a().mo124078c();
        C73955am.m130053a();
        C51423a.m95791b(3, "clear-cache", "finish clear cache without disk manager");
        return null;
    }
}
