package com.squareup.wire;

import com.bytedance.covode.number.Covode;

public interface WireDeserializeErrorListener {
    static {
        Covode.recordClassIndex(35708);
    }

    void onError(Class cls, String str, Throwable th);
}
