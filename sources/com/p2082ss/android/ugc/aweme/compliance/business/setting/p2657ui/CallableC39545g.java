package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.g */
final /* synthetic */ class CallableC39545g implements Callable {

    /* renamed from: a */
    private final ChildrenModeSettingActivity f93277a;

    static {
        Covode.recordClassIndex(47253);
    }

    CallableC39545g(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f93277a = childrenModeSettingActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f93277a;
        File file = new File(ChildrenModeSettingActivity.m80334a(C17867d.m33078a()).getAbsolutePath() + "/aweme_monitor");
        if (file.exists()) {
            ChildrenModeSettingActivity.m80336a(file);
        }
        C80720e.m139925b(childrenModeSettingActivity.getCacheDir());
        C80937s.m140452a().mo124078c();
        C73955am.m130053a();
        AVExternalServiceImpl.m113114a().configService().cacheConfig().clearEffectCache();
        return null;
    }
}
