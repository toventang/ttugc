package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IRetrofit */
public interface IRetrofit {
    static {
        Covode.recordClassIndex(60668);
    }

    <T> T create(Class<T> cls);
}
