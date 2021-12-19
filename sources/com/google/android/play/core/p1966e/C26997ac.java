package com.google.android.play.core.p1966e;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.e.ac */
public final class C26997ac {

    /* renamed from: a */
    final Map<String, Map<String, String>> f63894a = new HashMap();

    static {
        Covode.recordClassIndex(32473);
    }

    /* renamed from: a */
    public final C26998ad mo44701a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Map<String, String>> entry : this.f63894a.entrySet()) {
            hashMap.put(entry.getKey(), Collections.unmodifiableMap(new HashMap(entry.getValue())));
        }
        return new C26998ad(Collections.unmodifiableMap(hashMap));
    }
}
