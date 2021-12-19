package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.d */
public final class C43743d {

    /* renamed from: a */
    public final VoucherInfo f101976a;

    static {
        Covode.recordClassIndex(52008);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43743d) && C89219l.m154714a(this.f101976a, ((C43743d) obj).f101976a);
        }
        return true;
    }

    public final int hashCode() {
        VoucherInfo voucherInfo = this.f101976a;
        if (voucherInfo != null) {
            return voucherInfo.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformCouponVO(voucherInfo=" + this.f101976a + ")";
    }

    public C43743d(VoucherInfo voucherInfo) {
        this.f101976a = voucherInfo;
    }
}
