package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.q */
public final class C44088q {
    @AbstractC27891c(mo46611a = "raw_text")

    /* renamed from: a */
    public final String f102819a;
    @AbstractC27891c(mo46611a = "link")

    /* renamed from: b */
    public final List<String> f102820b;

    static {
        Covode.recordClassIndex(52399);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44088q)) {
            return false;
        }
        C44088q qVar = (C44088q) obj;
        return C89219l.m154714a(this.f102819a, qVar.f102819a) && C89219l.m154714a(this.f102820b, qVar.f102820b);
    }

    public final int hashCode() {
        String str = this.f102819a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f102820b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PaymentMethodPolicy(rawText=" + this.f102819a + ", links=" + this.f102820b + ")";
    }
}
