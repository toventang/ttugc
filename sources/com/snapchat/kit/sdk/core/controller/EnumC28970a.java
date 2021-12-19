package com.snapchat.kit.sdk.core.controller;

import com.bytedance.covode.number.Covode;

/* renamed from: com.snapchat.kit.sdk.core.controller.a */
public enum EnumC28970a {
    UNKNOWN_ERROR,
    INVALID_OAUTH_RESPONSE,
    OAUTH_TOKEN_GRANT_FAILURE,
    FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE;
    
    public String errorDescription;

    static {
        Covode.recordClassIndex(35161);
    }
}
