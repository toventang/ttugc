package com.appsflyer;

import com.bytedance.covode.number.Covode;

public interface AppsFlyerTrackingRequestListener {
    static {
        Covode.recordClassIndex(2519);
    }

    void onTrackingRequestFailure(String str);

    void onTrackingRequestSuccess();
}
