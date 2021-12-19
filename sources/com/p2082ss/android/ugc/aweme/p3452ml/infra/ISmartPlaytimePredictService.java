package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictConfig;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService */
public interface ISmartPlaytimePredictService {
    static {
        Covode.recordClassIndex(70546);
    }

    void checkAndInit();

    void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    void predict(String str, C60095h hVar, AbstractC60088b bVar, AbstractC60091e eVar);
}
