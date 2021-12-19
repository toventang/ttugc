package com.bytedance.ugc.glue.http;

import com.bytedance.covode.number.Covode;

public interface UGCCallback<T> {
    static {
        Covode.recordClassIndex(27528);
    }

    void onResponse(int i, T t);
}
