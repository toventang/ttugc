package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30076d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60016c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.api.MLDataCenterServiceDefault */
public final class MLDataCenterServiceDefault extends MLDataCenterService {
    static {
        Covode.recordClassIndex(70449);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final void checkAndInit() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, C60095h hVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final C30076d.AbstractC30077a getFeatureStaticGetter() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final C60016c getFeedTrackRangeInfo(String str, int i, boolean z) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final void traceMobClickEvent(String str, JSONObject jSONObject) {
    }

    public final void trackPlayPrepare(String str, Aweme aweme, String str2) {
    }

    public final void trackPlaytime(String str, long j, Aweme aweme, String str2) {
    }
}
