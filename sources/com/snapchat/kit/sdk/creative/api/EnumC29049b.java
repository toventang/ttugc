package com.snapchat.kit.sdk.creative.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.snapchat.kit.sdk.creative.api.b */
public enum EnumC29049b {
    GENERIC_ERROR(1),
    SNAPCHAT_NOT_INSTALLED(2),
    SNAPCHAT_CANNOT_SHARE_CONTENT(3);
    
    private int mCode;

    static {
        Covode.recordClassIndex(35396);
    }

    private EnumC29049b(int i) {
        this.mCode = i;
    }
}
