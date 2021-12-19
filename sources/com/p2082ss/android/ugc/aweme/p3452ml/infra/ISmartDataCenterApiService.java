package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService */
public interface ISmartDataCenterApiService {
    static {
        Covode.recordClassIndex(70544);
    }

    void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig);

    boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, C60095h hVar);
}
