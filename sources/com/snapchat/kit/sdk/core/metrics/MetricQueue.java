package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;

public interface MetricQueue<T> {
    static {
        Covode.recordClassIndex(35174);
    }

    void push(T t);
}
