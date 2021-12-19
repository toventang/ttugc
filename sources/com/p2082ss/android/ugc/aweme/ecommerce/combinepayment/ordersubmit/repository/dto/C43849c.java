package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.c */
public final class C43849c {
    @AbstractC27891c(mo46611a = "trace_id")

    /* renamed from: a */
    public final String f102166a;
    @AbstractC27891c(mo46611a = "order_shop")

    /* renamed from: b */
    public final List<C43856j> f102167b;
    @AbstractC27891c(mo46611a = "price_info")

    /* renamed from: c */
    public final C43859m f102168c;
    @AbstractC27891c(mo46611a = "buyer_addr_id")

    /* renamed from: d */
    public final String f102169d;
    @AbstractC27891c(mo46611a = "vouchers")

    /* renamed from: e */
    public final List<C43866t> f102170e;
    @AbstractC27891c(mo46611a = "order_secret")

    /* renamed from: f */
    public final String f102171f;
    @AbstractC27891c(mo46611a = "is_new_payment")

    /* renamed from: g */
    public final Boolean f102172g;
    @AbstractC27891c(mo46611a = "payment_method")

    /* renamed from: h */
    public final C44087p f102173h;
    @AbstractC27891c(mo46611a = "redirect_url")

    /* renamed from: i */
    public final String f102174i;
    @AbstractC27891c(mo46611a = "deeplink")

    /* renamed from: j */
    public final String f102175j;
    @AbstractC27891c(mo46611a = "server_issued_params")

    /* renamed from: k */
    public final String f102176k;
    @AbstractC27891c(mo46611a = "activity_ids")

    /* renamed from: l */
    public final List<String> f102177l;
    @AbstractC27891c(mo46611a = "buy_type")

    /* renamed from: m */
    public final int f102178m;
    @AbstractC27891c(mo46611a = "pay_risk_control_param")

    /* renamed from: n */
    public final C43858l f102179n;
    @AbstractC27891c(mo46611a = "shipping_address")

    /* renamed from: o */
    public final Address f102180o;

    static {
        Covode.recordClassIndex(52129);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43849c)) {
            return false;
        }
        C43849c cVar = (C43849c) obj;
        return C89219l.m154714a(this.f102166a, cVar.f102166a) && C89219l.m154714a(this.f102167b, cVar.f102167b) && C89219l.m154714a(this.f102168c, cVar.f102168c) && C89219l.m154714a(this.f102169d, cVar.f102169d) && C89219l.m154714a(this.f102170e, cVar.f102170e) && C89219l.m154714a(this.f102171f, cVar.f102171f) && C89219l.m154714a(this.f102172g, cVar.f102172g) && C89219l.m154714a(this.f102173h, cVar.f102173h) && C89219l.m154714a(this.f102174i, cVar.f102174i) && C89219l.m154714a(this.f102175j, cVar.f102175j) && C89219l.m154714a(this.f102176k, cVar.f102176k) && C89219l.m154714a(this.f102177l, cVar.f102177l) && this.f102178m == cVar.f102178m && C89219l.m154714a(this.f102179n, cVar.f102179n) && C89219l.m154714a(this.f102180o, cVar.f102180o);
    }

    public final int hashCode() {
        String str = this.f102166a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C43856j> list = this.f102167b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C43859m mVar = this.f102168c;
        int hashCode3 = (hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        String str2 = this.f102169d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C43866t> list2 = this.f102170e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.f102171f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f102172g;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        C44087p pVar = this.f102173h;
        int hashCode8 = (hashCode7 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str4 = this.f102174i;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f102175j;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f102176k;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list3 = this.f102177l;
        int hashCode12 = (((hashCode11 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.f102178m) * 31;
        C43858l lVar = this.f102179n;
        int hashCode13 = (hashCode12 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Address address = this.f102180o;
        if (address != null) {
            i = address.hashCode();
        }
        return hashCode13 + i;
    }

    public final String toString() {
        return "CreateOrderRequest(traceId=" + this.f102166a + ", orderShop=" + this.f102167b + ", priceInfo=" + this.f102168c + ", buyerAddrId=" + this.f102169d + ", voucher=" + this.f102170e + ", orderSecret=" + this.f102171f + ", isNewPayment=" + this.f102172g + ", paymentMethod=" + this.f102173h + ", redirectUrl=" + this.f102174i + ", deepLink=" + this.f102175j + ", serverIssuedParams=" + this.f102176k + ", activityIds=" + this.f102177l + ", buyType=" + this.f102178m + ", payRiskControlParam=" + this.f102179n + ", shippingAddress=" + this.f102180o + ")";
    }

    private C43849c(String str, List<C43856j> list, C43859m mVar, String str2, List<C43866t> list2, String str3, Boolean bool, C44087p pVar, String str4, String str5, String str6, List<String> list3, int i, C43858l lVar, Address address) {
        this.f102166a = str;
        this.f102167b = list;
        this.f102168c = mVar;
        this.f102169d = str2;
        this.f102170e = list2;
        this.f102171f = str3;
        this.f102172g = bool;
        this.f102173h = pVar;
        this.f102174i = str4;
        this.f102175j = str5;
        this.f102176k = str6;
        this.f102177l = list3;
        this.f102178m = i;
        this.f102179n = lVar;
        this.f102180o = address;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C43849c(String str, List list, C43859m mVar, String str2, List list2, String str3, Boolean bool, C44087p pVar, String str4, String str5, String str6, List list3, int i, C43858l lVar, Address address, int i2) {
        this(str, list, mVar, str2, list2, str3, (i2 & 64) != 0 ? true : bool, pVar, str4, str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : list3, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) == 0 ? lVar : null, address);
    }
}
