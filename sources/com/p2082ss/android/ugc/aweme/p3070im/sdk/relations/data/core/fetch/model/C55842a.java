package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a */
public final class C55842a {
    @AbstractC27891c(mo46611a = "max_time")

    /* renamed from: a */
    public final long f127284a;
    @AbstractC27891c(mo46611a = "min_time")

    /* renamed from: b */
    public final long f127285b;

    static {
        Covode.recordClassIndex(65632);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55842a)) {
            return false;
        }
        C55842a aVar = (C55842a) obj;
        return this.f127284a == aVar.f127284a && this.f127285b == aVar.f127285b;
    }

    public final String toString() {
        return "RelationFetchMissingPage(toFetchMaxTime=" + this.f127284a + ", toFetchMinTime=" + this.f127285b + ")";
    }

    public final int hashCode() {
        long j = this.f127284a;
        long j2 = this.f127285b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C55842a(long j, long j2) {
        this.f127284a = j;
        this.f127285b = j2;
    }
}
