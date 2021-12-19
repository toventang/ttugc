package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictExperiment */
public final class SmartPlaytimePredictExperiment {
    public static final SmartPlaytimePredictConfig DEFAULT = null;
    public static final SmartPlaytimePredictExperiment INSTANCE = new SmartPlaytimePredictExperiment();
    private static boolean hasInit;
    private static SmartPlaytimePredictConfig serviceConfig;

    private SmartPlaytimePredictExperiment() {
    }

    public final SmartPlaytimePredictConfig getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(70413);
    }

    public final SmartPlaytimePredictConfig getPlaytimePredictServiceConfig() {
        if (!hasInit) {
            C16048b a = C16048b.m29633a();
            SmartPlaytimePredictConfig smartPlaytimePredictConfig = DEFAULT;
            SmartPlaytimePredictConfig smartPlaytimePredictConfig2 = (SmartPlaytimePredictConfig) a.mo25416a(true, "smart_playtime_predict_config", SmartPlaytimePredictConfig.class, smartPlaytimePredictConfig);
            if (smartPlaytimePredictConfig2 != null) {
                smartPlaytimePredictConfig = smartPlaytimePredictConfig2;
            }
            serviceConfig = smartPlaytimePredictConfig;
            hasInit = true;
        }
        return serviceConfig;
    }
}
