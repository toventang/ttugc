package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.q */
public final class C43863q {
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: a */
    public final String f102236a;
    @AbstractC27891c(mo46611a = "sku_id")

    /* renamed from: b */
    public final String f102237b;

    static {
        Covode.recordClassIndex(52143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43863q)) {
            return false;
        }
        C43863q qVar = (C43863q) obj;
        return C89219l.m154714a(this.f102236a, qVar.f102236a) && C89219l.m154714a(this.f102237b, qVar.f102237b);
    }

    public final int hashCode() {
        String str = this.f102236a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102237b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SkuInfo(productId=" + this.f102236a + ", skuId=" + this.f102237b + ")";
    }

    public C43863q(String str, String str2) {
        this.f102236a = str;
        this.f102237b = str2;
    }
}
