package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public final class C25301a {

    /* renamed from: b */
    private static int f60044b = 31;

    /* renamed from: a */
    public int f60045a = 1;

    static {
        Covode.recordClassIndex(30691);
    }

    /* renamed from: a */
    public final C25301a mo41399a(boolean z) {
        this.f60045a = (f60044b * this.f60045a) + (z ? 1 : 0);
        return this;
    }

    /* renamed from: a */
    public final C25301a mo41398a(Object obj) {
        int hashCode;
        int i = f60044b * this.f60045a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f60045a = i + hashCode;
        return this;
    }
}
