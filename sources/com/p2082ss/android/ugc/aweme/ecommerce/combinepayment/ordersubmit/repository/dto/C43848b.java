package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44077f;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b */
public final class C43848b {
    @AbstractC27891c(mo46611a = "order_ids")

    /* renamed from: a */
    public final List<String> f102159a;
    @AbstractC27891c(mo46611a = "jump_schema_url")

    /* renamed from: b */
    public final String f102160b;
    @AbstractC27891c(mo46611a = "cashier")

    /* renamed from: c */
    public final C28022o f102161c;
    @AbstractC27891c(mo46611a = "exception_ux")

    /* renamed from: d */
    public final ExceptionUX f102162d;
    @AbstractC27891c(mo46611a = "new_pay_info")

    /* renamed from: e */
    public final C44077f f102163e;
    @AbstractC27891c(mo46611a = "combo_id")

    /* renamed from: f */
    public final String f102164f;
    @AbstractC27891c(mo46611a = "miss_cashback")

    /* renamed from: g */
    public final Boolean f102165g;

    static {
        Covode.recordClassIndex(52128);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43848b)) {
            return false;
        }
        C43848b bVar = (C43848b) obj;
        return C89219l.m154714a(this.f102159a, bVar.f102159a) && C89219l.m154714a(this.f102160b, bVar.f102160b) && C89219l.m154714a(this.f102161c, bVar.f102161c) && C89219l.m154714a(this.f102162d, bVar.f102162d) && C89219l.m154714a(this.f102163e, bVar.f102163e) && C89219l.m154714a(this.f102164f, bVar.f102164f) && C89219l.m154714a(this.f102165g, bVar.f102165g);
    }

    public final int hashCode() {
        List<String> list = this.f102159a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f102160b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C28022o oVar = this.f102161c;
        int hashCode3 = (hashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        ExceptionUX exceptionUX = this.f102162d;
        int hashCode4 = (hashCode3 + (exceptionUX != null ? exceptionUX.hashCode() : 0)) * 31;
        C44077f fVar = this.f102163e;
        int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str2 = this.f102164f;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f102165g;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "CreateOrderData(orderIds=" + this.f102159a + ", jumpSchema_url=" + this.f102160b + ", cashier=" + this.f102161c + ", exceptionUX=" + this.f102162d + ", newPayInfo=" + this.f102163e + ", comboId=" + this.f102164f + ", missCashback=" + this.f102165g + ")";
    }
}
