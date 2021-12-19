package com.snapchat.kit.sdk.creative.api;

import com.bytedance.covode.number.Covode;

public interface SnapCreativeKitCompletionCallback {
    static {
        Covode.recordClassIndex(35394);
    }

    void onSendFailed(EnumC29049b bVar);

    void onSendSuccess();
}
