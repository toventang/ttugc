package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.SkuReachable */
public final class SkuReachable {
    @AbstractC27891c(mo46611a = "order_sku")
    private final OrderSKUDTO orderSku;
    @AbstractC27891c(mo46611a = "reachable")
    private final Boolean reachable;

    static {
        Covode.recordClassIndex(52125);
    }

    public static /* synthetic */ SkuReachable copy$default(SkuReachable skuReachable, OrderSKUDTO orderSKUDTO, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSKUDTO = skuReachable.orderSku;
        }
        if ((i & 2) != 0) {
            bool = skuReachable.reachable;
        }
        return skuReachable.copy(orderSKUDTO, bool);
    }

    public final OrderSKUDTO component1() {
        return this.orderSku;
    }

    public final Boolean component2() {
        return this.reachable;
    }

    public final SkuReachable copy(OrderSKUDTO orderSKUDTO, Boolean bool) {
        return new SkuReachable(orderSKUDTO, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuReachable)) {
            return false;
        }
        SkuReachable skuReachable = (SkuReachable) obj;
        return C89219l.m154714a(this.orderSku, skuReachable.orderSku) && C89219l.m154714a(this.reachable, skuReachable.reachable);
    }

    public final int hashCode() {
        OrderSKUDTO orderSKUDTO = this.orderSku;
        int i = 0;
        int hashCode = (orderSKUDTO != null ? orderSKUDTO.hashCode() : 0) * 31;
        Boolean bool = this.reachable;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SkuReachable(orderSku=" + this.orderSku + ", reachable=" + this.reachable + ")";
    }

    public final OrderSKUDTO getOrderSku() {
        return this.orderSku;
    }

    public final Boolean getReachable() {
        return this.reachable;
    }

    public SkuReachable(OrderSKUDTO orderSKUDTO, Boolean bool) {
        this.orderSku = orderSKUDTO;
        this.reachable = bool;
    }
}
