package com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2836b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.b.a */
public final class C44326a {

    /* renamed from: a */
    public boolean f103372a;

    /* renamed from: b */
    public int f103373b = -1;

    /* renamed from: c */
    public final Voucher f103374c;

    static {
        Covode.recordClassIndex(52640);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44326a) && C89219l.m154714a(this.f103374c, ((C44326a) obj).f103374c);
        }
        return true;
    }

    public final int hashCode() {
        Voucher voucher = this.f103374c;
        if (voucher != null) {
            return voucher.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CouponModel(voucherAttached=" + this.f103374c + ")";
    }

    public C44326a(Voucher voucher) {
        C89219l.m154721d(voucher, "");
        this.f103374c = voucher;
    }
}
