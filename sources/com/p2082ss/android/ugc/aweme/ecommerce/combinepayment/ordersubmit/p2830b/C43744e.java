package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.e */
public final class C43744e {

    /* renamed from: a */
    public final boolean f101977a;

    static {
        Covode.recordClassIndex(52009);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43744e) && this.f101977a == ((C43744e) obj).f101977a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f101977a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "PolicyVO(reachable=" + this.f101977a + ")";
    }

    public C43744e(boolean z) {
        this.f101977a = z;
    }
}
