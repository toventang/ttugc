package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30076d;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60016c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.api.IMLDataCenterService */
public interface IMLDataCenterService {
    static {
        Covode.recordClassIndex(70433);
    }

    void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig);

    void checkAndInit();

    boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, C60095h hVar);

    C30076d.AbstractC30077a getFeatureStaticGetter();

    C60016c getFeedTrackRangeInfo(String str, int i, boolean z);

    void traceMobClickEvent(String str, JSONObject jSONObject);
}
