package com.p2082ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.Supplier */
public interface Supplier<T> {
    static {
        Covode.recordClassIndex(95434);
    }

    T get(int i);
}
