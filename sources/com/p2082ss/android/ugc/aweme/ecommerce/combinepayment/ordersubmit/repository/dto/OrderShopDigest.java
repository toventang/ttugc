package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest */
public final class OrderShopDigest implements Serializable {
    @AbstractC27891c(mo46611a = "delivery_option")
    private final Integer deliveryOption;
    @AbstractC27891c(mo46611a = "logistics_service_id")
    private final String logisticsServiceId;
    @AbstractC27891c(mo46611a = "order_sku")
    private final List<OrderSKUDTO> orderSKUs;
    @AbstractC27891c(mo46611a = "seller_id")
    private final String sellerId;
    @AbstractC27891c(mo46611a = "warehouse_id")
    private final String warehouseId;

    static {
        Covode.recordClassIndex(52119);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderShopDigest copy$default(OrderShopDigest orderShopDigest, String str, String str2, List list, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderShopDigest.warehouseId;
        }
        if ((i & 2) != 0) {
            str2 = orderShopDigest.sellerId;
        }
        if ((i & 4) != 0) {
            list = orderShopDigest.orderSKUs;
        }
        if ((i & 8) != 0) {
            num = orderShopDigest.deliveryOption;
        }
        if ((i & 16) != 0) {
            str3 = orderShopDigest.logisticsServiceId;
        }
        return orderShopDigest.copy(str, str2, list, num, str3);
    }

    public final String component1() {
        return this.warehouseId;
    }

    public final String component2() {
        return this.sellerId;
    }

    public final List<OrderSKUDTO> component3() {
        return this.orderSKUs;
    }

    public final Integer component4() {
        return this.deliveryOption;
    }

    public final String component5() {
        return this.logisticsServiceId;
    }

    public final OrderShopDigest copy(String str, String str2, List<OrderSKUDTO> list, Integer num, String str3) {
        return new OrderShopDigest(str, str2, list, num, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShopDigest)) {
            return false;
        }
        OrderShopDigest orderShopDigest = (OrderShopDigest) obj;
        return C89219l.m154714a(this.warehouseId, orderShopDigest.warehouseId) && C89219l.m154714a(this.sellerId, orderShopDigest.sellerId) && C89219l.m154714a(this.orderSKUs, orderShopDigest.orderSKUs) && C89219l.m154714a(this.deliveryOption, orderShopDigest.deliveryOption) && C89219l.m154714a(this.logisticsServiceId, orderShopDigest.logisticsServiceId);
    }

    public final int hashCode() {
        String str = this.warehouseId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sellerId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<OrderSKUDTO> list = this.orderSKUs;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.deliveryOption;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.logisticsServiceId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "OrderShopDigest(warehouseId=" + this.warehouseId + ", sellerId=" + this.sellerId + ", orderSKUs=" + this.orderSKUs + ", deliveryOption=" + this.deliveryOption + ", logisticsServiceId=" + this.logisticsServiceId + ")";
    }

    public final Integer getDeliveryOption() {
        return this.deliveryOption;
    }

    public final String getLogisticsServiceId() {
        return this.logisticsServiceId;
    }

    public final List<OrderSKUDTO> getOrderSKUs() {
        return this.orderSKUs;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public final OrderShopDigest merge(OrderShopDigest orderShopDigest) {
        if (orderShopDigest == null) {
            return this;
        }
        String str = orderShopDigest.sellerId;
        if (str == null) {
            str = this.sellerId;
        }
        List<OrderSKUDTO> list = orderShopDigest.orderSKUs;
        if (list == null) {
            list = this.orderSKUs;
        }
        Integer num = orderShopDigest.deliveryOption;
        if (num == null) {
            num = this.deliveryOption;
        }
        String str2 = orderShopDigest.logisticsServiceId;
        if (str2 == null) {
            str2 = this.logisticsServiceId;
        }
        String str3 = orderShopDigest.warehouseId;
        if (str3 == null) {
            str3 = this.warehouseId;
        }
        return new OrderShopDigest(str3, str, list, num, str2);
    }

    public OrderShopDigest(String str, String str2, List<OrderSKUDTO> list, Integer num, String str3) {
        this.warehouseId = str;
        this.sellerId = str2;
        this.orderSKUs = list;
        this.deliveryOption = num;
        this.logisticsServiceId = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderShopDigest(String str, String str2, List list, Integer num, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, str2, list, num, str3);
    }
}
