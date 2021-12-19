package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Objects;

/* renamed from: com.snapchat.kit.sdk.core.metrics.d */
public final class C29005d<T> {
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "retry_count")

    /* renamed from: a */
    public int f68518a;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "event")

    /* renamed from: b */
    public T f68519b;

    static {
        Covode.recordClassIndex(35202);
    }

    public C29005d(T t) {
        this(t, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29005d)) {
            return false;
        }
        C29005d dVar = (C29005d) obj;
        if (!Objects.equals(Integer.valueOf(this.f68518a), Integer.valueOf(dVar.f68518a)) || !Objects.equals(this.f68519b, dVar.f68519b)) {
            return false;
        }
        return true;
    }

    public C29005d(T t, int i) {
        this.f68518a = i;
        this.f68519b = t;
    }
}
