package com.squareup.p2081b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.b.p */
public enum EnumC29294p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: a */
    final int f69508a;

    static {
        Covode.recordClassIndex(35643);
    }

    /* renamed from: a */
    static boolean m58683a(int i) {
        if ((i & NO_CACHE.f69508a) == 0) {
            return true;
        }
        return false;
    }

    private EnumC29294p(int i) {
        this.f69508a = i;
    }
}
