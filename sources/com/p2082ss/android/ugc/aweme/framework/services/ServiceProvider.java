package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.framework.services.ServiceProvider */
public interface ServiceProvider<T> {
    static {
        Covode.recordClassIndex(60677);
    }

    T get();
}
