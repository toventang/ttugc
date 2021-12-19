package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60088b;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;

/* renamed from: com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService */
public interface ISmartDataTrackerService {
    static {
        Covode.recordClassIndex(70434);
    }

    void checkAndInit();

    void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig);

    boolean enable(String str);

    void onScenePredictCheckOrRun(String str, C60095h hVar, AbstractC60088b bVar);
}
