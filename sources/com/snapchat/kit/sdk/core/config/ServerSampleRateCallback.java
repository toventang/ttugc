package com.snapchat.kit.sdk.core.config;

import com.bytedance.covode.number.Covode;

public interface ServerSampleRateCallback {
    static {
        Covode.recordClassIndex(35145);
    }

    void onServerSampleRateAvailable(double d);

    void onServerSampleRateFailure();
}
