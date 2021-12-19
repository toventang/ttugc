package com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.payment.a.a */
public final class C44626a {
    @AbstractC27891c(mo46611a = "billing_country_region")

    /* renamed from: a */
    public final String f104101a;
    @AbstractC27891c(mo46611a = "billing_state")

    /* renamed from: b */
    public final String f104102b;
    @AbstractC27891c(mo46611a = "billing_city")

    /* renamed from: c */
    public final String f104103c;
    @AbstractC27891c(mo46611a = "billing_street")

    /* renamed from: d */
    public final String f104104d;
    @AbstractC27891c(mo46611a = "billing_postal_code")

    /* renamed from: e */
    public final String f104105e;

    static {
        Covode.recordClassIndex(53005);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44626a)) {
            return false;
        }
        C44626a aVar = (C44626a) obj;
        return C89219l.m154714a(this.f104101a, aVar.f104101a) && C89219l.m154714a(this.f104102b, aVar.f104102b) && C89219l.m154714a(this.f104103c, aVar.f104103c) && C89219l.m154714a(this.f104104d, aVar.f104104d) && C89219l.m154714a(this.f104105e, aVar.f104105e);
    }

    public final int hashCode() {
        String str = this.f104101a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104102b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104103c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104104d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104105e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AddressForPay(region=" + this.f104101a + ", state=" + this.f104102b + ", city=" + this.f104103c + ", street=" + this.f104104d + ", postalCode=" + this.f104105e + ")";
    }
}
