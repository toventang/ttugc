package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.AddressItem;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Promotion;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData */
public final class BillInfoData {
    @AbstractC27891c(mo46611a = "address_input_item")
    private final InputItemData addressInputItemData;
    @AbstractC27891c(mo46611a = "announcements")
    private final List<Announcement> announcement;
    @AbstractC27891c(mo46611a = "bottom_notice")
    private final C43855i bottomNotice;
    @AbstractC27891c(mo46611a = "exception_ux")
    private final ExceptionUX exceptionUX;
    @AbstractC27891c(mo46611a = "order_secret")
    private final String orderSecret;
    @AbstractC27891c(mo46611a = "payment_methods")
    private final C44089r paymentMethods;
    @AbstractC27891c(mo46611a = "schema_info")
    private final C43852f schemaInfo;
    @AbstractC27891c(mo46611a = "shipping_address")
    private final ShippingAddress shippingAddress;
    @AbstractC27891c(mo46611a = "shop_orders")
    private final List<ShopOrder> shopOrders;
    @AbstractC27891c(mo46611a = "summary")
    private final Summary summary;
    @AbstractC27891c(mo46611a = "voucher_info")
    private final VoucherInfo voucherInfo;

    static {
        Covode.recordClassIndex(52113);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillInfoData copy$default(BillInfoData billInfoData, List list, List list2, Summary summary2, ShippingAddress shippingAddress2, ExceptionUX exceptionUX2, InputItemData inputItemData, C44089r rVar, VoucherInfo voucherInfo2, String str, C43852f fVar, C43855i iVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = billInfoData.announcement;
        }
        if ((i & 2) != 0) {
            list2 = billInfoData.shopOrders;
        }
        if ((i & 4) != 0) {
            summary2 = billInfoData.summary;
        }
        if ((i & 8) != 0) {
            shippingAddress2 = billInfoData.shippingAddress;
        }
        if ((i & 16) != 0) {
            exceptionUX2 = billInfoData.exceptionUX;
        }
        if ((i & 32) != 0) {
            inputItemData = billInfoData.addressInputItemData;
        }
        if ((i & 64) != 0) {
            rVar = billInfoData.paymentMethods;
        }
        if ((i & 128) != 0) {
            voucherInfo2 = billInfoData.voucherInfo;
        }
        if ((i & 256) != 0) {
            str = billInfoData.orderSecret;
        }
        if ((i & 512) != 0) {
            fVar = billInfoData.schemaInfo;
        }
        if ((i & 1024) != 0) {
            iVar = billInfoData.bottomNotice;
        }
        return billInfoData.copy(list, list2, summary2, shippingAddress2, exceptionUX2, inputItemData, rVar, voucherInfo2, str, fVar, iVar);
    }

    public final List<Announcement> component1() {
        return this.announcement;
    }

    public final C43852f component10() {
        return this.schemaInfo;
    }

    public final C43855i component11() {
        return this.bottomNotice;
    }

    public final List<ShopOrder> component2() {
        return this.shopOrders;
    }

    public final Summary component3() {
        return this.summary;
    }

    public final ShippingAddress component4() {
        return this.shippingAddress;
    }

    public final ExceptionUX component5() {
        return this.exceptionUX;
    }

    public final InputItemData component6() {
        return this.addressInputItemData;
    }

    public final C44089r component7() {
        return this.paymentMethods;
    }

    public final VoucherInfo component8() {
        return this.voucherInfo;
    }

    public final String component9() {
        return this.orderSecret;
    }

