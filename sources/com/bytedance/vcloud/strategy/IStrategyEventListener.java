package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;

public interface IStrategyEventListener {
    static {
        Covode.recordClassIndex(27637);
    }

    void onEvent(String str, int i, int i2, String str2);

    void onEventLog(String str, String str2);
}
