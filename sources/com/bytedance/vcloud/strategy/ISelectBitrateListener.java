package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;

public interface ISelectBitrateListener {
    static {
        Covode.recordClassIndex(27636);
    }

    String selectBitrateJsonString(String str, int i);
}