    public final BillInfoData copy(List<Announcement> list, List<ShopOrder> list2, Summary summary2, ShippingAddress shippingAddress2, ExceptionUX exceptionUX2, InputItemData inputItemData, C44089r rVar, VoucherInfo voucherInfo2, String str, C43852f fVar, C43855i iVar) {
        return new BillInfoData(list, list2, summary2, shippingAddress2, exceptionUX2, inputItemData, rVar, voucherInfo2, str, fVar, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillInfoData)) {
            return false;
        }
        BillInfoData billInfoData = (BillInfoData) obj;
        return C89219l.m154714a(this.announcement, billInfoData.announcement) && C89219l.m154714a(this.shopOrders, billInfoData.shopOrders) && C89219l.m154714a(this.summary, billInfoData.summary) && C89219l.m154714a(this.shippingAddress, billInfoData.shippingAddress) && C89219l.m154714a(this.exceptionUX, billInfoData.exceptionUX) && C89219l.m154714a(this.addressInputItemData, billInfoData.addressInputItemData) && C89219l.m154714a(this.paymentMethods, billInfoData.paymentMethods) && C89219l.m154714a(this.voucherInfo, billInfoData.voucherInfo) && C89219l.m154714a(this.orderSecret, billInfoData.orderSecret) && C89219l.m154714a(this.schemaInfo, billInfoData.schemaInfo) && C89219l.m154714a(this.bottomNotice, billInfoData.bottomNotice);
    }

    public final int hashCode() {
        List<Announcement> list = this.announcement;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ShopOrder> list2 = this.shopOrders;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Summary summary2 = this.summary;
        int hashCode3 = (hashCode2 + (summary2 != null ? summary2.hashCode() : 0)) * 31;
        ShippingAddress shippingAddress2 = this.shippingAddress;
        int hashCode4 = (hashCode3 + (shippingAddress2 != null ? shippingAddress2.hashCode() : 0)) * 31;
        ExceptionUX exceptionUX2 = this.exceptionUX;
        int hashCode5 = (hashCode4 + (exceptionUX2 != null ? exceptionUX2.hashCode() : 0)) * 31;
        InputItemData inputItemData = this.addressInputItemData;
        int hashCode6 = (hashCode5 + (inputItemData != null ? inputItemData.hashCode() : 0)) * 31;
        C44089r rVar = this.paymentMethods;
        int hashCode7 = (hashCode6 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        VoucherInfo voucherInfo2 = this.voucherInfo;
        int hashCode8 = (hashCode7 + (voucherInfo2 != null ? voucherInfo2.hashCode() : 0)) * 31;
        String str = this.orderSecret;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 31;
        C43852f fVar = this.schemaInfo;
        int hashCode10 = (hashCode9 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C43855i iVar = this.bottomNotice;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "BillInfoData(announcement=" + this.announcement + ", shopOrders=" + this.shopOrders + ", summary=" + this.summary + ", shippingAddress=" + this.shippingAddress + ", exceptionUX=" + this.exceptionUX + ", addressInputItemData=" + this.addressInputItemData + ", paymentMethods=" + this.paymentMethods + ", voucherInfo=" + this.voucherInfo + ", orderSecret=" + this.orderSecret + ", schemaInfo=" + this.schemaInfo + ", bottomNotice=" + this.bottomNotice + ")";
    }

    public final InputItemData getAddressInputItemData() {
        return this.addressInputItemData;
    }

    public final List<Announcement> getAnnouncement() {
        return this.announcement;
    }

    public final C43855i getBottomNotice() {
        return this.bottomNotice;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final String getOrderSecret() {
        return this.orderSecret;
    }

    public final C44089r getPaymentMethods() {
        return this.paymentMethods;
    }

    public final C43852f getSchemaInfo() {
        return this.schemaInfo;
    }

    public final ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final List<ShopOrder> getShopOrders() {
        return this.shopOrders;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final VoucherInfo getVoucherInfo() {
        return this.voucherInfo;
    }

    public final String getBuyerAddressId() {
        Address shippingAddress2;
        ShippingAddress shippingAddress3 = this.shippingAddress;
        if (shippingAddress3 == null || (shippingAddress2 = shippingAddress3.getShippingAddress()) == null) {
            return null;
        }
        return shippingAddress2.f101187a;
    }

    public final boolean isEmpty() {
        if (this.shopOrders == null && this.summary == null && this.shippingAddress == null) {
            return true;
        }
        return false;
    }

    public final String getTotal() {
        Price total;
        String priceStr;
        Summary summary2 = this.summary;
        if (summary2 == null || (total = summary2.getTotal()) == null || (priceStr = total.getPriceStr()) == null) {
            return "";
        }
        return priceStr;
    }

    public final boolean hasAddress() {
        List<AddressItem> list;
        Address shippingAddress2;
        ShippingAddress shippingAddress3 = this.shippingAddress;
        if (shippingAddress3 == null || (shippingAddress2 = shippingAddress3.getShippingAddress()) == null) {
            list = null;
        } else {
            list = shippingAddress2.f101188b;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final int getTotalItems() {
        int i;
        List<ShopOrder> list = this.shopOrders;
        int i2 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                List<PackedSku> packedSkus = it.next().getPackedSkus();
                if (packedSkus != null) {
                    i = packedSkus.size();
                } else {
                    i = 0;
                }
                i2 += i;
            }
        }
        return i2;
    }

    public final boolean reachableAny() {
        List<ShopOrder> list = this.shopOrders;
        if (list == null || ((list instanceof Collection) && list.isEmpty())) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) it.next().getReachable(), (Object) true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasPromotion() {
        Price total;
        List<Promotion> promotions;
        Price total2;
        List<Promotion> promotions2;
        Price realPrice;
        List<Promotion> promotions3;
        List<ShopOrder> list = this.shopOrders;
        if (list != null) {
            for (T t : list) {
                List<PackedSku> packedSkus = t.getPackedSkus();
                if (packedSkus != null) {
                    Iterator<T> it = packedSkus.iterator();
                    while (it.hasNext()) {
                        SkuPrice price = it.next().getPrice();
                        if (!(price == null || (realPrice = price.getRealPrice()) == null || (promotions3 = realPrice.getPromotions()) == null || promotions3.isEmpty())) {
                            return true;
                        }
                    }
                }
                ShopBill shopBill = t.getShopBill();
                if (!(shopBill == null || (total2 = shopBill.getTotal()) == null || (promotions2 = total2.getPromotions()) == null || promotions2.isEmpty())) {
                    return true;
                }
            }
        }
        Summary summary2 = this.summary;
        if (summary2 == null || (total = summary2.getTotal()) == null || (promotions = total.getPromotions()) == null || promotions.isEmpty()) {
            return false;
        }
        return true;
    }

    public final BillInfoData merge(BillInfoData billInfoData, BillInfoRequest billInfoRequest) {
        ArrayList arrayList;
        Summary summary2;
        ShippingAddress shippingAddress2;
        T t;
        ShopOrder merge;
        C89219l.m154721d(billInfoRequest, "");
        if (billInfoData == null) {
            return this;
        }
        List<ShopOrder> list = billInfoData.shopOrders;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t2 : list) {
                List<ShopOrder> list2 = this.shopOrders;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        T t3 = t;
                        if (C89219l.m154714a((Object) t3.getSellerId(), (Object) t2.getSellerId()) && C89219l.m154714a((Object) t3.getWarehouseId(), (Object) t2.getWarehouseId())) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (!(t4 == null || (merge = t4.merge(t2, billInfoRequest)) == null)) {
                        t2 = merge;
                    }
                }
                arrayList2.add(t2);
            }
            arrayList = arrayList2;
        } else {
            arrayList = this.shopOrders;
        }
        List<Announcement> list3 = billInfoData.announcement;
        if (list3 == null) {
            list3 = this.announcement;
        }
        Summary summary3 = this.summary;
        if (summary3 == null || (summary2 = summary3.merge(billInfoData.summary)) == null) {
            summary2 = billInfoData.summary;
        }
        if (billInfoRequest.getWithShippingAddress()) {
            shippingAddress2 = billInfoData.shippingAddress;
        } else {
            ShippingAddress shippingAddress3 = this.shippingAddress;
            if (shippingAddress3 == null || (shippingAddress2 = shippingAddress3.merge(billInfoData.shippingAddress)) == null) {
                shippingAddress2 = billInfoData.shippingAddress;
            }
        }
        ExceptionUX exceptionUX2 = billInfoData.exceptionUX;
        InputItemData inputItemData = billInfoData.addressInputItemData;
        C44089r rVar = billInfoData.paymentMethods;
        if (rVar == null) {
            rVar = this.paymentMethods;
        }
        VoucherInfo voucherInfo2 = billInfoData.voucherInfo;
        String str = billInfoData.orderSecret;
        C43852f fVar = billInfoData.schemaInfo;
        if (fVar == null) {
            fVar = this.schemaInfo;
        }
        C43855i iVar = billInfoData.bottomNotice;
        if (iVar == null) {
            iVar = this.bottomNotice;
        }
        return new BillInfoData(list3, arrayList, summary2, shippingAddress2, exceptionUX2, inputItemData, rVar, voucherInfo2, str, fVar, iVar);
    }

    public final List<OrderShopDigest> getShopOrderDigestList(int i, String str, int i2) {
        T t;
        String str2;
        ArrayList arrayList = new ArrayList();
        List<ShopOrder> list = this.shopOrders;
        if (list != null) {
            for (T t2 : list) {
                String sellerId = t2.getSellerId();
                ArrayList arrayList2 = new ArrayList();
                List<PackedSku> packedSkus = t2.getPackedSkus();
                if (packedSkus != null) {
                    for (T t3 : packedSkus) {
                        String productId = t3.getProductId();
                        String skuId = t3.getSkuId();
                        Integer valueOf = Integer.valueOf(C43857k.m86773a(t3));
                        String cartItemId = t3.getCartItemId();
                        Integer valueOf2 = Integer.valueOf(i);
                        String sourceInfo = t3.getSourceInfo();
                        if (i2 == 1) {
                            str2 = t3.getEntranceInfo();
                        } else {
                            str2 = str;
                        }
                        arrayList2.add(new OrderSKUDTO(productId, skuId, valueOf, cartItemId, valueOf2, sourceInfo, str2, t3.getChainKey(), null, 256));
                    }
                }
                List<LogisticDTO> logistics = t2.getLogistics();
                Integer num = null;
                if (logistics != null) {
                    Iterator<T> it = logistics.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C89219l.m154714a((Object) t.f103624k, (Object) t2.getSelectedLogisticsServiceId())) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        num = Integer.valueOf(t4.f103614a);
                    }
                }
                arrayList.add(new OrderShopDigest(t2.getWarehouseId(), sellerId, arrayList2, num, t2.getSelectedLogisticsServiceId()));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getShopOrderDigestList$default(BillInfoData billInfoData, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        return billInfoData.getShopOrderDigestList(i, str, i2);
    }

    public BillInfoData(List<Announcement> list, List<ShopOrder> list2, Summary summary2, ShippingAddress shippingAddress2, ExceptionUX exceptionUX2, InputItemData inputItemData, C44089r rVar, VoucherInfo voucherInfo2, String str, C43852f fVar, C43855i iVar) {
        this.announcement = list;
        this.shopOrders = list2;
        this.summary = summary2;
        this.shippingAddress = shippingAddress2;
        this.exceptionUX = exceptionUX2;
        this.addressInputItemData = inputItemData;
        this.paymentMethods = rVar;
        this.voucherInfo = voucherInfo2;
        this.orderSecret = str;
        this.schemaInfo = fVar;
        this.bottomNotice = iVar;
    }
}
