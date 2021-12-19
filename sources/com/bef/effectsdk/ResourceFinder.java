package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;

public interface ResourceFinder {
    static {
        Covode.recordClassIndex(2698);
    }

    long createNativeResourceFinder(long j);

    void release(long j);
}
