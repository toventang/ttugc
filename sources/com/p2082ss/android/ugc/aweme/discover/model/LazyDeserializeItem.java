package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem */
public interface LazyDeserializeItem {
    static {
        Covode.recordClassIndex(50464);
    }

    boolean getNeedToBeSupplied();

    void setNeedToBeSupplied(boolean z);
}
