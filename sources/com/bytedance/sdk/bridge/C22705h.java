package com.bytedance.sdk.bridge;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.bridge.h */
public final class C22705h {

    /* renamed from: a */
    private final Map<String, C22701d> f53644a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(26526);
    }

    /* renamed from: a */
    public final Collection<C22701d> mo36990a() {
        return this.f53644a.values();
    }

    /* renamed from: a */
    public final boolean mo36992a(String str) {
        return this.f53644a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo36991a(String str, C22701d dVar) {
        try {
            this.f53644a.put(str, dVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
