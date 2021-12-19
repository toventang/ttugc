package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

public interface SPerfListener {
    static {
        Covode.recordClassIndex(35078);
    }

    void onHighTempWarning(int i);

    void onReleasedByTimeout();
}
