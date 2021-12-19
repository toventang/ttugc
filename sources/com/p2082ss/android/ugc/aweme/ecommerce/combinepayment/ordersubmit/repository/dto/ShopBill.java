package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopBill */
public final class ShopBill {
    @AbstractC27891c(mo46611a = "product_total")
    private final String productTotal;
    @AbstractC27891c(mo46611a = "total")
    private final Price total;

    static {
        Covode.recordClassIndex(52123);
    }

    public static /* synthetic */ ShopBill copy$default(ShopBill shopBill, String str, Price price, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopBill.productTotal;
        }
        if ((i & 2) != 0) {
            price = shopBill.total;
        }
        return shopBill.copy(str, price);
    }

    public final String component1() {
        return this.productTotal;
    }

    public final Price component2() {
        return this.total;
    }

    public final ShopBill copy(String str, Price price) {
        return new ShopBill(str, price);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBill)) {
            return false;
        }
        ShopBill shopBill = (ShopBill) obj;
        return C89219l.m154714a(this.productTotal, shopBill.productTotal) && C89219l.m154714a(this.total, shopBill.total);
    }

    public final int hashCode() {
        String str = this.productTotal;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Price price = this.total;
        if (price != null) {
            i = price.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShopBill(productTotal=" + this.productTotal + ", total=" + this.total + ")";
    }

    public final String getProductTotal() {
        return this.productTotal;
    }

    public final Price getTotal() {
        return this.total;
    }

    public final ShopBill merge(ShopBill shopBill) {
        if (shopBill == null) {
            return this;
        }
        String str = shopBill.productTotal;
        if (str == null) {
            str = this.productTotal;
        }
        Price price = shopBill.total;
        if (price == null) {
            price = this.total;
        }
        return new ShopBill(str, price);
    }

    public ShopBill(String str, Price price) {
        this.productTotal = str;
        this.total = price;
    }
}
