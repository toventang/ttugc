package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60088b;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartDataTrackerServiceDefault */
public final class SmartDataTrackerServiceDefault extends SmartDataTrackerService {
    static {
        Covode.recordClassIndex(70454);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final void checkAndInit() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final void onScenePredictCheckOrRun(String str, C60095h hVar, AbstractC60088b bVar) {
    }

    public final void onSceneRealCheckAndReport(String str, C60095h hVar) {
    }

    public final void putExtData(String str, String str2, String str3, Object obj) {
        C89219l.m154721d(str3, "");
        C89219l.m154721d(obj, "");
    }
}
