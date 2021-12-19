package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;

public interface CompletionCallback<T> {
    static {
        Covode.recordClassIndex(35353);
    }

    void onFailure(boolean z, int i, String str);

    void onSuccess(T t);
}
