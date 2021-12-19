package com.p2082ss.android.ugc.aweme.services;

import android.app.Application;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.IAVInitializer */
public interface IAVInitializer {
    static {
        Covode.recordClassIndex(79614);
    }

    void initMonitor(Application application);

    void initialize(Application application);
}
