package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;

public interface ILogCallback {
    static {
        Covode.recordClassIndex(27635);
    }

    void log(String str);
}
