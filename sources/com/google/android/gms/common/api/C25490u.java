package com.google.android.gms.common.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.u */
public final class C25490u extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f60474a;

    static {
        Covode.recordClassIndex(30889);
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f60474a);
        return new StringBuilder(String.valueOf(valueOf).length() + 8).append("Missing ").append(valueOf).toString();
    }

    public C25490u(Feature feature) {
        this.f60474a = feature;
    }
}
