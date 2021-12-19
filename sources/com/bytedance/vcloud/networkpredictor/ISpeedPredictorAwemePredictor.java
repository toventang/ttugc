package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public interface ISpeedPredictorAwemePredictor {
    static {
        Covode.recordClassIndex(27617);
    }

    double calculateSpeed();

    void configMlModel(ISpeedPredictorMLConfig iSpeedPredictorMLConfig);

    double getSpeed();

    void monitorVideoSpeed(double d, double d2, long j);

    void setPredictorListener(ISpeedPredictorAwemeListener iSpeedPredictorAwemeListener);

    void setSpeedAlgorithmType(int i);
}
