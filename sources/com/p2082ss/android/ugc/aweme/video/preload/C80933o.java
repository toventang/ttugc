package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.api.p4214a.C80842n;
import com.p2082ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* renamed from: com.ss.android.ugc.aweme.video.preload.o */
public final class C80933o {

    /* renamed from: a */
    public static IVideoPreloadConfig f180960a;

    static {
        Covode.recordClassIndex(94235);
    }

    /* renamed from: a */
    public static IVideoPreloadConfig m140451a() {
        IVideoPreloadConfig iVideoPreloadConfig = f180960a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig;
        }
        return new C80842n(((IVideoPreloadConfigInjectWrapper) InjectedConfigManager.getConfig(IVideoPreloadConfigInjectWrapper.class)).wrap((IVideoPreloadConfig) InjectedConfigManager.getConfig(IVideoPreloadConfig.class)));
    }
}
