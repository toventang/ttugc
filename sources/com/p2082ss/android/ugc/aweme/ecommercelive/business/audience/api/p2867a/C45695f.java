package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.f */
public final class C45695f {
    @AbstractC27891c(mo46611a = "begin_time")

    /* renamed from: a */
    public final long f106411a = 0;
    @AbstractC27891c(mo46611a = "end_time")

    /* renamed from: b */
    public final long f106412b = 0;

    static {
        Covode.recordClassIndex(54210);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45695f)) {
            return false;
        }
        C45695f fVar = (C45695f) obj;
        return this.f106411a == fVar.f106411a && this.f106412b == fVar.f106412b;
    }

    public final String toString() {
        return "FlashSaleDTO(beginTime=" + this.f106411a + ", endTime=" + this.f106412b + ")";
    }

    private C45695f() {
    }

    public final int hashCode() {
        long j = this.f106411a;
        long j2 = this.f106412b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
