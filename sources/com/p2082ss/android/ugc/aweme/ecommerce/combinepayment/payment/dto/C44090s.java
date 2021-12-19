package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.s */
public final class C44090s {
    @AbstractC27891c(mo46611a = "payment_method_id")

    /* renamed from: a */
    public final String f102832a;
    @AbstractC27891c(mo46611a = "payment_price")

    /* renamed from: b */
    public final Price f102833b;

    static {
        Covode.recordClassIndex(52401);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44090s)) {
            return false;
        }
        C44090s sVar = (C44090s) obj;
        return C89219l.m154714a(this.f102832a, sVar.f102832a) && C89219l.m154714a(this.f102833b, sVar.f102833b);
    }

    public final int hashCode() {
        String str = this.f102832a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Price price = this.f102833b;
        if (price != null) {
            i = price.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PaymentPrice(paymentMethodId=" + this.f102832a + ", price=" + this.f102833b + ")";
    }
}
