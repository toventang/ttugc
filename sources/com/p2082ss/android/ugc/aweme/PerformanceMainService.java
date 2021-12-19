package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.PerformanceMainService */
public interface PerformanceMainService {
    static {
        Covode.recordClassIndex(37971);
    }

    Activity newAddWikiActivity();

    void preloadPushSettingsManager();
}
