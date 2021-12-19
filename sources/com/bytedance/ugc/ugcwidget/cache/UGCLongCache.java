package com.bytedance.ugc.ugcwidget.cache;

import com.bytedance.covode.number.Covode;

public final class UGCLongCache<T> {

    public interface ValueBuilder<T> {
        static {
            Covode.recordClassIndex(27550);
        }

        T buildValue(long j);
    }

    static {
        Covode.recordClassIndex(27549);
    }
}
