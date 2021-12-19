package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;

public interface ReadableMapKeySetIterator {
    static {
        Covode.recordClassIndex(34347);
    }

    boolean hasNextKey();

    String nextKey();
}
