package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;

public interface Callback {
    static {
        Covode.recordClassIndex(34339);
    }

    void invoke(Object... objArr);
}
