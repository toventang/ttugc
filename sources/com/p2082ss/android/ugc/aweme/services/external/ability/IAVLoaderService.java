package com.p2082ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService */
public interface IAVLoaderService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService$ILoaderCallback */
    public interface ILoaderCallback<T> {
        static {
            Covode.recordClassIndex(79822);
        }

        void finish(T t);
    }

    static {
        Covode.recordClassIndex(79821);
    }

    void setLoader(ILoaderCallback<Boolean> iLoaderCallback);

    void setLoaderOnly();
}
