package com.bytedance.router;

import com.bytedance.covode.number.Covode;

public interface IRouterInjectInitializer {
    static {
        Covode.recordClassIndex(25811);
    }

    void injectInitialize();
}
