package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitEnterParams */
public final class OrderSubmitEnterParams {
    public static final C43665a Companion = new C43665a((byte) 0);
    @AbstractC27891c(mo46611a = "billInfo")
    private final BillInfoResponse billInfoResp;
    @AbstractC27891c(mo46611a = "buy_type")
    private final int buyType;
    @AbstractC27891c(mo46611a = "chain_key")
    private final String chainKey;
    @AbstractC27891c(mo46611a = "combined_area")
    private final List<Region> combinedArea;
    @AbstractC27891c(mo46611a = "repo_id")
    private final String repoId;
    @AbstractC27891c(mo46611a = "requestParams")
    private final OrderSubmitRequestParam requestParams;
    @AbstractC27891c(mo46611a = "trackParams")
    private final HashMap<String, Object> trackParams;

    static {
        Covode.recordClassIndex(51925);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86664x63aa790b(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitEnterParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderSubmitEnterParams copy$default(OrderSubmitEnterParams orderSubmitEnterParams, OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List list, String str, HashMap hashMap, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            orderSubmitRequestParam = orderSubmitEnterParams.requestParams;
        }
        if ((i2 & 2) != 0) {
            billInfoResponse = orderSubmitEnterParams.billInfoResp;
        }
        if ((i2 & 4) != 0) {
            list = orderSubmitEnterParams.combinedArea;
        }
        if ((i2 & 8) != 0) {
            str = orderSubmitEnterParams.chainKey;
        }
        if ((i2 & 16) != 0) {
            hashMap = orderSubmitEnterParams.trackParams;
        }
        if ((i2 & 32) != 0) {
            str2 = orderSubmitEnterParams.repoId;
        }
        if ((i2 & 64) != 0) {
            i = orderSubmitEnterParams.buyType;
        }
        return orderSubmitEnterParams.copy(orderSubmitRequestParam, billInfoResponse, list, str, hashMap, str2, i);
    }

    public final OrderSubmitRequestParam component1() {
        return this.requestParams;
    }

    public final BillInfoResponse component2() {
        return this.billInfoResp;
    }

    public final List<Region> component3() {
        return this.combinedArea;
    }

    public final String component4() {
        return this.chainKey;
    }

    public final HashMap<String, Object> component5() {
        return this.trackParams;
    }

    public final String component6() {
        return this.repoId;
    }

    public final int component7() {
        return this.buyType;
    }

    public final OrderSubmitEnterParams copy(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List<Region> list, String str, HashMap<String, Object> hashMap, String str2, int i) {
        C89219l.m154721d(orderSubmitRequestParam, "");
        return new OrderSubmitEnterParams(orderSubmitRequestParam, billInfoResponse, list, str, hashMap, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitEnterParams)) {
            return false;
        }
        OrderSubmitEnterParams orderSubmitEnterParams = (OrderSubmitEnterParams) obj;
        return C89219l.m154714a(this.requestParams, orderSubmitEnterParams.requestParams) && C89219l.m154714a(this.billInfoResp, orderSubmitEnterParams.billInfoResp) && C89219l.m154714a(this.combinedArea, orderSubmitEnterParams.combinedArea) && C89219l.m154714a(this.chainKey, orderSubmitEnterParams.chainKey) && C89219l.m154714a(this.trackParams, orderSubmitEnterParams.trackParams) && C89219l.m154714a(this.repoId, orderSubmitEnterParams.repoId) && this.buyType == orderSubmitEnterParams.buyType;
    }

    public final int hashCode() {
        OrderSubmitRequestParam orderSubmitRequestParam = this.requestParams;
        int i = 0;
        int hashCode = (orderSubmitRequestParam != null ? orderSubmitRequestParam.hashCode() : 0) * 31;
        BillInfoResponse billInfoResponse = this.billInfoResp;
        int hashCode2 = (hashCode + (billInfoResponse != null ? billInfoResponse.hashCode() : 0)) * 31;
        List<Region> list = this.combinedArea;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.chainKey;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        HashMap<String, Object> hashMap = this.trackParams;
        int hashCode5 = (hashCode4 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        String str2 = this.repoId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode5 + i) * 31) + m86664x63aa790b(this.buyType);
    }

    public final String toString() {
        return "OrderSubmitEnterParams(requestParams=" + this.requestParams + ", billInfoResp=" + this.billInfoResp + ", combinedArea=" + this.combinedArea + ", chainKey=" + this.chainKey + ", trackParams=" + this.trackParams + ", repoId=" + this.repoId + ", buyType=" + this.buyType + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitEnterParams$a */
    public static final class C43665a {
        static {
            Covode.recordClassIndex(51926);
        }

        private C43665a() {
        }

        public /* synthetic */ C43665a(byte b) {
            this();
        }
    }

    public final BillInfoResponse getBillInfoResp() {
        return this.billInfoResp;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final List<Region> getCombinedArea() {
        return this.combinedArea;
    }

    public final String getRepoId() {
        return this.repoId;
    }

    public final OrderSubmitRequestParam getRequestParams() {
        return this.requestParams;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public OrderSubmitEnterParams(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List<Region> list, String str, HashMap<String, Object> hashMap, String str2, int i) {
        C89219l.m154721d(orderSubmitRequestParam, "");
        this.requestParams = orderSubmitRequestParam;
        this.billInfoResp = billInfoResponse;
        this.combinedArea = list;
        this.chainKey = str;
        this.trackParams = hashMap;
        this.repoId = str2;
        this.buyType = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderSubmitEnterParams(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List list, String str, HashMap hashMap, String str2, int i, int i2, C89214g gVar) {
        this(orderSubmitRequestParam, (i2 & 2) != 0 ? null : billInfoResponse, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : hashMap, (i2 & 32) == 0 ? str2 : null, (i2 & 64) != 0 ? 0 : i);
    }
}
