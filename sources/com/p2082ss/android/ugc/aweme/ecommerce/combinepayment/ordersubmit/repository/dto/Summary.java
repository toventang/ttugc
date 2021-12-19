package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Summary */
public final class Summary {
    @AbstractC27891c(mo46611a = "bill_items")
    private final List<BillItem> billItems;
    @AbstractC27891c(mo46611a = "total")
    private final Price total;

    static {
        Covode.recordClassIndex(52126);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Summary */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Summary copy$default(Summary summary, List list, Price price, int i, Object obj) {
        if ((i & 1) != 0) {
            list = summary.billItems;
        }
        if ((i & 2) != 0) {
            price = summary.total;
        }
        return summary.copy(list, price);
    }

    public final List<BillItem> component1() {
        return this.billItems;
    }

    public final Price component2() {
        return this.total;
    }

    public final Summary copy(List<BillItem> list, Price price) {
        return new Summary(list, price);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return C89219l.m154714a(this.billItems, summary.billItems) && C89219l.m154714a(this.total, summary.total);
    }

    public final int hashCode() {
        List<BillItem> list = this.billItems;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Price price = this.total;
        if (price != null) {
            i = price.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Summary(billItems=" + this.billItems + ", total=" + this.total + ")";
    }

    public final List<BillItem> getBillItems() {
        return this.billItems;
    }

    public final Price getTotal() {
        return this.total;
    }

    public final Summary merge(Summary summary) {
        if (summary == null) {
            return this;
        }
        List<BillItem> list = summary.billItems;
        if (list == null) {
            list = this.billItems;
        }
        Price price = summary.total;
        if (price == null) {
            price = this.total;
        }
        return new Summary(list, price);
    }

    public Summary(List<BillItem> list, Price price) {
        this.billItems = list;
        this.total = price;
    }
}
