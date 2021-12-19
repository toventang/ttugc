package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface IABRModule {
    static {
        Covode.recordClassIndex(27589);
    }

    void addBufferInfo(int i, String str, long j, long j2, long j3);

    float getFloatOption(int i, float f);

    long getLongOption(int i, long j);

    ABRResult getPredict();

    String getVersion();

    void init(IPlayStateSupplier iPlayStateSupplier);

    ABRResult onceSelect(int i, int i2);

    void release();

    void setDeviceInfo(IDeviceInfo iDeviceInfo);

    void setDoubleOptionForKey(int i, double d);

    void setFloatOptionForKey(int i, float f);

    void setInfoListener(IABRInfoListener iABRInfoListener);

    void setIntOptionForKey(int i, int i2);

    void setLongOptionForKey(int i, long j);

    void setMediaInfo(List<IVideoStream> list, List<IAudioStream> list2);

    void setSRBenchmark(Map<Integer, Integer> map);

    void setSRBenchmarkMap(Map<Integer, List<Integer>> map);

    void setStringOptionForKey(int i, String str);

    void start(int i, int i2);

    void stop();
}
