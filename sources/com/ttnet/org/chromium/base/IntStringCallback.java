package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public interface IntStringCallback {
    static {
        Covode.recordClassIndex(103346);
    }

    void onResult(int i, String str);
}
