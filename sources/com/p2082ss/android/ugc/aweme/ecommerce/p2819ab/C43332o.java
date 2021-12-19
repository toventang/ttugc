package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.o */
public final class C43332o {
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: a */
    public final Boolean f101128a = null;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: b */
    public final int f101129b = 0;

    static {
        Covode.recordClassIndex(51546);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43332o)) {
            return false;
        }
        C43332o oVar = (C43332o) obj;
        return C89219l.m154714a(this.f101128a, oVar.f101128a) && this.f101129b == oVar.f101129b;
    }

    public final int hashCode() {
        Boolean bool = this.f101128a;
        return ((bool != null ? bool.hashCode() : 0) * 31) + this.f101129b;
    }

    public final String toString() {
        return "SkuPrefetchConfig(enable=" + this.f101128a + ", duration=" + this.f101129b + ")";
    }

    private C43332o() {
    }
}
