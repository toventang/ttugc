package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;

public interface RefreshAccessTokenResult {
    static {
        Covode.recordClassIndex(35357);
    }

    void onRefreshAccessTokenFailure(EnumC29026b bVar);

    void onRefreshAccessTokenSuccess(String str);
}
