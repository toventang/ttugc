package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.ab */
public final class C27079ab extends LinkedHashMap<Long, AugmentedFace> {
    static {
        Covode.recordClassIndex(32628);
    }

    C27079ab() {
        super(1, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, AugmentedFace> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
