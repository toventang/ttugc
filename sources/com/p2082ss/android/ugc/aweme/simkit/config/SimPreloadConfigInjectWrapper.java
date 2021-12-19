package com.p2082ss.android.ugc.aweme.simkit.config;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper;
import com.p2082ss.android.ugc.aweme.video.preload.api.p4214a.C80842n;

/* renamed from: com.ss.android.ugc.aweme.simkit.config.SimPreloadConfigInjectWrapper */
public class SimPreloadConfigInjectWrapper implements IVideoPreloadConfigInjectWrapper {
    static {
        Covode.recordClassIndex(87429);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper
    public IVideoPreloadConfig wrap(IVideoPreloadConfig iVideoPreloadConfig) {
        return new C80842n(new C74614c(iVideoPreloadConfig));
    }
}
