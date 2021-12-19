package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public class SpeedPredictorConfig {
    private static int sLogLevel = 3;

    public static int getLogLevel() {
        return sLogLevel;
    }

    static {
        Covode.recordClassIndex(27622);
    }

    public static void setLoglevel(int i) {
        sLogLevel = i;
    }
}
