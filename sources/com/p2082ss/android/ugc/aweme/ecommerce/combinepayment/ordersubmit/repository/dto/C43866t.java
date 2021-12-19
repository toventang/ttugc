package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t */
public final class C43866t {
    @AbstractC27891c(mo46611a = "voucher_id")

    /* renamed from: a */
    public final String f102245a;
    @AbstractC27891c(mo46611a = "voucher_type_id")

    /* renamed from: b */
    public final String f102246b;

    static {
        Covode.recordClassIndex(52146);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43866t)) {
            return false;
        }
        C43866t tVar = (C43866t) obj;
        return C89219l.m154714a(this.f102245a, tVar.f102245a) && C89219l.m154714a(this.f102246b, tVar.f102246b);
    }

    public final int hashCode() {
        String str = this.f102245a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102246b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Voucher(voucherId=" + this.f102245a + ", voucherTypeId=" + this.f102246b + ")";
    }

    public C43866t(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f102245a = str;
        this.f102246b = str2;
    }
}
