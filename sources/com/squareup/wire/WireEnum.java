package com.squareup.wire;

import com.bytedance.covode.number.Covode;

public interface WireEnum {
    static {
        Covode.recordClassIndex(35709);
    }

    int getValue();
}
