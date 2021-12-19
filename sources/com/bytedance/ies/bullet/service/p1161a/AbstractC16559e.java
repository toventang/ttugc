package com.bytedance.ies.bullet.service.p1161a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.bullet.service.a.e */
public interface AbstractC16559e<K, V> {
    static {
        Covode.recordClassIndex(18995);
    }

    Boolean getBoolean(K k);

    String getString(K k);

    boolean putBooleanIfAbsent(K k, boolean z);

    boolean putStringIfAbsent(K k, String str);
}
