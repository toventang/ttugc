package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public interface ISpeedPredictorMLConfig {
    static {
        Covode.recordClassIndex(27619);
    }

    boolean enable();

    String getModelDirName();

    String getModelType();

    String modelUrl();
}
