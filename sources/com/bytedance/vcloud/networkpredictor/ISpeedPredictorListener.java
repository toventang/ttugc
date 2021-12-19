package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public interface ISpeedPredictorListener {
    static {
        Covode.recordClassIndex(27618);
    }

    String getCountry();

    boolean getDownFileState(String str, String str2, String str3);

    String getFilesCachePath();

    Object getIOExecutor();

    String getNetworkType();

    int getPhoneSignal();
}
