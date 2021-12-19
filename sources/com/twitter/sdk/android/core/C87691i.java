package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.twitter.sdk.android.core.AbstractC87681a;

/* renamed from: com.twitter.sdk.android.core.i */
public class C87691i<T extends AbstractC87681a> {
    @AbstractC27891c(mo46611a = "auth_token")

    /* renamed from: a */
    public final T f199192a;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: b */
    public final long f199193b;

    static {
        Covode.recordClassIndex(103678);
    }

    public int hashCode() {
        int i;
        T t = this.f199192a;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        long j = this.f199193b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C87691i iVar = (C87691i) obj;
            if (this.f199193b != iVar.f199193b) {
                return false;
            }
            T t = this.f199192a;
            T t2 = iVar.f199192a;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public C87691i(T t, long j) {
        if (t != null) {
            this.f199192a = t;
            this.f199193b = j;
            return;
        }
        throw new IllegalArgumentException("AuthToken must not be null.");
    }
}
