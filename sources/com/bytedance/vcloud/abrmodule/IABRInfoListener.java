package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IABRInfoListener {
    static {
        Covode.recordClassIndex(27588);
    }

    void onInfo(int i, int i2);
}
