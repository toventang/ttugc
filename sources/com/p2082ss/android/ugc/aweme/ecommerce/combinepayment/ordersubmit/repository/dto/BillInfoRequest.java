package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest */
public final class BillInfoRequest implements Serializable {
    @AbstractC27891c(mo46611a = "activity_ids")
    private final List<String> activityIds;
    @AbstractC27891c(mo46611a = "buy_type")
    private final int buyType;
    @AbstractC27891c(mo46611a = "buyer_addr_id")
    private final String buyerAddrId;
    @AbstractC27891c(mo46611a = "claim_voucher_type_ids")
    private final List<String> claimVoucherTypeIds;
    @AbstractC27891c(mo46611a = "is_new_payment")
    private final boolean isNewPayment;
    @AbstractC27891c(mo46611a = "order_request_params")
    private final HashMap<String, Object> orderRequestParams;
    @AbstractC27891c(mo46611a = "order_shop")
    private final List<OrderShopDigest> orderShop;
    @AbstractC27891c(mo46611a = "payment_method")
    private final C44087p paymentMethod;
    @AbstractC27891c(mo46611a = "promotion_ids")
    private final List<String> promotionIds;
    @AbstractC27891c(mo46611a = "server_issued_params")
    private final String serverIssuedParams;
    @AbstractC27891c(mo46611a = "use_user_selection")
    private final Boolean useUserSelection;
    @AbstractC27891c(mo46611a = "with_address_input_item")
    private final boolean withAddressInputItem;
    @AbstractC27891c(mo46611a = "with_product_info")
    private final boolean withProductInfo;
    @AbstractC27891c(mo46611a = "with_seller_info")
    private final boolean withSellerInfo;
    @AbstractC27891c(mo46611a = "with_shipping_address")
    private final boolean withShippingAddress;

    static {
        Covode.recordClassIndex(52114);
    }

