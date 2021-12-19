package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.a */
public final class C44771a {

    /* renamed from: a */
    public final int f104453a;

    /* renamed from: b */
    public final SellerInfo f104454b;

    /* renamed from: c */
    public final Boolean f104455c;

    static {
        Covode.recordClassIndex(53157);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44771a)) {
            return false;
        }
        C44771a aVar = (C44771a) obj;
        return this.f104453a == aVar.f104453a && C89219l.m154714a(this.f104454b, aVar.f104454b) && C89219l.m154714a(this.f104455c, aVar.f104455c);
    }

    public final int hashCode() {
        int i = this.f104453a * 31;
        SellerInfo sellerInfo = this.f104454b;
        int i2 = 0;
        int hashCode = (i + (sellerInfo != null ? sellerInfo.hashCode() : 0)) * 31;
        Boolean bool = this.f104455c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BottomBarVO(status=" + this.f104453a + ", sellerInfo=" + this.f104454b + ", isCouponPriceShowed=" + this.f104455c + ")";
    }

    public C44771a(int i, SellerInfo sellerInfo, Boolean bool) {
        this.f104453a = i;
        this.f104454b = sellerInfo;
        this.f104455c = bool;
    }
}
