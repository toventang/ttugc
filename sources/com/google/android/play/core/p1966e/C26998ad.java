package com.google.android.play.core.p1966e;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.play.core.e.ad */
public final class C26998ad {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f63895a;

    static {
        Covode.recordClassIndex(32474);
    }

    /* synthetic */ C26998ad(Map map) {
        this.f63895a = map;
    }

    /* renamed from: a */
    public final Map<String, Set<String>> mo44702a(Collection<String> collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.f63895a.keySet()) {
            if (!this.f63895a.containsKey(str)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : this.f63895a.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }
}