    public BillInfoRequest() {
        this(null, 0, null, false, false, false, false, null, null, null, false, null, null, null, null, 32767, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_BillInfoRequest_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86770xa33b89d8(int i) {
        return i;
    }

    public static /* synthetic */ BillInfoRequest copy$default(BillInfoRequest billInfoRequest, String str, int i, List list, boolean z, boolean z2, boolean z3, boolean z4, List list2, Boolean bool, List list3, boolean z5, C44087p pVar, HashMap hashMap, String str2, List list4, int i2, Object obj) {
        int i3 = i;
        String str3 = str;
        boolean z6 = z;
        List list5 = list;
        boolean z7 = z3;
        boolean z8 = z2;
        List list6 = list2;
        boolean z9 = z4;
        List list7 = list3;
        Boolean bool2 = bool;
        C44087p pVar2 = pVar;
        boolean z10 = z5;
        String str4 = str2;
        HashMap hashMap2 = hashMap;
        List list8 = list4;
        if ((i2 & 1) != 0) {
            str3 = billInfoRequest.buyerAddrId;
        }
        if ((i2 & 2) != 0) {
            i3 = billInfoRequest.buyType;
        }
        if ((i2 & 4) != 0) {
            list5 = billInfoRequest.orderShop;
        }
        if ((i2 & 8) != 0) {
            z6 = billInfoRequest.withProductInfo;
        }
        if ((i2 & 16) != 0) {
            z8 = billInfoRequest.withSellerInfo;
        }
        if ((i2 & 32) != 0) {
            z7 = billInfoRequest.withShippingAddress;
        }
        if ((i2 & 64) != 0) {
            z9 = billInfoRequest.withAddressInputItem;
        }
        if ((i2 & 128) != 0) {
            list6 = billInfoRequest.promotionIds;
        }
        if ((i2 & 256) != 0) {
            bool2 = billInfoRequest.useUserSelection;
        }
        if ((i2 & 512) != 0) {
            list7 = billInfoRequest.claimVoucherTypeIds;
        }
        if ((i2 & 1024) != 0) {
            z10 = billInfoRequest.isNewPayment;
        }
        if ((i2 & 2048) != 0) {
            pVar2 = billInfoRequest.paymentMethod;
        }
        if ((i2 & 4096) != 0) {
            hashMap2 = billInfoRequest.orderRequestParams;
        }
        if ((i2 & 8192) != 0) {
            str4 = billInfoRequest.serverIssuedParams;
        }
        if ((i2 & 16384) != 0) {
            list8 = billInfoRequest.activityIds;
        }
        return billInfoRequest.copy(str3, i3, list5, z6, z8, z7, z9, list6, bool2, list7, z10, pVar2, hashMap2, str4, list8);
    }

    public final String component1() {
        return this.buyerAddrId;
    }

    public final List<String> component10() {
        return this.claimVoucherTypeIds;
    }

    public final boolean component11() {
        return this.isNewPayment;
    }

    public final C44087p component12() {
        return this.paymentMethod;
    }

    public final HashMap<String, Object> component13() {
        return this.orderRequestParams;
    }

    public final String component14() {
        return this.serverIssuedParams;
    }

    public final List<String> component15() {
        return this.activityIds;
    }

    public final int component2() {
        return this.buyType;
    }

    public final List<OrderShopDigest> component3() {
        return this.orderShop;
    }

    public final boolean component4() {
        return this.withProductInfo;
    }

    public final boolean component5() {
        return this.withSellerInfo;
    }

    public final boolean component6() {
        return this.withShippingAddress;
    }

    public final boolean component7() {
        return this.withAddressInputItem;
    }

    public final List<String> component8() {
        return this.promotionIds;
    }

    public final Boolean component9() {
        return this.useUserSelection;
    }

    public final BillInfoRequest copy(String str, int i, List<OrderShopDigest> list, boolean z, boolean z2, boolean z3, boolean z4, List<String> list2, Boolean bool, List<String> list3, boolean z5, C44087p pVar, HashMap<String, Object> hashMap, String str2, List<String> list4) {
        return new BillInfoRequest(str, i, list, z, z2, z3, z4, list2, bool, list3, z5, pVar, hashMap, str2, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillInfoRequest)) {
            return false;
        }
        BillInfoRequest billInfoRequest = (BillInfoRequest) obj;
        return C89219l.m154714a(this.buyerAddrId, billInfoRequest.buyerAddrId) && this.buyType == billInfoRequest.buyType && C89219l.m154714a(this.orderShop, billInfoRequest.orderShop) && this.withProductInfo == billInfoRequest.withProductInfo && this.withSellerInfo == billInfoRequest.withSellerInfo && this.withShippingAddress == billInfoRequest.withShippingAddress && this.withAddressInputItem == billInfoRequest.withAddressInputItem && C89219l.m154714a(this.promotionIds, billInfoRequest.promotionIds) && C89219l.m154714a(this.useUserSelection, billInfoRequest.useUserSelection) && C89219l.m154714a(this.claimVoucherTypeIds, billInfoRequest.claimVoucherTypeIds) && this.isNewPayment == billInfoRequest.isNewPayment && C89219l.m154714a(this.paymentMethod, billInfoRequest.paymentMethod) && C89219l.m154714a(this.orderRequestParams, billInfoRequest.orderRequestParams) && C89219l.m154714a(this.serverIssuedParams, billInfoRequest.serverIssuedParams) && C89219l.m154714a(this.activityIds, billInfoRequest.activityIds);
    }

    public final int hashCode() {
        String str = this.buyerAddrId;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m86770xa33b89d8(this.buyType)) * 31;
        List<OrderShopDigest> list = this.orderShop;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.withProductInfo;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.withSellerInfo;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.withShippingAddress;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.withAddressInputItem;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        List<String> list2 = this.promotionIds;
        int hashCode3 = (i18 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.useUserSelection;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<String> list3 = this.claimVoucherTypeIds;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        if (!this.isNewPayment) {
            i2 = 0;
        }
        int i19 = (hashCode5 + i2) * 31;
        C44087p pVar = this.paymentMethod;
        int hashCode6 = (i19 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        HashMap<String, Object> hashMap = this.orderRequestParams;
        int hashCode7 = (hashCode6 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        String str2 = this.serverIssuedParams;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list4 = this.activityIds;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "BillInfoRequest(buyerAddrId=" + this.buyerAddrId + ", buyType=" + this.buyType + ", orderShop=" + this.orderShop + ", withProductInfo=" + this.withProductInfo + ", withSellerInfo=" + this.withSellerInfo + ", withShippingAddress=" + this.withShippingAddress + ", withAddressInputItem=" + this.withAddressInputItem + ", promotionIds=" + this.promotionIds + ", useUserSelection=" + this.useUserSelection + ", claimVoucherTypeIds=" + this.claimVoucherTypeIds + ", isNewPayment=" + this.isNewPayment + ", paymentMethod=" + this.paymentMethod + ", orderRequestParams=" + this.orderRequestParams + ", serverIssuedParams=" + this.serverIssuedParams + ", activityIds=" + this.activityIds + ")";
    }

    public final List<String> getActivityIds() {
        return this.activityIds;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final String getBuyerAddrId() {
        return this.buyerAddrId;
    }

    public final List<String> getClaimVoucherTypeIds() {
        return this.claimVoucherTypeIds;
    }

    public final HashMap<String, Object> getOrderRequestParams() {
        return this.orderRequestParams;
    }

    public final List<OrderShopDigest> getOrderShop() {
        return this.orderShop;
    }

    public final C44087p getPaymentMethod() {
        return this.paymentMethod;
    }

    public final List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public final String getServerIssuedParams() {
        return this.serverIssuedParams;
    }

    public final Boolean getUseUserSelection() {
        return this.useUserSelection;
    }

    public final boolean getWithAddressInputItem() {
        return this.withAddressInputItem;
    }

    public final boolean getWithProductInfo() {
        return this.withProductInfo;
    }

    public final boolean getWithSellerInfo() {
        return this.withSellerInfo;
    }

    public final boolean getWithShippingAddress() {
        return this.withShippingAddress;
    }

    public final boolean isNewPayment() {
        return this.isNewPayment;
    }

    public BillInfoRequest(String str, int i, List<OrderShopDigest> list, boolean z, boolean z2, boolean z3, boolean z4, List<String> list2, Boolean bool, List<String> list3, boolean z5, C44087p pVar, HashMap<String, Object> hashMap, String str2, List<String> list4) {
        this.buyerAddrId = str;
        this.buyType = i;
        this.orderShop = list;
        this.withProductInfo = z;
        this.withSellerInfo = z2;
        this.withShippingAddress = z3;
        this.withAddressInputItem = z4;
        this.promotionIds = list2;
        this.useUserSelection = bool;
        this.claimVoucherTypeIds = list3;
        this.isNewPayment = z5;
        this.paymentMethod = pVar;
        this.orderRequestParams = hashMap;
        this.serverIssuedParams = str2;
        this.activityIds = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BillInfoRequest(String str, int i, List list, boolean z, boolean z2, boolean z3, boolean z4, List list2, Boolean bool, List list3, boolean z5, C44087p pVar, HashMap hashMap, String str2, List list4, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? true : z4, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : list3, (i2 & 1024) == 0 ? z5 : true, (i2 & 2048) != 0 ? null : pVar, (i2 & 4096) != 0 ? null : hashMap, (i2 & 8192) != 0 ? null : str2, (i2 & 16384) == 0 ? list4 : null);
    }
}
