package com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.payment.a.d */
public final class C44629d {
    @AbstractC27891c(mo46611a = "amount")

    /* renamed from: a */
    public final String f104121a;
    @AbstractC27891c(mo46611a = "charge_id")

    /* renamed from: b */
    public final String f104122b;
    @AbstractC27891c(mo46611a = "currency")

    /* renamed from: c */
    public final String f104123c;
    @AbstractC27891c(mo46611a = "payment_reference")

    /* renamed from: d */
    public final String f104124d;
    @AbstractC27891c(mo46611a = "sub_merchant_id")

    /* renamed from: e */
    public final String f104125e;

    static {
        Covode.recordClassIndex(53008);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44629d)) {
            return false;
        }
        C44629d dVar = (C44629d) obj;
        return C89219l.m154714a(this.f104121a, dVar.f104121a) && C89219l.m154714a(this.f104122b, dVar.f104122b) && C89219l.m154714a(this.f104123c, dVar.f104123c) && C89219l.m154714a(this.f104124d, dVar.f104124d) && C89219l.m154714a(this.f104125e, dVar.f104125e);
    }

    public final int hashCode() {
        String str = this.f104121a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104122b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104123c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104124d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104125e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "PaymentParams(amount=" + this.f104121a + ", chargeId=" + this.f104122b + ", currency=" + this.f104123c + ", paymentReference=" + this.f104124d + ", subMerchantId=" + this.f104125e + ")";
    }
}
