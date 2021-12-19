package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.f */
public final class C43852f {
    @AbstractC27891c(mo46611a = "buy_now_schema")

    /* renamed from: a */
    public final String f102191a;
    @AbstractC27891c(mo46611a = "address_list_schema")

    /* renamed from: b */
    public final String f102192b;
    @AbstractC27891c(mo46611a = "address_edit_schema")

    /* renamed from: c */
    public final String f102193c;

    static {
        Covode.recordClassIndex(52132);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43852f)) {
            return false;
        }
        C43852f fVar = (C43852f) obj;
        return C89219l.m154714a(this.f102191a, fVar.f102191a) && C89219l.m154714a(this.f102192b, fVar.f102192b) && C89219l.m154714a(this.f102193c, fVar.f102193c);
    }

    public final int hashCode() {
        String str = this.f102191a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102192b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102193c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DynamicSchema(buyNowSchema=" + this.f102191a + ", addressListSchema=" + this.f102192b + ", addressEditSchema=" + this.f102193c + ")";
    }
}
