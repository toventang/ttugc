package com.p2082ss.android.ugc.aweme.simkit.config;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper;

/* renamed from: com.ss.android.ugc.aweme.simkit.config.SimPlayerConfigInjectWrapper */
public class SimPlayerConfigInjectWrapper implements ISimPlayerConfigInjectWrapper {
    static {
        Covode.recordClassIndex(87428);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper
    public ISimPlayerConfig wrap(ISimPlayerConfig iSimPlayerConfig) {
        return new C74612b(iSimPlayerConfig);
    }
}
