package com.snapchat.kit.sdk.core.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.snapchat.kit.sdk.core.config.a */
public final class C28960a implements Serializable {
    @AbstractC27891c(mo46611a = "query")

    /* renamed from: a */
    private final String f68428a;
    @AbstractC27891c(mo46611a = "variables")

    /* renamed from: b */
    private final Map<String, Object> f68429b;

    static {
        Covode.recordClassIndex(35146);
    }

    public C28960a(String str, Map<String, Object> map) {
        this.f68428a = str;
        this.f68429b = map;
    }
}
