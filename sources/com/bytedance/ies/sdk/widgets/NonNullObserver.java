package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

public interface NonNullObserver<T> extends AbstractC1214u<T> {
    static {
        Covode.recordClassIndex(20444);
    }

    @Override // androidx.lifecycle.AbstractC1214u
    void onChanged(T t);
}
