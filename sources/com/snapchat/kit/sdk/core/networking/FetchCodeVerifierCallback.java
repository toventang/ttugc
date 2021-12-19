package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;

public interface FetchCodeVerifierCallback {
    static {
        Covode.recordClassIndex(35354);
    }

    void onCodeVerifierFetchFailed(Throwable th);

    void onCodeVerifierFetchedSuccessfully(String str);
}
