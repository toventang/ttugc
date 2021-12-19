package com.bytedance.ugc.ugcwidget.cache;

import com.bytedance.covode.number.Covode;

public final class UGCCache<K, V> {

    public interface ValueBuilder<K, V> {
        static {
            Covode.recordClassIndex(27548);
        }

        V buildValue(K k);
    }

    static {
        Covode.recordClassIndex(27547);
    }
}
