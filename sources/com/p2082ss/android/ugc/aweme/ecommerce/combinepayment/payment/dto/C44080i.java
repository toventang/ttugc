package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43858l;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.i */
public final class C44080i {
    @AbstractC27891c(mo46611a = "combo_Id")

    /* renamed from: a */
    public final String f102768a;
    @AbstractC27891c(mo46611a = "order_ids")

    /* renamed from: b */
    public final List<String> f102769b;
    @AbstractC27891c(mo46611a = "is_new_payment")

    /* renamed from: c */
    public final Boolean f102770c;
    @AbstractC27891c(mo46611a = "payment_method")

    /* renamed from: d */
    public final C44087p f102771d;
    @AbstractC27891c(mo46611a = "redirect_url")

    /* renamed from: e */
    public final String f102772e;
    @AbstractC27891c(mo46611a = "deeplink")

    /* renamed from: f */
    public final String f102773f;
    @AbstractC27891c(mo46611a = "pay_risk_control_param")

    /* renamed from: g */
    public final C43858l f102774g;

    static {
        Covode.recordClassIndex(52391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44080i)) {
            return false;
        }
        C44080i iVar = (C44080i) obj;
        return C89219l.m154714a(this.f102768a, iVar.f102768a) && C89219l.m154714a(this.f102769b, iVar.f102769b) && C89219l.m154714a(this.f102770c, iVar.f102770c) && C89219l.m154714a(this.f102771d, iVar.f102771d) && C89219l.m154714a(this.f102772e, iVar.f102772e) && C89219l.m154714a(this.f102773f, iVar.f102773f) && C89219l.m154714a(this.f102774g, iVar.f102774g);
    }

    public final int hashCode() {
        String str = this.f102768a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f102769b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.f102770c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        C44087p pVar = this.f102771d;
        int hashCode4 = (hashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str2 = this.f102772e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102773f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C43858l lVar = this.f102774g;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "PayRequest(comboId=" + this.f102768a + ", orderIds=" + this.f102769b + ", isNewPayment=" + this.f102770c + ", paymentMethod=" + this.f102771d + ", redirectUrl=" + this.f102772e + ", deepLink=" + this.f102773f + ", payRiskControlParam=" + this.f102774g + ")";
    }

    public /* synthetic */ C44080i(String str, List list, Boolean bool) {
        this(str, list, bool, null, null, null, null);
    }

    public C44080i(String str, List<String> list, Boolean bool, C44087p pVar, String str2, String str3, C43858l lVar) {
        this.f102768a = str;
        this.f102769b = list;
        this.f102770c = bool;
        this.f102771d = pVar;
        this.f102772e = str2;
        this.f102773f = str3;
        this.f102774g = lVar;
    }
}
