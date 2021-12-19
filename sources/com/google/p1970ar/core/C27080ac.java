package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.ac */
public final class C27080ac {

    /* renamed from: a */
    final Map<Long, AugmentedFace> f64074a = new C27079ab();

    static {
        Covode.recordClassIndex(32629);
    }

    C27080ac() {
    }

    /* renamed from: a */
    public final synchronized AugmentedFace mo45118a(long j, Session session) {
        MethodCollector.m26663i(9055);
        Map<Long, AugmentedFace> map = this.f64074a;
        Long valueOf = Long.valueOf(j);
        AugmentedFace augmentedFace = map.get(valueOf);
        if (augmentedFace == null) {
            AugmentedFace augmentedFace2 = new AugmentedFace(j, session);
            this.f64074a.put(valueOf, augmentedFace2);
            MethodCollector.m26664o(9055);
            return augmentedFace2;
        }
        MethodCollector.m26664o(9055);
        return augmentedFace;
    }
}
