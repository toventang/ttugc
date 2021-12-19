package com.bytedance.p1399im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC27894b;
import com.google.gson.C27896c;

/* renamed from: com.bytedance.im.core.internal.utils.a */
public final class C19992a implements AbstractC27894b {
    static {
        Covode.recordClassIndex(22837);
    }

    @Override // com.google.gson.AbstractC27894b
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.AbstractC27894b
    public final boolean shouldSkipField(C27896c cVar) {
        if (cVar.f65504a.getAnnotation(AbstractC19998g.class) != null) {
            return true;
        }
        return false;
    }
}
