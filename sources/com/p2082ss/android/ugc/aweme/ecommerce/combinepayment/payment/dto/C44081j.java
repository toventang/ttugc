package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.j */
public final class C44081j {
    @AbstractC27891c(mo46611a = "cashier")

    /* renamed from: a */
    public final C28022o f102775a;
    @AbstractC27891c(mo46611a = "jump_schema_url")

    /* renamed from: b */
    public final String f102776b;
    @AbstractC27891c(mo46611a = "new_pay_info")

    /* renamed from: c */
    public final C44077f f102777c;
    @AbstractC27891c(mo46611a = "address")

    /* renamed from: d */
    public final Address f102778d;
    @AbstractC27891c(mo46611a = "payment_methods")

    /* renamed from: e */
    public final C44089r f102779e;
    @AbstractC27891c(mo46611a = "payment_price")

    /* renamed from: f */
    public final List<C44090s> f102780f;
    @AbstractC27891c(mo46611a = "exception_ux")

    /* renamed from: g */
    public final ExceptionUX f102781g;

    static {
        Covode.recordClassIndex(52392);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44081j)) {
            return false;
        }
        C44081j jVar = (C44081j) obj;
        return C89219l.m154714a(this.f102775a, jVar.f102775a) && C89219l.m154714a(this.f102776b, jVar.f102776b) && C89219l.m154714a(this.f102777c, jVar.f102777c) && C89219l.m154714a(this.f102778d, jVar.f102778d) && C89219l.m154714a(this.f102779e, jVar.f102779e) && C89219l.m154714a(this.f102780f, jVar.f102780f) && C89219l.m154714a(this.f102781g, jVar.f102781g);
    }

    public final int hashCode() {
        C28022o oVar = this.f102775a;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        String str = this.f102776b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C44077f fVar = this.f102777c;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Address address = this.f102778d;
        int hashCode4 = (hashCode3 + (address != null ? address.hashCode() : 0)) * 31;
        C44089r rVar = this.f102779e;
        int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        List<C44090s> list = this.f102780f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        ExceptionUX exceptionUX = this.f102781g;
        if (exceptionUX != null) {
            i = exceptionUX.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "PayResponseData(cashier=" + this.f102775a + ", schema=" + this.f102776b + ", newPayInfo=" + this.f102777c + ", shippingAddress=" + this.f102778d + ", paymentMethodsData=" + this.f102779e + ", paymentPrice=" + this.f102780f + ", exceptionUX=" + this.f102781g + ")";
    }
}
