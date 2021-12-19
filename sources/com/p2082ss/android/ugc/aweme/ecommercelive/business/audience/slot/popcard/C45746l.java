package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.l */
public final class C45746l {

    /* renamed from: a */
    public final long f106550a;

    /* renamed from: b */
    public final long f106551b;

    static {
        Covode.recordClassIndex(54264);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45746l)) {
            return false;
        }
        C45746l lVar = (C45746l) obj;
        return this.f106550a == lVar.f106550a && this.f106551b == lVar.f106551b;
    }

    public final String toString() {
        return "FlashSaleInfo(startTime=" + this.f106550a + ", endTime=" + this.f106551b + ")";
    }

    public final int hashCode() {
        long j = this.f106550a;
        long j2 = this.f106551b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C45746l(long j, long j2) {
        this.f106550a = j;
        this.f106551b = j2;
    }
}
