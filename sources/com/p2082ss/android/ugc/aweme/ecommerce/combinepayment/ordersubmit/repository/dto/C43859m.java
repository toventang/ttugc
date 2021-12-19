package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.m */
public final class C43859m {
    @AbstractC27891c(mo46611a = "bill_items")

    /* renamed from: a */
    public final List<BillItem> f102225a;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: b */
    public final Price f102226b;

    static {
        Covode.recordClassIndex(52139);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43859m)) {
            return false;
        }
        C43859m mVar = (C43859m) obj;
        return C89219l.m154714a(this.f102225a, mVar.f102225a) && C89219l.m154714a(this.f102226b, mVar.f102226b);
    }

    public final int hashCode() {
        List<BillItem> list = this.f102225a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Price price = this.f102226b;
        if (price != null) {
            i = price.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PriceInfoRequestParams(billItems=" + this.f102225a + ", total=" + this.f102226b + ")";
    }

    public C43859m(List<BillItem> list, Price price) {
        this.f102225a = list;
        this.f102226b = price;
    }
}
