package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.p2067a.C28958f;

public interface AuthTokenManager {
    static {
        Covode.recordClassIndex(35352);
    }

    void clearToken();

    String getAccessToken();

    boolean hasAccessToScope(String str);

    boolean isUserLoggedIn();

    void refreshAccessToken(RefreshAccessTokenResult refreshAccessTokenResult);

    void startTokenGrant();

    void startTokenGrantWithOptions(C28958f fVar);
}
