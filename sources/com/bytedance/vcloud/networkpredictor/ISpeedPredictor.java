package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import java.util.Map;

public interface ISpeedPredictor {
    static {
        Covode.recordClassIndex(27615);
    }

    void close();

    float getAverageDownloadSpeed(int i, int i2, boolean z);

    Map<String, String> getDownloadSpeed(int i);

    float getLastPredictConfidence();

    String getMultidimensionalDownloadSpeeds();

    SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj();

    String getMultidimensionalPredictSpeeds();

    SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj();

    float getPredictSpeed();

    float getPredictSpeed(int i);

    String getVersion();

    void prepare();

    void release();

    void setConfigInfo(Map map);

    void setModelComponent(MLComponentManager mLComponentManager);

    void setSpeedQueueSize(int i);

    void start();

    void update(long j, long j2, long j3);

    void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map);

    void update(String str, Map<String, Integer> map);
}
