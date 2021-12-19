package com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.payment.a.c */
public final class C44628c {
    @AbstractC27891c(mo46611a = "cashier")

    /* renamed from: a */
    public final C28022o f104119a;
    @AbstractC27891c(mo46611a = "address")

    /* renamed from: b */
    public C44626a f104120b;

    static {
        Covode.recordClassIndex(53007);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44628c)) {
            return false;
        }
        C44628c cVar = (C44628c) obj;
        return C89219l.m154714a(this.f104119a, cVar.f104119a) && C89219l.m154714a(this.f104120b, cVar.f104120b);
    }

    public final int hashCode() {
        C28022o oVar = this.f104119a;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        C44626a aVar = this.f104120b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PaymentData(cashier=" + this.f104119a + ", address=" + this.f104120b + ")";
    }
}
